-- migrate:up

CREATE TABLE ejercicios_rutinas (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  orden INTEGER,
  series INTEGER,
  repeticiones INTEGER,
  ejercicio_id INTEGER,
  rutina_id INTEGER,
  FOREIGN KEY (ejercicio_id) REFERENCES ejercicios (id),
  FOREIGN KEY (rutina_id) REFERENCES rutinas (id)
);

-- migrate:down

DROP TABLE ejercicios_rutinas;
