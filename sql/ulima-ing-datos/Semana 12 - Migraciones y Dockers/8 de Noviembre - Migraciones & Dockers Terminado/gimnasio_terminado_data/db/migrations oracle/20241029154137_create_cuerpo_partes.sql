-- up

CREATE TABLE cuerpo_partes(
	id NUMBER(7) PRIMARY KEY,
	nombre VARCHAR2(20)
);

ALTER TABLE cuerpo_partes ADD (
  CONSTRAINT cuerpo_partes_pk PRIMARY KEY (ID));

CREATE SEQUENCE cuerpo_partes_seq START WITH 1;

CREATE OR REPLACE TRIGGER cuerpo_partes_pk 
BEFORE INSERT ON cuerpo_partes 
FOR EACH ROW

BEGIN
  SELECT cuerpo_partes_seq.NEXTVAL
  INTO   :new.id
  FROM   dual;
END;
/

-- down

DROP SEQUENCE cuerpo_partes_seq;
DROP TABLE cuerpo_partes;