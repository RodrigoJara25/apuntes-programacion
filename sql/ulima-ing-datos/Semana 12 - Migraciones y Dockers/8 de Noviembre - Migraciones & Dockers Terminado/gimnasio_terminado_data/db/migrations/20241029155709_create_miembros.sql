-- migrate:up

CREATE TABLE miembros (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(20)
);

-- migrate:down

DROP TABLE miembros;

