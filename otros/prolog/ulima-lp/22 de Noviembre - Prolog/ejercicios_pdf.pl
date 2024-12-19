% EJERCICIO 1
es_gato(loki).
es_bonito(X) :- es_gato(X).

% EJERCICIO 2
es_pato(donald).
es_mamifero(X) :- not(es_pato(X)).

