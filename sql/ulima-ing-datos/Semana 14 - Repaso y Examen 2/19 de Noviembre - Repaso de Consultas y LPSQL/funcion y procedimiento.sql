-- float kg_al_bg(float peso_kg)
CREATE OR REPLACE FUNCTION kg_a_lb(peso_kg NUMBER)
RETURN FLOAT
IS
BEGIN
  --DBMS_OUTPUT.PUT_LINE('hola');
  --DBMS_OUTPUT.PUT_LINE(peso_kg);
  --DBMS_OUTPUT.PUT_LINE(peso_kg * 2.20462);
  RETURN ROUND(peso_kg * 2.20462, 2);
END;


CREATE OR REPLACE PROCEDURE llenar_libras_jugadores
IS
  peso_en_libras FLOAT; 
  CURSOR jugadores IS 
    SELECT * FROM players;
BEGIN
  FOR jugador IN jugadores LOOP
    -- DBMS_OUTPUT.PUT_LINE('++++++++++++++++++');
    -- DBMS_OUTPUT.PUT_LINE(jugador.id);
    -- DBMS_OUTPUT.PUT_LINE(jugador.weight);
    peso_en_libras := kg_a_lb(jugador.weight);
    UPDATE players SET weight_lbs = peso_en_libras WHERE id = jugador.id;
  END LOOP;
END;

SET serveroutput ON;
DECLARE 
  peso_en_libras FLOAT; 
BEGIN
  --peso_en_libras := kg_a_lb(35);
  llenar_libras_jugadores();
END;