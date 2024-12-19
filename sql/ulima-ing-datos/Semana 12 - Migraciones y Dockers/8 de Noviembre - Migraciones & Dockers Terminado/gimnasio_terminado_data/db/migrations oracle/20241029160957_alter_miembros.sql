-- migrate:up

ALTER TABLE miembros DROP COLUMN nombre;
ALTER TABLE miembros ADD COLUMN nombres VARCHAR(30);
ALTER TABLE miembros ADD COLUMN apellidos VARCHAR(30);
ALTER TABLE miembros ADD COLUMN codigo INT;

-- migrate:down

ALTER TABLE miembros ADD COLUMN nombre;
ALTER TABLE miembros DROP COLUMN nombres;
ALTER TABLE miembros DROP COLUMN apellidos;
ALTER TABLE miembros DROP COLUMN codigo;