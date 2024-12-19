-- migrate:up

CREATE TABLE ciudades (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(30) NOT NULL
);

-- migrate:down

DROP TABLE ciudades;