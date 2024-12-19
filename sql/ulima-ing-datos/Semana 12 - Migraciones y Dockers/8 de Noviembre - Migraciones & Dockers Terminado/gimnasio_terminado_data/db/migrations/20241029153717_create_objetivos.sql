-- migrate:up

CREATE TABLE objetivos (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(25)
);

-- migrate:down

DROP TABLE objetivos;

