%% Exponencial Positiva
%% Programa dividido em tr�s partes
%% 
%% Parte I   : determina a s�rie de Fourier onda Delta(t)
%% Parte II  : compara resultado computacional com resultado anal�tico
%% Parte III : Determina s�ntese de resultado compuacional/ anal�tico para o caso
%%           : g(t) = Delta(t-1) - Delta(t-3) 
%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%% %%%%%%%%%%%%%%%%%%%%%%
clear all;
clc;
close all;
pkg load symbolic;                    
% Usado somente para Octave
%%%%%%%%%%%%%%%%%%%%%% Parte I 
%%%%%%%%%%%%%%%%%%%%%%%%%% Nesta parte vamos determinar a s�rie de Fourier
%% para a onda triangular da Equa��o 5%%%%%%%%%%%%%
%%%%%%%%%%% Parte I %%%%%%%%%%%%%%%%%%%
%%%%% Definindo o sinal triangular - Delta(t) 
Deltap = @(t) (t+1);
Deltan = @(t) (-t+1);
To = 2;
fo = inv(To);
wo = 2*pi*fo; 
N = 10; 
n=[-N:1:N]; 
f = n*fo;
%%% Vetor tempo para visualiza��o do sinal
%%% diferente da vari�vel simb�lica t
%%% para efeito de organiza��o da solu��o
%%% existem outros caminhos 
M = 1000; 
Ts = To/M; 
tempo = [-To:Ts:To];                        
% Tr�s per�odos do sinal
%% Determinando o termo Dn simbolicamente
syms n t
Dn = inv(To)*int(Deltap.*exp(-j*n*wo*t),t,-1,0)+inv(To)*int(Deltan.*exp(-j*n*wo*t),t,0,1);
D_o = inv(To)*int(Deltap,t,-1,0)+inv(To)*int(Deltan,t,0,1);
%% Determinando o termo Dn numericamente
n=[-N:1:N]; 
Dn = eval(Dn);
D_o = eval(D_o);      
% Corrigindo o valor m�dio (NaN devido a indetermina��o)
Dn(N+1) = D_o;        
% Subistituindo no vetor de respostas
%% Visualizando o espector de Amplitude 
figure(1) 
stem(f,abs(Dn),"linewidth", 3);                          
% Na frequ�ncia o sinal � discretotitle('Serie de Fourier do sinal g(t)');
xlabel('Frequencia em Hz');
ylabel('Amplitude em  volts')
grid;
set(gca, "linewidth", 3, "fontsize", 23)
%% Sintetizando o sinal
n=[-N:1:N];
aux  = 0;             
for k = 0 : 2*N          
  aux = aux + Dn(k+1)*exp(j*n(k+1)*wo*tempo);  
end

gr = aux;
%% Visualizando o sinal reconstruido
figure(2)
plot(tempo,gr,"linewidth", 3)
title('Reconstrucao do sinal g(t)');
xlabel('Tempo em segundos');
ylabel('Amplitude em  volts')
grid;
set(gca, "linewidth", 3, "fontsize", 23)
%% Determinando a pot�ncia do sinal g(t)
Pg = inv(To)*int((t+1)^2,t,-1,0)+inv(To)*int((-t+1)^2,t,0,1)
Pg = eval(Pg)
%%% Verifica a pot�ncia pelo teorema de Paserval
%% -4 -3 -2 -1 0 1 2 3 4 --. N = 4
%%  D-n em m�dulo � igual a Dn
%%  2 * abs(Dn)
%%  n = 0  --> D(N+1) � um n�mero
%%  Dn(N+2:end) --> vetor (vetor).^2
PN = cumsum([1*Dn(N+1)^2  2*abs(Dn(N+2:end)).^2])
%% Acumula os valores elemento a elemento
figure(3)
plot(f(N+1:end),PN,f(N+1:end),ones(1,N+1)*Pg, "linewidth", 3)
title('Potencia total e em funcao do harmonico');
xlabel('Frequencia em Hz');
ylabel('Potencia em W')
grid;
set(gca, "linewidth", 3, "fontsize", 23)
%%%%%%%%%%%%%%%%%%%%%% Parte II %%%%%%%%%%%%%%%%%%%%%%%%
%
% Utiliza o resultado anal�tico%% %%%%%%%%%%%%%%%%%%%
%%%%% %%%%%%%% %%%%%%%%%%%%
%%%%%%%%%%%% Utilizando o termo Dn determinado analiticamente
D = @(n,wo) 0.5*sinc(n*wo/(2*pi)).^2;     
% o pi � necess�rio pois est� incorporado         
                           
                           
% na Fun��o Sinc(x)
% help Sinc                     
               
               
%-- sinc (X) 
%     Compute the sinc function.%
%      Return sin (pi*x) / (pi*x).
%% Determinando o termo Dn numericamente
n=[-N:1:N]; 
Dn = D(n,wo);
%% N�o s�o necess�rias as corre��es abaixo pois temos a fun��o sinc definida
%% comentar as linhas
% D_o = eval(D_o)      
% Corrigindo o valor m�dio (NaN devido a indetermina��o)
% Dn(N+1) = D_o        
% Subistituindo no vetor de respostas
%% Visualizando o espector de Amplitude 
figure(4) 
stem(f,abs(Dn),"linewidth", 3);                          
% Na frequ�ncia o sinal � discreto
title('Serie de Fourier do sinal g(t)');
xlabel('Frequencia em Hz');
ylabel('Amplitude em  volts')
grid;
set(gca, "linewidth", 3, "fontsize", 23)
%% Sintetizando o sinal
n=[-N:1:N];
aux  = 0;             
for k = 0 : 2*N          
  aux = aux + Dn(k+1)*exp(j*n(k+1)*wo*tempo);  
end
gra = aux;
%% Visualizando o sinal reconstruido
figure(5)
subplot(1,2,1);
plot(tempo,gr,"linewidth", 3,tempo,gra,"linewidth", 3); 
title('Reconstrucao do sinal g(t) - computacional');
xlabel('Tempo em segundos');
ylabel('Amplitude em  volts')
grid;
set(gca, "linewidth", 3, "fontsize", 23)
subplot(1,2,2);
plot(tempo,gra,"linewidth", 3); 
title('Reconstrucao do sinal g(t) - anal�tico');
xlabel('Tempo em segundos');
ylabel('Amplitude em  volts')
grid;
set(gca, "linewidth", 3, "fontsize", 23)
%%%%%%%%%%%%%%%%%%%%%% Parte III %%%%%%%%%%%%%%%
%%%%%%%%%%% Analisa g(t) em ambos os m�todos%% %%%%%%%%%%%%%%%%%%
%%%%%% %%%%%%%%% %%%%%%%%%%%%%%
%%%%%%%%%% O primeiro sinal est� atrasado de 1 segundo e o segundo de 3 segundos
to1 = 1;
to2 = 3;
%% Utilizando o termo Dn determinado analiticamente
D = @(n,wo) 0.5*sinc(n*wo/(2*pi)).^2;     
% o pi � necess�rio pois est� incorporado                                    
% na Fun��o Sinc(x)
% help Sinc                                    
%-- sinc (X) 
%     Compute the sinc function.
%%      Return sin (pi*x) / (pi*x).
%% Determinando o termo Dn numericamente
n=[-N:1:N]; 
Dn = D(n,wo);
%% N�o s�o necess�rias as corre��es abaixo pois temos a fun��o sinc definida
%% comentar as linhas
% D_o = eval(D_o)      
% Corrigindo o valor m�dio (NaN devido a indetermina��o)
% Dn(N+1) = D_o        
% Subistituindo no vetor de respostas
%% Visualizando o espector de Amplitude 
figure(6) 
stem(f,abs(Dn),"linewidth", 3);                          
% Na frequ�ncia o sinal � discreto
title('Serie de Fourier do sinal g(t)');
xlabel('Frequencia em Hz');
ylabel('Amplitude em  volts')
grid;
set(gca, "linewidth", 3, "fontsize", 23)
%% Sintetizando o sinal
n=[-N:1:N];
aux  = 0;             
%% Observe que o per�odo � o dobro para o sinal g(t)
%% To = 4 segundo e n�o 2 segundos como anteriormente
%% Neste sentido precisamos acertar wo
wog = wo/2;
for k = 0 : 2*N          
  delta1 = Dn(k+1)*exp(-j*n(k+1)*wog*to1);  
  delta3 = -Dn(k+1)*exp(-j*n(k+1)*wog*to2);  
  soma = delta1 + delta3;  
  aux = aux + soma*exp(j*n(k+1)*wog*tempo);  
end
grt = aux;
%% Visualizando o sinal reconstruido
figure(7)
subplot(1,2,1);
plot(tempo,gra,"linewidth", 3,tempo,gra,"linewidth", 3); 
title('Reconstrucao do sinal g(t) - computacional');
xlabel('Tempo em segundos');
ylabel('Amplitude em  volts')
grid;
set(gca, "linewidth", 3, "fontsize", 23)
subplot(1,2,2);
plot(tempo,grt,"linewidth", 3); 
title('Reconstrucao do sinal g(t) - anal�tico');
xlabel('Tempo em segundos');
ylabel('Amplitude em  volts')
grid;
set(gca, "linewidth", 3, "fontsize", 23)  
