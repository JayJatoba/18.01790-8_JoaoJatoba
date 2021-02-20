%% move(State1, Move, State2): Move in State1 results in State2
%% state(HorizPosition,VertPosition,BoxPosition, HasBanana): configures
%% the current state of the problem
%% canget( State ): indicates how the monkey canget the banana

move(state(middle,onbox,middle,hasnot),
     grasp,
     state(middle,onbox,middle,has)).

move(state(P,onfloor,P,H),
     climb,
     state(P,onbox,P,H)).

move(state(P1,onfloor,P1,H),
     push(P1,P2),
     state(P2,onfloor,P2,H)).

move(state(P1,onfloor,B,H),
     walk(P1,P2),
     state(P2,onfloor,B,H)).
canget(state(_,_,_,has)):-
    write('END'),nl,nl.
canget(State1):-
    move(State1,Move,State2),
    canget(State2),write('From: '),write(State1),nl,
    write('Action: '),write(Move),nl,
    write('To: '),write(State2),nl,nl.


% Usei de base a recursividade o exercício de umas das listas anteriores
% de Prolog
% listar_caminho(X,Y):-conectado(X,Y),write('Caminho:'),nl,write(X),write('-'),write(Y),nl.
% listar_caminho(X,Y):-conectado(X,Z),listar_caminho(Z,Y),write(X),write('-'),write(Z),nl.
%

