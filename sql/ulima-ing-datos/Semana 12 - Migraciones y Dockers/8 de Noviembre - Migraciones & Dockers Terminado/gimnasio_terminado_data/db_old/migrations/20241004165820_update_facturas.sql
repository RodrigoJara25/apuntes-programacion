-- migrate:up

ALTER TABLE facturas ADD COLUMN numero INTEGER;
ALTER TABLE facturas DROP COLUMN nomero;

-- migrate:down

ALTER TABLE facturas ADD COLUMN nomero VARCHAR(20);
ALTER TABLE facturas DROP COLUMN numero;
