% ARBOL GENEALOGICO

%hechos
es_parte_familia(eduardo).
es_parte_familia(juan).
es_parte_familia(cesar).
es_parte_familia(pedro).
es_parte_familia(maria).
es_parte_familia(josue).

es_padre(eduardo, juan).
es_padre(juan, cesar).
es_padre(juan, pedro).
es_padre(juan, maria).
es_padre(cesar, josue).

% reglas
es_abuelo(X, Y) :- es_parte_familia(X) , es_parte_familia(Y) , es_padre(X, Z) , es_padre(Z, Y).

es_hermano(X, Y) :-
    es_parte_familia(X) ,
    es_parte_familia(Y) ,
    es_padre(Z, X) ,
    es_padre(Z, Y) ,
     X \= Y .

es_tio(X, Y) :-
    es_parte_familia(X) ,
    es_parte_familia(Y) ,
    es_hermano(X, Z) ,
    es_padre(Z, Y) ,
    X \= Z .

es_hijo(X, Y) :-
    es_parte_familia(X) ,
    es_parte_familia(Y) ,
    es_padre(Y, X).

