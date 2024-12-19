# Guía 05 - Prolog

La siguiente guía debe de realizarla utilizando Prolog.

1. Elaborar un sistema de recomendación médica donde se defina:

a. una enfermedad se caracteriza por un síntoma o más

b. una medicamento alivia una enfermedad

c. una receta indica medicamentos para un paciente (enfermo).

d. que Manuel tiene la enfermedad de la gripe

e. que Alicia tiene el síntoma de cansancio

f. que la fiebre es síntoma de la gripe

g. que la tos es síntoma de la gripe

h. que el cansancio es síntoma de la anemia

i. que las vitaminas eliminan el cansancio

j. que las aspirinas eliminan la fiebre

k. que el jarabe elimina la tos

Y donde se pregunte:

l. Qué se le recetará a Manuel

m. Qué se le recetará a Alicia

n. De qué está enferma Alicia

o. Qué alivia la anemia

p. Qué alivia la gripe

**Hints:**

enfermo_de, tiene_sintoma, sintoma_de, elimina
recetar_a, alivia, enfermo_de

2. Elaborar un sistema de recomendación de peliculas donde se defina:

- Una pelicula es clasificada por géneros: "Accion", "Terror", "Sci-Fi", etc.
- Un usuario tiene un genero favorito o preferido
- Se le debe preguntar:
    - Que peliculas se le recomendará a un usuario.
    - Que peliculas pertenecen a un género X.
    - Que usuarios prefieren un género X.

**Hints:**

genero_de, genero_pelicula
le_gusta, genero_favorito, genero_preferido