-- migrate:up

INSERT INTO ciudades (id, nombre) VALUES (1, 'Lima');
INSERT INTO ciudades (id, nombre) VALUES (2, 'Arequipa');
INSERT INTO ciudades (id, nombre) VALUES (3, 'Cuzco');
INSERT INTO ciudades (id, nombre) VALUES (4, 'JULIACA');

-- migrate:down

DELETE FROM ciudades;