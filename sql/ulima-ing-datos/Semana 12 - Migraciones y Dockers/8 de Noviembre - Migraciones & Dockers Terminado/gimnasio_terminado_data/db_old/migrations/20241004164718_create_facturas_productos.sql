-- migrate:up

CREATE TABLE facturas_productos (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  cantidad INTEGER,
  producto_id INTEGER,
  factura_id INTEGER,
  FOREIGN KEY (producto_id) REFERENCES productos (id),
  FOREIGN KEY (factura_id) REFERENCES facturas (id)
);

-- migrate:down

DROP TABLE facturas_productos;