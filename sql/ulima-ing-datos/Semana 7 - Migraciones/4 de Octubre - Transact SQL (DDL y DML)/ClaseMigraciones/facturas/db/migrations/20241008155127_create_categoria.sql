-- migrate:up

CREATE TABLE categorias (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(20) NOT NULL
);

-- migrate:down

DROP TABLE categorias;