-- migrate:up

CREATE TABLE rutinas (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  calentamiento INTEGER,
  detalle VARCHAR(120),
  inicio DATE,
  fin DATE,
  miembro_id INTEGER,
  nivel_id INTEGER,
  objetivo_id INTEGER,
  FOREIGN KEY (miembro_id) REFERENCES miembros (id),
  FOREIGN KEY (nivel_id) REFERENCES niveles (id),
  FOREIGN KEY (objetivo_id) REFERENCES objetivos (id)
);

-- migrate:down

DROP TABLE rutinas;
