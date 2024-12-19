-- migrate:up

INSERT INTO objetivos (id, nombre) VALUES (1, 'Perder peso');
INSERT INTO objetivos (id, nombre) VALUES (2, 'Aumentar masa muscular');
INSERT INTO objetivos (id, nombre) VALUES (3, 'Mejorar la resistencia cardiovascular');
INSERT INTO objetivos (id, nombre) VALUES (4, 'Aumentar la fuerza');
INSERT INTO objetivos (id, nombre) VALUES (5, 'Mejorar la flexibilidad');
INSERT INTO objetivos (id, nombre) VALUES (6, 'Tonificar el cuerpo');
INSERT INTO objetivos (id, nombre) VALUES (7, 'Prepararse para un evento deportivo');
INSERT INTO objetivos (id, nombre) VALUES (8, 'Mejorar la salud general');
INSERT INTO objetivos (id, nombre) VALUES (9, 'Desarrollar una rutina de ejercicio sostenible');
INSERT INTO objetivos (id, nombre) VALUES (10, 'Aumentar la técnica en ejercicios específicos');

-- migrate:down

DELETE FROM objetivos;
