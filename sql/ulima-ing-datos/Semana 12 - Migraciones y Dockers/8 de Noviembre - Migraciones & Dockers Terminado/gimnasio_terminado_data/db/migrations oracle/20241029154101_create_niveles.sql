-- up

CREATE TABLE niveles(
	id NUMBER(7) PRIMARY KEY,
	nombre VARCHAR2(70)
);

ALTER TABLE niveles ADD (
  CONSTRAINT niveles_pk PRIMARY KEY (ID));

CREATE SEQUENCE niveles_seq START WITH 1;

CREATE OR REPLACE TRIGGER niveles_pk 
BEFORE INSERT ON niveles 
FOR EACH ROW

BEGIN
  SELECT niveles_seq.NEXTVAL
  INTO   :new.id
  FROM   dual;
END;
/

-- down

DROP SEQUENCE niveles_seq;
DROP TABLE niveles;