import P3Data (PersonaInfo, dataPersonas)

-- Pregunta 3

{-
PREGUNTA 3 (7 puntos)
Se le ha entregado el archivo P3Data.hs donde se encuentra especificado un type 
y una lista de datos de 
personas. Implementar una función llamada porcentajeFumadores que devuelva una 
tupla con el porcentaje 
de hombres que fuman y el porcentaje de mujeres que fuman. Debe implementar su 
código en el archivo p3.hs.
Tip: Manejar las cantidades como Float.
-}
porcentajeFumadores :: [(PersonaInfo)] -> (Float, Float)
porcentajeFumadores listaPersonas =
    porcentajeFumadores2 listaPersonas 0 0 0 0

porcentajeFumadores2 :: [(PersonaInfo)] -> Float -> Float -> Float -> Float -> (Float, Float)
porcentajeFumadores2 [] contH contM totalH totalM = porcentaje contH contM totalH totalM
porcentajeFumadores2 (x:xs) contH contM totalH totalM =
     if fumadores x == "yes" && genero x == "Female" then porcentajeFumadores2 xs contH (contM + 1) totalH (totalM + 1)
     else
        if fumadores x == "yes" && genero x == "Male" then porcentajeFumadores2 xs (contH + 1) contM (totalH + 1) totalM
        else 
            if fumadores x == "no" && genero x == "Female" then porcentajeFumadores2 xs contH contM totalH (totalM+1)
            else porcentajeFumadores2 xs contH contM (totalH + 1) totalM

porcentaje :: Float -> Float -> Float -> Float -> (Float, Float)     
porcentaje contH contM totalH totalM = ((contH/totalH)*100, (contM/totalM)*100)

fumadores :: (PersonaInfo) -> String
fumadores (_, _, _, _, smoke, _, _, _) = smoke

genero :: (PersonaInfo) -> String
genero (_, gender, _, _, _, _, _, _) = gender

{-
PREGUNTA 4 (4 puntos)

También debe utilizar para esta pregunta el archivo P3Data.hs. Implementar una función llamada 
mediosTransporte que devuelva la cantidad de personas cuyo medio de transporte es 
Public_Transportation (transporte público) y la obesidad del padre (NObeyesdad) es “Normal_Weight”
-}

mediosTransporte :: [(PersonaInfo)] -> Float 
mediosTransporte listaPersonas =
    mediosTransporte1 listaPersonas 0

mediosTransporte1 :: [(PersonaInfo)] -> Float -> Float
mediosTransporte1 listaPersonas contador =
    if null listaPersonas
        then contador
    else
        if transporte (head listaPersonas) == "Public_Transportation" && obesidad (head listaPersonas) == "Normal_Weight"
            then mediosTransporte1 (tail listaPersonas) (contador + 1)
        else
            mediosTransporte1 (tail listaPersonas) (contador)

transporte :: (PersonaInfo) -> String
transporte (_, _, _, _, _, _, transport, _) = transport

obesidad :: (PersonaInfo) -> String
obesidad (_, _, _, _, _, _, _, obesidad) = obesidad

