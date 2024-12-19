-- up
CREATE TABLE ejercicios_rutinas(
  id NUMBER(7) PRIMARY KEY,
  orden NUMBER(7),
  series NUMBER(7),
  repeticiones NUMBER(7),
  ejercicio_id NUMBER(7),
  rutina_id NUMBER(7),
  FOREIGN KEY (ejercicio_id) REFERENCES ejercicios (id),
  FOREIGN KEY (rutina_id) REFERENCES rutinas (id)
);

ALTER TABLE ejercicios_rutinas ADD (
  CONSTRAINT ejercicios_rutinas_pk PRIMARY KEY (ID));

CREATE SEQUENCE ejercicios_rutinas_seq START WITH 1;

CREATE OR REPLACE TRIGGER ejercicios_rutinas_pk 
BEFORE INSERT ON ejercicios_rutinas 
FOR EACH ROW

BEGIN
  SELECT ejercicios_rutinas_seq.NEXTVAL
  INTO   :new.id
  FROM   dual;
END;
/

-- down

DROP SEQUENCE ejercicios_rutinas_seq;
DROP TABLE ejercicios_rutinas;