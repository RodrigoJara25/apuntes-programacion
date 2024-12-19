-- Todas las sedes
SELECT * FROM branches;
-- Todas las sedes que están en una avenida
SELECT * FROM branches 
WHERE address LIKE 'AV.%';
-- Todas las sedes que se llamen COMAS
SELECT * FROM branches  
WHERE name = 'COMAS';
-- Unión de todas las sedes se llamen COMAS y SAN BORJA 1
SELECT address FROM branches 
WHERE name = 'COMAS' 
UNION 
SELECT address FROM branches 
WHERE name = 'SAN BORJA 1'; 
-- Union de positions con branch_types
SELECT * FROM branch_types 
UNION
SELECT * FROM positions;
-- Union de sedes que están en una avenida todas las sedes se llamen COMAS o JESUS MARIA
SELECT * FROM branches -- A
WHERE address LIKE 'AV.%'
UNION  -- (A U B)
SELECT * FROM branches  -- B
WHERE name = 'COMAS' OR name = 'JESUS MARIA';
-- Interseccion de sedes que están en una avenida todas las sedes se llamen COMAS o JESUS MARIA
SELECT * FROM branches -- A
WHERE address LIKE 'AV.%'
INTERSECT -- (A ∩ B)
SELECT * FROM branches  -- B
WHERE name = 'COMAS' OR name = 'JESUS MARIA';
-- La sedes que están en una avenida pero no sean las sedes se llamen COMAS o JESUS MARIA
SELECT * FROM branches -- A
WHERE address LIKE 'AV.%'
EXCEPT -- (A - B)
SELECT * FROM branches  -- B
WHERE name = 'COMAS' OR name = 'JESUS MARIA';
-- el complemneto de las sedes que estan en una avenida menos las sedes se llamen COMAS o JESUS MARIA
SELECT * FROM branches -- Aᶜ
WHERE address NOT LIKE 'AV.%'
UNION 
SELECT * FROM branches  -- B
WHERE name = 'COMAS' OR name = 'JESUS MARIA'; -- Aᶜ U B

SELECT * FROM branches -- Aᶜ
WHERE address NOT LIKE 'AV.%'
UNION 
SELECT * FROM branches  -- B
WHERE name = 'COMAS' OR name = 'JESUS MARIA'
-- el complemneto de las sedes que estan en una avenida menos las sedes se llamen 
-- COMAS o JESUS MARIA y que se encuentren en LIMA(branch_type_id=1)
SELECT * FROM (
	SELECT * FROM branches -- Aᶜ
	WHERE address NOT LIKE 'AV.%'
	UNION 
	SELECT * FROM branches  -- B
	WHERE name = 'COMAS' OR name = 'JESUS MARIA'
) WHERE branch_type_id = 2; 
-- el complemneto de las sedes que estan en una avenida menos las sedes se llamen 
-- COMAS o JESUS MARIA y que se encuentren en LIMA
SELECT * FROM (
	SELECT * FROM branches -- Aᶜ
	WHERE address NOT LIKE 'AV.%'
	UNION 
	SELECT * FROM branches  -- B
	WHERE name = 'COMAS' OR name = 'JESUS MARIA'
) SC INNER JOIN branch_types BT ON SC.branch_type_id = BT.id
WHERE BT.name = 'LIMA';
SELECT * FROM (
	SELECT * FROM branches -- Aᶜ
	WHERE address NOT LIKE 'AV.%'
	UNION 
	SELECT * FROM branches  -- B
	WHERE name = 'COMAS' OR name = 'JESUS MARIA'
) SC INNER JOIN branch_types BT ON SC.branch_type_id = BT.id
WHERE whatsapp = '';