-- 17. Con respecto al ejercicio anterior, debido a la campaña escolar, los cuadernos se encuentran con 15% de descuento. 
-- Teniendo en cuenta esta información, calcular el total a pagar.
-- [("Lapicero", 5, 2.00),("Borrador", 1, 3.00),("Cuaderno", 3, 8.00),("Tijeras", 1, 2.50)]

pregunta17 :: [(String, Float, Float)] -> Float
pregunta17 lista = 
    sum
    (map (\(nombre, cantidad, precio) ->
            if nombre == "Cuaderno"
                then cantidad*precio*0.75
            else
                cantidad * precio) lista)