-- migrate:up

INSERT INTO niveles (id, nombre) VALUES (1, 'Principiante absoluto');
INSERT INTO niveles (id, nombre) VALUES (2, 'Principiante');
INSERT INTO niveles (id, nombre) VALUES (3, 'Intermedio bajomejorable');
INSERT INTO niveles (id, nombre) VALUES (4, 'Intermedio');
INSERT INTO niveles (id, nombre) VALUES (5, 'Intermedio avanzado');
INSERT INTO niveles (id, nombre) VALUES (6, 'Avanzado');
INSERT INTO niveles (id, nombre) VALUES (7, 'Experto');
INSERT INTO niveles (id, nombre) VALUES (8, 'Atleta recreativo');
INSERT INTO niveles (id, nombre) VALUES (9, 'Atleta competitivo');
INSERT INTO niveles (id, nombre) VALUES (10, 'Fuerza y acondicionamiento');
INSERT INTO niveles (id, nombre) VALUES (11, 'Entrenador personal');
INSERT INTO niveles (id, nombre) VALUES (12, 'Entrenador avanzado');
INSERT INTO niveles (id, nombre) VALUES (13, 'Especialista en rehabilitación');
INSERT INTO niveles (id, nombre) VALUES (14, 'Entrenador funcional');
INSERT INTO niveles (id, nombre) VALUES (15, 'Practicioner de CrossFitintensidad');
INSERT INTO niveles (id, nombre) VALUES (16, 'Especialista en deportes específicos');
INSERT INTO niveles (id, nombre) VALUES (17, 'Experto en nutrición deportivarendimiento');
INSERT INTO niveles (id, nombre) VALUES (18, 'Entrenador de grupo');
INSERT INTO niveles (id, nombre) VALUES (19, 'Competidor de fuerza');
INSERT INTO niveles (id, nombre) VALUES (20, 'Guru del fitness');

-- migrate:down

DELETE FROM niveles;