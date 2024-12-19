-- up

CREATE TABLE miembros(
	id NUMBER(7) PRIMARY KEY,
	nombres VARCHAR2(120),
  apellidos VARCHAR2(120),
  codigo NUMBER(9)
);

ALTER TABLE miembros ADD (
  CONSTRAINT miembros_pk PRIMARY KEY (ID));

CREATE SEQUENCE miembros_seq START WITH 1;

CREATE OR REPLACE TRIGGER miembros_pk 
BEFORE INSERT ON miembros 
FOR EACH ROW

BEGIN
  SELECT miembros_seq.NEXTVAL
  INTO   :new.id
  FROM   dual;
END;
/

-- down

DROP SEQUENCE miembros_seq;
DROP TABLE miembros;