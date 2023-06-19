slice(L, I, F, L2):-
    slice2(L, 1, I, F, L2).

slice2([], _, _, _, []):- !.
slice2([_|R], P, I, F, L2):-
    P < I,
    P2 is P + 1,
    slice2(R, P2, I, F, L2), !.

slice2([_|R], P, I, F, L2):-
    P > F,
    P2 is P + 1,
    slice2(R, P2, I, F, L2), !.

slice2([X|R], P, I, F, [X|R2]):-
    P2 is P + 1,
    slice2(R, P2, I, F, R2).

combination(0, [], []).
combination(N, [X|R], [X|R2]):-
    N2 is N - 1,
    combination(N2, R, R2).
combination(N, [_|R], L2):-
    combination(N, R, L2).