%% Exponencial Positiva
clear all;
clc;
close all;
pkg load symbolic;
%% Definindo o sinal a ser estudado
gt = @(t) (1-exp(t))
To = 1;
fo = inv(To);
wo = 2*pi*fo;
N = 100;
n=[-N:1:N];
f = n*fo;
%%% Vetor tempo para visualiza��o do sinal
%%% diferente da vari�vel simb�lica t
%%% para efeito de organiza��o da solu��o
%%% existem outros caminhos
M = 1000;
Ts = To/M; 
tempo = [0:Ts:3*To];
% Tr�s per�odos do sinal
tempo3 = [0:Ts:To];
% Modifica ao vetor tempo
gt3 = [gt(tempo3) gt(tempo3) gt(tempo3)];
% Concatena tr�s per�odo de gt
gt3 = gt3(1:end-2);
%% Determinando o termo Dn simbolicamente
syms n t
Dn = inv(To)*int(gt.*exp(-j*n*wo*t),t,0,To)
D_o = inv(To)*int(gt,t,0,To);
%% Determinando o termo Dn numericamente
n=[-N:1:N]; 
Dn = eval(Dn)
D_o = eval(D_o)     
% Corrigindo o valor m�dio (NaN devido a indetermina��o)
Dn(N+1) = D_o      
% Subistituindo no vetor de respostas
%% Visualizando o espector de Amplitude 
figure(1) 
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
%% Visualizando o sinal reconstruido
figure(2)
plot(tempo,gt3,tempo,aux)
title('Reconstru��o do sinal g(t)');
xlabel('Tempo em segundos');
ylabel('Amplitude em  volts')
%% Determinando a pot�ncia do sinal g(t)
Pg = inv(To)*int((1-exp(t))^2,t,0,To)
Pg = eval(Pg)
%%% Verifica a pot�ncia pelo teorema de Paserval
PN = cumsum([Dn(N+1)^2 2*abs(Dn(N+2:end)).^2])
figure(3)
plot(f(N+1:end),PN,f(N+1:end),ones(1,N+1)*Pg)
title('Pot�ncia total e em fun��o do harm�nico');
xlabel('Harm�nico');
ylabel('Pot�ncia em W')  
