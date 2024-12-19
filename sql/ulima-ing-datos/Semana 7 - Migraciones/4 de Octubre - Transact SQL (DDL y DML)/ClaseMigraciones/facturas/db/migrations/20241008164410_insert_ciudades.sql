-- migrate:up

INSERT INTO ciudades (id, nombre) VALUES (1, 'LIMA');
INSERT INTO ciudades (id, nombre) VALUES (2, 'AREQUIPA');
INSERT INTO ciudades (id, nombre) VALUES (3, 'CUZCO');
INSERT INTO ciudades (id, nombre) VALUES (4, 'JULIACA');

-- migrate:down

DELETE FROM ciudades;