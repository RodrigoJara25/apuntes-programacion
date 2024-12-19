-- up

CREATE TABLE objetivos(
	id NUMBER(7) PRIMARY KEY,
	nombre VARCHAR2(120)
);

ALTER TABLE objetivos ADD (
  CONSTRAINT objetivos_pk PRIMARY KEY (ID));

CREATE SEQUENCE objetivos_seq START WITH 1;

CREATE OR REPLACE TRIGGER objetivos_pk 
BEFORE INSERT ON objetivos 
FOR EACH ROW

BEGIN
  SELECT objetivos_seq.NEXTVAL
  INTO   :new.id
  FROM   dual;
END;
/

-- down

DROP SEQUENCE objetivos_seq;
DROP TABLE objetivos;