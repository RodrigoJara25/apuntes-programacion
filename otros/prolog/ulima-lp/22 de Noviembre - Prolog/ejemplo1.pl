% hechos

es_aplicada(vero).
es_aplicado(arturo).


% el gato es mas grande que el raton
es_mas_grande(gato, raton).


% el elefante es mas grande que el gato y mas grande que el perro
es_mas_grande(elefante, gato).
es_mas_grande(gato, perro).




es_humano(socrates).
es_humano(arturo).

% Regla
es_mortal(X) :- es_humano(X).




