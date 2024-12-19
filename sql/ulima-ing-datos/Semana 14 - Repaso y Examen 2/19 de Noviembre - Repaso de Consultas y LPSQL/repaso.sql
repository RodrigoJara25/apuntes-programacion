-- listar jugadores(nombre) con su posicion y sexo
SELECT 
  P.name AS jugador,  
  PO.name AS posicion,
  S.name AS sexo
FROM players P 
INNER JOIN positions PO ON PO.id = P.position_id
INNER JOIN sexs S ON S.id = P.sex_id
-- WHERE sexo = 'Hombre';
-- listar cuantos jugadores hay por cada posicion que superen la cantidad de 2000
SELECT 
  PO.name AS posicion,
  COUNT(PO.name) AS cantidad
FROM players P 
INNER JOIN positions PO ON PO.id = P.position_id 
GROUP BY posicion 
HAVING cantidad > 2000;
-- listar cuantos jugadores hay por cada posicion y por sexo
SELECT 
  PO.name AS posicion,
  COUNT(PO.name) AS cantidad,
  'Hombres' AS sexo
FROM players P 
INNER JOIN positions PO ON PO.id = P.position_id 
GROUP BY posicion, P.sex_id
UNION 
SELECT 
  PO.name AS posicion,
  COUNT(PO.name) AS cantidad,
  'Mujeres' AS sexo
FROM players P 
INNER JOIN positions PO ON PO.id = P.position_id 
WHERE P.sex_id = 2 -- mujeres
GROUP BY posicion;


