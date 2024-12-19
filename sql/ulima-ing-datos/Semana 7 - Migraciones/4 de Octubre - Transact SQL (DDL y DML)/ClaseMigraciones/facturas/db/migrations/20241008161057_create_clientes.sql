-- migrate:up

CREATE TABLE clientes (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(40) NOT NULL,
  direccion VARCHAR(100),
  rif INTEGER NOT NULL,
  ciudad_id INTEGER,
  FOREIGN KEY (ciudad_id) REFERENCES ciudades (id)  
);

-- migrate:down

DROP TABLE clientes;