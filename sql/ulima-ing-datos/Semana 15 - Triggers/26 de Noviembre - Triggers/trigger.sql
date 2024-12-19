CREATE OR REPLACE TRIGGER prev_insert_cuerpo_partes
BEFORE INSERT ON cuerpo_partes      -- Indicamos si el trigger se realiza antes o despues, y de que operacion estamos hablando, si un insert, delete, etc.
REFERENCING NEW AS N OLD AS O
FOR EACH ROW
DECLARE
    cuerpo_partes_count NUMBER;
BEGIN
    SELECT 
        COUNT(*) INTO cuerpo_partes_count
    FROM cuerpo_partes; -- Tengo 12 partes del cuerpo
    IF cuerpo_partes_count >= 13 THEN
        RAISE_APPLICATION_ERROR(-20001, 'No puede ingresar mas de 13 partes del cuerpo');
    END IF;
END;

-- Este trigger se llama al momento de realizar un insert a la tabla cuerpo_partes. Antes de realizar el INSERT, imprime la cantidad de partes del cuerpo que habia antes de la insercion.
SET SERVEROUTPUT ON
INSERT INTO cuerpo_partes (nombre) VALUES ('Cabeza2');

SET SERVEROUTPUT ON
DECLARE
BEGIN
    -- Aca llamo a mi funcion o procedimiento
END;