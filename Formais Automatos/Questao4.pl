

:-op(501, fy, ~).
:-op(502,yfx, [&,\/]).
:-op(503,yfx,==>).
:-op(504,yfx, <==>).
fbf(a).
fbf(b).
fbf(c).
fbf(d).
fbf(e).
fbf(f).
fbf(g).
fbf(h).
fbf(i).
fbf(j).
fbf(k).
fbf(l).
fbf(m).
fbf(n).
fbf(o).
fbf(p).
fbf(q).
fbf(r).
fbf(s).
fbf(t).
fbf(u).
fbf(v).
fbf(w).
fbf(x).
fbf(y).
fbf(z).
fbf(true).
fbf(false).

fbf(~X):-
    fbf(X).



fbf( X==>Y):-fbf(X), fbf(Y).


fbf(X\/Y):-
    fbf(X), fbf(Y).
fbf(X&Y):-
    fbf(X), fbf(Y).

fbf(X<==>Y):-
    fbf(X), fbf(Y).

fbf((X)):-
    fbf(X).


%fbfs corretas:
%fbf(~(a&b)==> ~c).
%fbf((a\/b) ==> (~c&d)).
%fbf(a<==>((~e)\/(a&c))).
%fbf(~f&(b<==>(a\/c))).
%fbf(b\/a&c==>d).
%
%
%fbfs incorretas:
%fbf(b\/a&==>d).
%fbf(a&(b==>c)~b).
%fbf(a&(b&a)\/&c).
%fbf(a&(b&a)c).
%fbf(a&~c\/(==>~d)).



