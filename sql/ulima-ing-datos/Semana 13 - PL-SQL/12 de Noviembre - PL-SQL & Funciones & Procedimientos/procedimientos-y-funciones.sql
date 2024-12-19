-- FUNCIONES Y PROCEDIMIENTOS

SET serveroutput on

-- Procedimiento : estructura basica

-- 1) Crear el procedimiento
CREATE OR REPLACE PROCEDURE suma(p1 NUMBER, p2 NUMBER)
IS

BEGIN
    DBMS_OUTPUT.PUT_LINE(p1 + p2);
END suma;

-- 2) Ejecutar procedimeinto
-- 3) Comprobar que ha sido creada


-- Funcion : estructura basica

-- 1) Crear la funcion : devuelve las veces que un ejercicio se encuentra en la tabla ejercicios_rutinas
CREATE OR REPLACE FUNCTION ejercicios_rutinas_num(ejercicio_id NUMBER)
RETURN NUMBER
IS
    CURSOR registros IS
        SELECT * FROM ejercicios_rutinas;
    cantidad NUMBER := 0; 
BEGIN
    FOR er IN registros LOOP
        IF er.ejercicio_id = ejercicio_id THEN
            cantidad := cantidad + 1;
        END IF;
    END LOOP;
    RETURN cantidad;
END ejercicios_rutinas_num;

-- 2) Ejecutar funcion
-- 3) Comprobar que ha sido creada





