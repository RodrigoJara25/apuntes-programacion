-- migrate:up

CREATE TABLE facturas (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nomero VARCHAR(40),
  fecha DATETIME,
  cliente_id INTEGER,
  FOREIGN KEY (cliente_id) REFERENCES clientes (id)
);

-- migrate:down

DROP TABLE facturas;