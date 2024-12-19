-- up
CREATE TABLE usuarios(
  id NUMBER(7) PRIMARY KEY,
  nombre VARCHAR2(20) NOT NULL,
  correo VARCHAR2(40) NOT NULL,
  contrasenia VARCHAR2(40) NOT NULL,
  miembro_id NUMBER(7),
  FOREIGN KEY (miembro_id) REFERENCES miembros
);

ALTER TABLE usuarios ADD (
  CONSTRAINT usuarios_pk PRIMARY KEY (ID));

CREATE SEQUENCE usuarios_seq START WITH 1;

CREATE OR REPLACE TRIGGER usuarios_pk 
BEFORE INSERT ON usuarios 
FOR EACH ROW

BEGIN
  SELECT usuarios_seq.NEXTVAL
  INTO   :new.id
  FROM   dual;
END;
/

-- down

DROP SEQUENCE usuarios_seq;
DROP TABLE usuarios;