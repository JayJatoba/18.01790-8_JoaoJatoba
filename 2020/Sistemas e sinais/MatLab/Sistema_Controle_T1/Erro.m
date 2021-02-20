function [Eq] = erro(X,R,I,Rd,Id)
beta = X(1);
r = X(2);

S0 = 60e6;
I0 = 2;
R0 = 0;
N  = 60e6;

options = simset('solver','ode45','MaxStep',0.01,'InitialStep',0.01,'ReturnWorkspaceOutputs', 'on');
y = sim('SIRmodel',200,options);

I = y.logsout{1}.Values.Data; % Saída I
R = y.logsout{2}.Values.Data; % Saída R

size = length(I);


%%% Erro quadrático

Eq = sum((I - Id).^2) + sum((R - Rd).^2); %% cálculo do erro

% plot(t,y,t,ym,"linewidth", 2)

end