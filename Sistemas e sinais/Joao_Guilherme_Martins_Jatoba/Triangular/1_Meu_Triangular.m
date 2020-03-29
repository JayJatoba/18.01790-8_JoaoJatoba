%% Adaptado do professor Vanderlei Cunha Parro do Instituto Mauá de Tecnologia
%% https://github.com/vparro/sinais



%% Para fazer este código, percebi que o exercício, pelo menos a teoria era muito 
%% parecido com o anterior (Exponencial negativa), por isso peguei o código deste, 
%% e modifiquei o necessário para que desse certo. 

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

%%% Vetor tempo para visualização do sinal
%%% diferente da variável simbólica t
%%% para efeito de organização da solução


M = 1000;
Ts = To/M;
tempo1 = [-1:Ts:T1];                  
% Três períodos do sinal
tempo2 = [0:Ts:T2];                
% Modifica ao vetor tempo
tempo  = [0:Ts:To];                  
% tempo para sintese - 1 período
 
%% Visualizando o sinal gt completo

figure(1)

plot(tempo1,gt1(tempo1),tempo2,gt2(tempo2))
title('Sinal g(t)')
xlabel('Tempo em segundos')
ylabel('Amplitude em volts')

%% Determinando o valor médio

syms n t

D_o = inv(To)*int(gt1,t,-1,T1) + inv(To)*int(gt2,t,T1,T2);
Dn1 = inv(To)*int(gt1.*exp(-j*n*wo*t),t,-1,T1);
Dn2 = inv(To)*int(gt2.*exp(-j*n*wo*t),t,T1,T2);


%% Determinando valores numéricos

n = [[-N:1:-1] [1:1:N]];
Dn1 = eval(Dn1)
Dn2 = eval(Dn2)

Dn =  Dn1+Dn2
D_o = eval(D_o)
Dn = [Dn(1:N) D_o Dn(N+1:2*N)];


%% Visualizando o espector de Amplitude
 
figure(2) 
stem(f,abs(Dn)); 
title('Série de Fourier do sinal g(t)');
xlabel('Frequência em Hz');
ylabel('Amplitude em  volts')

%% Sintetizando o sinal

n=[-N:1:N];
aux  = 0;             


for k = 0 : 2*N      
  
  aux = aux + Dn(k+1)*exp(j*n(k+1)*wo*tempo);
  
end

gr = aux;

%% Reconstrução do sinal

figure(3)
plot(tempo1,gt1(tempo1),tempo2,gt2(tempo2),tempo,gr)
title('Reconstrução do sinal g(t)');
xlabel('Tempo em segundos');
ylabel('Amplitude em  volts')

%% Potência do sinal g(t)

f1 = @(t) (t+1)^2;
f2 = @(t) (-t+1)^2;

Pg1 = inv(To)*int(f1,t,-1,0) 
P1 = eval(Pg1)
Pg2 = inv(To)*int(f2,t,0,1)
P2 = eval(Pg2)
Pg = eval(Pg1+Pg2)

%%% Teorema de Paserval para cálculo da potência

PN = cumsum([abs(D_o)^2 2*abs(Dn(N+2:end)).^2])


figure(4)
plot(f(N+1:end),PN,f(N+1:end),ones(1,N+1)*Pg)
title('Potência total e em função do harmônico');
xlabel('Harmônico');
ylabel('Potência em W')
