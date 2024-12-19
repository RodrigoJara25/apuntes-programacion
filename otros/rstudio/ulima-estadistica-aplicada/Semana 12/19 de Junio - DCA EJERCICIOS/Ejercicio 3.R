### EJERCICIO 3

# a) Indique la unidad experimental, la variable respuesta, el factor y sus niveles.
# Unidad experimental: cada alumno
# Variable respuesta: número de errores
# Factor: tipos de droga
# Niveles: droga 1, droga 2, droga 3

# b) Plantee el modelo estadístico.

# Yij = U + Tj + eij

# Yij: número de errores en el i-esimo alumno con la j-esima droga
# U: la media general del número de errores
# Tj: efecto de la j-esima droga
# eij: es el efecto del error experimental

# c) ¿El nivel del tipo de droga tiene efecto sobre el promedio de errores? Considere 𝛼 = 0.05.

# H0: U1 = U2 = U3
# H1: Al menos un Ui es diferente

library(readr)
df5 <- read_csv("C:/Users/Usuario/Desktop/Ciclo 2024-1/Estadística Aplicada/Semana 12/19 de Junio - DCA EJERCICIOS/Errores.csv")
df5

diseño3 <- lm(Errores~Droga, data=df5)
anova(diseño3)
# estadístico F = 42.295, p-value = 1.86e-09
# Como p-value < alfa, entonces se rechaza H0. Entonces existe evidencia estadística
# que sugiere que al menos un promedio del número de errores es diferente. Eso quiere decir que al
# menos un tipo de droga tiene efecto sobre el promedio de errores.

# d) ¿Se cumple el supuesto de normalidad? Considere 𝛼 = 0.05.

# H0: Los errores se distribuyen normalmente
# H1: Los errores no se distribuyen normalmente

shapiro.test(diseño3$residuals)

# W = 0.97205, p-value = 0.5388
# Como p-value > alfa, entonces no se rechaza H0. Entonces existe evidencia
# estadística que sugiere que los errores se distribuyen normalmente.

# e) ¿Se cumple el supuesto de homogeneidad de las varianzas? Use 𝛼 = 0.05.

# H0: existe homogeneidad de varianzas
# H1: no existe homogeneidad de varianzas

# H0: var1 = var2 = var3
# H1: Al menos una varianza es diferente

bartlett.test(Errores~Droga, data=df5)
# Bartlett's K-squared = 3.2654, df = 2, p-value = 0.1954
# Como p-value > alfa, entonces no se rechaza H0. Entonces existe evidencia 
# estadística que sugiere que las varianzas son iguales, por lo que si hay 
# homogeneidad de varianzas.

# f) Con 94% de confianza, ¿existe diferencia significativa en la cantidad de errores
# cometidos por los alumnos con la droga de tipo II y la droga de tipo I?

# PRUEBA DE COMPARACIONES MÚLTIPLES
# Método de Tukey

tapply(df5$Errores, df5$Droga, FUN = mean)
TukeyHSD(aov(diseño3), conf.level = 0.94)  

# como ninguna de las tres tiene el 0 dentro del intervalo, entonces
# si existe diferencia entre todos los tipos de droga.

# si tiene el 0 en el intervalo, son iguales

# H0: el promedio de tipo II = promedio de tipo I
# H1: el promedio de tipo II != promedio de tipo I
# p-value: 0.0384289

# Como p-value < H0, entonces se rechaza H0. ENtonces hay evidencia estadística
# que sugiere que el promedio del tipo II es diferente al tipo I

# ASI SE HACE CON LOS TRES P-VALUE

# La droga que causa más errores es la de Tipo III (tiene mayor promedio)

