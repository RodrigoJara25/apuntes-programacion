-- migrate:up

INSERT INTO categorias (nombre) VALUES ('Electrónica');
INSERT INTO categorias (nombre) VALUES ('Ropa');
INSERT INTO categorias (nombre) VALUES ('Alimentos');
INSERT INTO categorias (nombre) VALUES ('Hogar');
INSERT INTO categorias (nombre) VALUES ('Juguetes');
INSERT INTO categorias (nombre) VALUES ('Deportes');
INSERT INTO categorias (nombre) VALUES ('Libros');
INSERT INTO categorias (nombre) VALUES ('Salud');
INSERT INTO categorias (nombre) VALUES ('Belleza');
INSERT INTO categorias (nombre) VALUES ('Automotriz');
INSERT INTO categorias (nombre) VALUES ('Música');
INSERT INTO categorias (nombre) VALUES ('Cocina');
INSERT INTO categorias (nombre) VALUES ('Jardinería');
INSERT INTO categorias (nombre) VALUES ('Mascotas');
INSERT INTO categorias (nombre) VALUES ('Tecnología');
INSERT INTO categorias (nombre) VALUES ('Moda');
INSERT INTO categorias (nombre) VALUES ('Hobby');
INSERT INTO categorias (nombre) VALUES ('Accesorios');
INSERT INTO categorias (nombre) VALUES ('Viajes');
INSERT INTO categorias (nombre) VALUES ('Aventura');
INSERT INTO categorias (nombre) VALUES ('Fotografía');
INSERT INTO categorias (nombre) VALUES ('Arte');
INSERT INTO categorias (nombre) VALUES ('Ciencia');
INSERT INTO categorias (nombre) VALUES ('Historia');
INSERT INTO categorias (nombre) VALUES ('Educación');
INSERT INTO categorias (nombre) VALUES ('Software');
INSERT INTO categorias (nombre) VALUES ('Construcción');
INSERT INTO categorias (nombre) VALUES ('Finanzas');
INSERT INTO categorias (nombre) VALUES ('Eventos');
INSERT INTO categorias (nombre) VALUES ('Ferretería');
INSERT INTO categorias (nombre) VALUES ('Relojería');
INSERT INTO categorias (nombre) VALUES ('Turismo');

-- migrate:down

DELETE FROM categorias