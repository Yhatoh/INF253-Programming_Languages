reverse([], []):- !.
reverse([X|C], R):-
    append(C2, [X], R),
    reverse(C, C2), !.

palindromo(L):-
    reverse(L, L).

duplicate([], []).
duplicate([X|C], [X|C2]):-
    C2 = [X|C3],
    duplicate(C, C3), !.