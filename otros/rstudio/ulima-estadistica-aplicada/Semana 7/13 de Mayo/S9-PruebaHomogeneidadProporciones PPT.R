### ================================================================#
### Curso: Estadística Aplicada
### Tema: PRUEBA DE HOMOGENEIDAD DE PROPORCIONES
### Elaborado por: Vilma Romero
### ================================================================#

# EJEMPLO -----------------------------------------------------------------

# Ingreso de datos
prefieren <- c(130,125,135,140)
noprefieren <- c(70,75,65,60)

# Datos de manera matricial
resultados <- matrix(c(prefieren,noprefieren), nrow = 4, ncol = 2,
                     dimnames = list(c("Lima","Cusco","Arequipa","Trujillo"),
                                     c("Prefieren Z","No prefieren Z")))
resultados

# Planteamiento de hipótesis
# H0: La proporción de niños que prefieren el cereal Z en las 4 ciudades son iguales
# H1:La proporción de niños que prefieren el cereal Z en las 4 ciudades no son iguales

# Prueba de homogeneidad de proporciones
chisq.test(resultados)

# Región crítica
# RC = <7.814728, Inf+>
qchisq(1-0.05,3)

# Valor del estadístico de prueba (chi2_0)
chisq.test(resultados)$statistic

# Como chi2_0 = 2.795 no está en RC => No se rechaza la hipótesis nula.
# Se concluye que no existe suficiente evidencia para decir que la proporción de niños a favor del cereal Z es diferente en las 4 ciudades, al 5% de significación.


# Método alternativo (usando p-value)
chisq.test(resultados)$p.value

# Como p-value = 0.4242828 > 0.05 => No se rechaza la hipótesis nula.

