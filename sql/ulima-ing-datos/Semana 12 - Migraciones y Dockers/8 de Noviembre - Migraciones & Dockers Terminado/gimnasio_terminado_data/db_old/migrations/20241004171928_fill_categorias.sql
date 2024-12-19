-- migrate:up

INSERT INTO categorias (id, nombre, codigo) VALUES (1, 'Electrónica', 3656);
INSERT INTO categorias (id, nombre, codigo) VALUES (2, 'Ropa y Accesorios', 3687);
INSERT INTO categorias (id, nombre, codigo) VALUES (3, 'Alimentos y Bebidas', 3303);
INSERT INTO categorias (id, nombre, codigo) VALUES (4, 'Hogar y Jardín', 4342);
INSERT INTO categorias (id, nombre, codigo) VALUES (5, 'Salud y Belleza', 4503);
INSERT INTO categorias (id, nombre, codigo) VALUES (6, 'Juguetes y Juegos', 1122);
INSERT INTO categorias (id, nombre, codigo) VALUES (7, 'Deportes y Aire Libre', 4558);
INSERT INTO categorias (id, nombre, codigo) VALUES (8, 'Automotriz', 1980);
INSERT INTO categorias (id, nombre, codigo) VALUES (9, 'Libros y Medios', 2212);
INSERT INTO categorias (id, nombre, codigo) VALUES (10, 'Tecnología de la Información', 2715);

-- migrate:down

DELETE FROM categorias;