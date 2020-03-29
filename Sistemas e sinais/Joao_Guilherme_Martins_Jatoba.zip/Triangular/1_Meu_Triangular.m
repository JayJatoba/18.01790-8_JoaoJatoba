%% Adaptado do professor Vanderlei Cunha Parro do Instituto Mau� de Tecnologia
%% https://github.com/vparro/sinais



%% Para fazer este c�digo, percebi que o exerc�cio, pelo menos a teoria era muito 
%% parecido com o anterior (Exponencial negativa), por isso peguei o c�digo deste, 
%% e modifiquei o necess�rio para que desse certo. 

%% Triangular
%%%%%%%%%%%%% Parte 1 %%%%%%%%%%%
clear all;
clc;
close all;
pkg load symbolic;

%% Definindo o sinal a ser estudado

 gt1 = @(t) (1+t);
 gt2 = @(t) (-t+1);
 To = 2;
 fo = inv(To);
 wo = 2*pi*fo;
 T1 = 0;
 T2 = 1.0;
 N = 10;
 n=[-N:1:N];
 f = n*fo;

%%% Vetor tempo para visualiza��o do sinal
%%% diferente da vari�vel simb�lica t
%%% para efeito de organiza��o da solu��o


M = 1000;
Ts = To/M;
tempo1 = [-1:Ts:T1];                  
% Tr�s per�odos do sinal
tempo2 = [0:Ts:T2];                
% Modifica ao vetor tempo
tempo  = [0:Ts:To];                  
% tempo para sintese - 1 per�odo
 
%% Visualizando o sinal gt completo

figure(1)

plot(tempo1,gt1(tempo1),tempo2,gt2(tempo2))
title('Sinal g(t)')
xlabel('Tempo em segundos')
ylabel('Amplitude em volts')

%% Determinando o valor m�dio

syms n t

D_o = inv(To)*int(gt1,t,-1,T1) + inv(To)*int(gt2,t,T1,T2);
Dn1 = inv(To)*int(gt1.*exp(-j*n*wo*t),t,-1,T1);
Dn2 = inv(To)*int(gt2.*exp(-j*n*wo*t),t,T1,T2);


%% Determinando valores num�ricos

n = [[-N:1:-1] [1:1:N]];
Dn1 = eval(Dn1)
Dn2 = eval(Dn2)

Dn =  Dn1+Dn2
D_o = eval(D_o)
Dn = [Dn(1:N) D_o Dn(N+1:2*N)];


%% Visualizando o espector de Amplitude
 
figure(2) 
stem(f,abs(Dn)); 
title('S�rie de Fourier do sinal g(t)');
xlabel('Frequ�ncia em Hz');
ylabel('Amplitude em  volts')

%% Sintetizando o sinal

n=[-N:1:N];
aux  = 0;             


for k = 0 : 2*N      
  
  aux = aux + Dn(k+1)*exp(j*n(k+1)*wo*tempo);
  
end

gr = aux;

%% Reconstru��o do sinal

figure(3)
plot(tempo1,gt1(tempo1),tempo2,gt2(tempo2),tempo,gr)
title('Reconstru��o do sinal g(t)');
xlabel('Tempo em segundos');
ylabel('Amplitude em  volts')

%% Pot�ncia do sinal g(t)

f1 = @(t) (t+1)^2;
f2 = @(t) (-t+1)^2;

Pg1 = inv(To)*int(f1,t,-1,0) 
P1 = eval(Pg1)
Pg2 = inv(To)*int(f2,t,0,1)
P2 = eval(Pg2)
Pg = eval(Pg1+Pg2)

%%% Teorema de Paserval para c�lculo da pot�ncia

PN = cumsum([abs(D_o)^2 2*abs(Dn(N+2:end)).^2])


figure(4)
plot(f(N+1:end),PN,f(N+1:end),ones(1,N+1)*Pg)
title('Pot�ncia total e em fun��o do harm�nico');
xlabel('Harm�nico');
ylabel('Pot�ncia em W')
