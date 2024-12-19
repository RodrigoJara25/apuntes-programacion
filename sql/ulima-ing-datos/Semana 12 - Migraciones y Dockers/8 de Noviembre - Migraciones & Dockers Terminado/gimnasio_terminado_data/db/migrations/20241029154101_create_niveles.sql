-- migrate:up

CREATE TABLE niveles (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(25)
);

-- migrate:down

DROP TABLE niveles;

