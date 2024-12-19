SET serveroutput on

DECLARE
    nombre VARCHAR2(20) := 'Rodrigo';
    edad NUMBER := 20;
    division NUMBER := 13/3;
    residuo NUMBER := MOD(13,3);
    redondeo_abajo NUMBER := FLOOR(13/3);
    redondeo_arriba NUMBER := CEIL(13/3);
    rpta NUMBER(3,2) := 0;
    i NUMBER := 0;
    cantidad NUMBER := 5;
    -- ejecutar un codigo sql desde acá
    CURSOR miembros IS
        SELECT * FROM miembros;
BEGIN
    
    DBMS_OUTPUT.PUT_LINE('edad: ' || edad);
    DBMS_OUTPUT.PUT_LINE('nombre: ' || nombre);
    DBMS_OUTPUT.PUT_LINE('division: ' || division);
    DBMS_OUTPUT.PUT_LINE('residuo: ' || residuo);
    DBMS_OUTPUT.PUT_LINE('redondeo arriba: ' || redondeo_arriba);
    DBMS_OUTPUT.PUT_LINE('redondeo abajo: ' || redondeo_abajo);
    
    -- Podemos cambiar el valor de una variable, pero declarada en DECLARE
    rpta := (3*4 + 1)/3;
    DBMS_OUTPUT.PUT_LINE('rpta: ' || rpta);
    
    -- estructura if / else if / else / end if
    IF edad >= 18 THEN
        DBMS_OUTPUT.PUT_LINE(nombre || ' es mayor de edad');
    ELSIF edad <= 0 THEN
        DBMS_OUTPUT.PUT_LINE(nombre || ' aun no ha nacido');
    ELSE
        DBMS_OUTPUT.PUT_LINE(nombre || ' no es mayor de edad');
    END IF;
    
    -- bucles (tipo while)
    LOOP
        IF i < 10 THEN
            DBMS_OUTPUT.PUT_LINE('i = ' || i);
            i := i + 1;
        ELSE
            EXIT;
        END IF;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('ya salimos del bucle');
    
    -- FOR EACH IN : es para recorrer como una lista. Para acceder debes
    -- poner que columna en específico quieres, ya que no bota todos de una.
    FOR miembro IN miembros LOOP
        DBMS_OUTPUT.PUT_LINE(miembro.id || ', ' || miembro.codigo);
    END LOOP;
    
    ---------------------- procedimiento----------------------------------
    DBMS_OUTPUT.PUT_LINE('-------------------------------------------------------------------------------------');
    suma(5, 4);
    
    ---------------------- funcion ----------------------------------
    DBMS_OUTPUT.PUT_LINE('-------------------------------------------------------------------------------------');
    cantidad := ejercicios_rutinas_num(1);
    DBMS_OUTPUT.PUT_LINE('Cantidad: ' || cantidad);
END;
/