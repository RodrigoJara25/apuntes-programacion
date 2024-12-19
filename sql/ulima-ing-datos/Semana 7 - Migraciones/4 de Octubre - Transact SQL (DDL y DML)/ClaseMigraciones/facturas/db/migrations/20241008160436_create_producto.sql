-- migrate:up

CREATE TABLE productos (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  codigo INTEGER NOT NULL,
  descripcion VARCHAR(80),
  valor_unitario FLOAT NOT NULL,
  categoria_id INTEGER,
  FOREIGN KEY (categoria_id) REFERENCES categorias (id)
);

-- migrate:down

DROP TABLE productos;