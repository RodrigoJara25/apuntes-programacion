CREATE TABLE IF NOT EXISTS "schema_migrations" (version varchar(128) primary key);
CREATE TABLE ciudades (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(30)
);
CREATE TABLE categorias (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(20),
  codigo INTEGER
);
CREATE TABLE productos (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  codigo INTEGER NOT NULL,
  nombre VARCHAR(30),
  descripcion VARCHAR(80),
  valor_unitario FLOAT NOT NULL,
  categoria_id INTEGER,
  FOREIGN KEY (categoria_id) REFERENCES categorias (id)
);
CREATE TABLE clientes (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(40),
  direccion VARCHAR(100),
  rif INTEGER,
  ciudad_id INTEGER,
  FOREIGN KEY (ciudad_id) REFERENCES ciudades (id)
);
CREATE TABLE facturas (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  fecha DATETIME,
  cliente_id INTEGER, numero INTEGER,
  FOREIGN KEY (cliente_id) REFERENCES clientes (id)
);
CREATE TABLE facturas_productos (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  cantidad INTEGER,
  producto_id INTEGER,
  factura_id INTEGER,
  FOREIGN KEY (producto_id) REFERENCES productos (id),
  FOREIGN KEY (factura_id) REFERENCES facturas (id)
);
-- Dbmate schema migrations
INSERT INTO "schema_migrations" (version) VALUES
  ('20241004154616'),
  ('20241004160436'),
  ('20241004161659'),
  ('20241004164655'),
  ('20241004164703'),
  ('20241004164718'),
  ('20241004165820'),
  ('20241004171052'),
  ('20241004171928'),
  ('20241022171721'),
  ('20241022173947'),
  ('20241022175321');
