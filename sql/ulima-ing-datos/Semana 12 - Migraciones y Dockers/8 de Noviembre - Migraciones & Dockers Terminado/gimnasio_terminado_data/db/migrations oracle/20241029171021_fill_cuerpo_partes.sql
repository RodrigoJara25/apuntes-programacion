-- migrate:up

INSERT INTO cuerpo_partes (id, nombre) VALUES(1, 'Pectorales');
INSERT INTO cuerpo_partes (id, nombre) VALUES(2, 'Espalda');
INSERT INTO cuerpo_partes (id, nombre) VALUES(3, 'Hombros');
INSERT INTO cuerpo_partes (id, nombre) VALUES(4, 'Bíceps');
INSERT INTO cuerpo_partes (id, nombre) VALUES(5, 'Tríceps');
INSERT INTO cuerpo_partes (id, nombre) VALUES(6, 'Abdomen');
INSERT INTO cuerpo_partes (id, nombre) VALUES(7, 'Glúteos');
INSERT INTO cuerpo_partes (id, nombre) VALUES(8, 'Cuádriceps');
INSERT INTO cuerpo_partes (id, nombre) VALUES(9, 'Isquiotibiales');
INSERT INTO cuerpo_partes (id, nombre) VALUES(10, 'Pantorrillas');
INSERT INTO cuerpo_partes (id, nombre) VALUES(11, 'Caderas');
INSERT INTO cuerpo_partes (id, nombre) VALUES(12, 'Antebrazos');


-- migrate:down


DELETE FROM cuerpo_partes;
