-- migrate:up

CREATE TABLE ejercicios (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(60),
  imagen VARCHAR(100),
  cuerpo_parte_id INTEGER,
  FOREIGN KEY (cuerpo_parte_id) REFERENCES cuerpo_partes (id)
);

-- migrate:down

DROP TABLE ejercicios;