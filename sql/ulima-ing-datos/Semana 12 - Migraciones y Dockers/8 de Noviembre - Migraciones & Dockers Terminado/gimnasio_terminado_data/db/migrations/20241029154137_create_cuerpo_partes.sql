-- migrate:up

CREATE TABLE cuerpo_partes (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(20)
);

-- migrate:down

DROP TABLE cuerpo_partes;

