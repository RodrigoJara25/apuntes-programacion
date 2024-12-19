-- up
CREATE TABLE ejercicios(
  id NUMBER(7) PRIMARY KEY,
  nombre VARCHAR2(100),
  imagen VARCHAR2(150),
  cuerpo_parte_id NUMBER(7),
  FOREIGN KEY (cuerpo_parte_id) REFERENCES cuerpo_partes (id)
);

ALTER TABLE ejercicios ADD (
  CONSTRAINT ejercicios_pk PRIMARY KEY (ID));

CREATE SEQUENCE ejercicios_seq START WITH 1;

CREATE OR REPLACE TRIGGER ejercicios_pk 
BEFORE INSERT ON ejercicios 
FOR EACH ROW

BEGIN
  SELECT ejercicios_seq.NEXTVAL
  INTO   :new.id
  FROM   dual;
END;
/

-- down

DROP SEQUENCE ejercicios_seq;
DROP TABLE ejercicios;