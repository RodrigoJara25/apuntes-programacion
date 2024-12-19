-- migrate:up

CREATE TABLE categorias (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(20),
  codigo INTEGER
);

-- migrate:down

DROP TABLE categorias;