-- listar las naciones en orden descendente
SELECT 
	id, 
	name 
FROM nations
ORDER BY 1 DESC;

-- Concatenar y renombrar columna
SELECT
	name,
	heigth || ' cm' AS estatura_cm,
	(heigth/100.0) || ' m' AS estatura_m
FROM players;

-- jugadores que pasan los 2 metros
SELECT 
	name,
	heigth
FROM players
WHERE (heigth/100.0) >= 2.0
ORDER BY heigth DESC;

-- altura menor y mayor
SELECT
	MIN(heigth) AS menor_altura,
	MAX(heigth) AS mayor_altura
FROM players;

-- subconsultas 
SELECT
	*
FROM players
WHERE heigth =
(
	SELECT MAX(heigth) FROM players
);

SELECT
	*
FROM players
WHERE heigth =
(
	SELECT MIN(heigth) FROM players
);

-- IN
SELECT 
	*
FROM players
WHERE position_id IN (5, 2);

-- JOIN Y CTE
WITH pais_liga AS (
    -- Consulta que define el CTE
    SELECT 
		leagues.id AS liga_id,
		nations.name AS liga_pais
    FROM leagues INNER JOIN nations ON leagues.nation_id = nations.id
)

SELECT 
	players.name AS nombre,
	UPPER(nations.name) AS pais,
	teams.name AS club,
	leagues.name AS liga,
	pais_liga.liga_pais AS liga_pais,
	positions.name AS posicion
FROM players INNER JOIN positions ON players.position_id = positions.id
			INNER JOIN nations ON players.nation_id = nations.id
			INNER JOIN teams ON players.team_id = teams.id
			INNER JOIN leagues ON teams.league_id = leagues.id 
			INNER JOIN pais_liga ON leagues.id = pais_liga.liga_id
WHERE heigth =
(
	SELECT MAX(heigth) FROM players
) AND positions.name IN ('GK', 'CB')
ORDER BY positions.name;

-- los jugadores mas altos en que posiciones juegan y cuantos por posicion hay
SELECT 
	positions.name AS position_name,
	COUNT(*) AS position_count
FROM players INNER JOIN positions ON players.position_id = positions.id
WHERE players.heigth = (
	SELECT MAX(heigth)
	FROM players
)
GROUP BY positions.name
ORDER BY 2 DESC;

-- cantidad de futbolistas por pais
SELECT 
	nations.name AS nation_name,
	COUNT(*) AS nation_count
FROM players INNER JOIN nations ON players.nation_id = nations.id
GROUP BY 1
ORDER BY 2 DESC
LIMIT 5;





