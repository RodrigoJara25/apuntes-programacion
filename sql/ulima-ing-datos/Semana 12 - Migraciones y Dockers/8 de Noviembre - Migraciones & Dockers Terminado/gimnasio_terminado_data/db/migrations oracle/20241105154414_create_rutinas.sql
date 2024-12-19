-- up
CREATE TABLE rutinas(
  id NUMBER(7) PRIMARY KEY,
  calentamiento NUMBER(7),
  detalle VARCHAR2(200),
  inicio DATE,
  fin DATE,
  miembro_id NUMBER(7),
  nivel_id NUMBER(7),
  objetivo_id NUMBER(7),
  FOREIGN KEY (miembro_id) REFERENCES miembros (id),
  FOREIGN KEY (nivel_id) REFERENCES niveles (id),
  FOREIGN KEY (objetivo_id) REFERENCES objetivos (id)
);

ALTER TABLE rutinas ADD (
  CONSTRAINT rutinas_pk PRIMARY KEY (ID));

CREATE SEQUENCE rutinas_seq START WITH 1;

CREATE OR REPLACE TRIGGER rutinas_pk 
BEFORE INSERT ON rutinas 
FOR EACH ROW

BEGIN
  SELECT rutinas_seq.NEXTVAL
  INTO   :new.id
  FROM   dual;
END;
/

-- down

DROP SEQUENCE rutinas_seq;
DROP TABLE rutinas;