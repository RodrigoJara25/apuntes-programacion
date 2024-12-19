-- migrate:up

CREATE TABLE usuarios (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(20),
  correo VARCHAR(30),
  contrasenia VARCHAR(50),
  miembro_id INTEGER,
  FOREIGN KEY (miembro_id) REFERENCES miembros (id)
);

-- migrate:down

DROP TABLE usuarios;