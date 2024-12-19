### Ejercicio 5

# Unidad experimental: cada pedido
# Variable respuesta: el peso 
# Factor: Embutidos y Fiambres
# Niveles: salchichas, jamonada y chorizo

# a) ¿Qué tipo de estudio realizó el departamento analítico de Metro?
# Este estudio es un diseño de experimento

# b) Realizar una prueba de análisis de varianza para determinar si hay alguna
# evidencia que sugiera que al menos dos de los pesos medios de la población
# son diferentes. Use 𝛼 = 0.03

library(readr)
Metro <- read_csv("C:/Users/Usuario/Desktop/Ciclo 2024-1/Estadística Aplicada/Semana 12/17 de Junio - Diseño Completamente Aleatorio/Ejercicios/Metro.csv")
Metro

# H0: u1 = u2 = u2
# H1: Al menos un u es diferente

diseño2 <- lm(Peso~Producto, data=Metro)
anova(diseño2)

# estadístico F: 6.3452
# p-value: 0.004114

# Como el p-value < alfa, entonces se rechaza H0. 
# Entonces hay evidencia estadística que sugiere que al menos un promedio de los pesos (con cualquiera
# de los 3 productos) es diferente.

# PRUEBA DE NORMALIDAD

# HO: Los errores se distribuyen normalmente
# H1: Los errores no se distribuyen normalmente

shapiro.test(diseño2$residuals)
# W = 0.98271, p-value = 0.7653

# Como p-value > alfa, entonces no se rechaza H0. 
# Entonces existe evidencia estadística que sugiere que los errores se dsitribuyen normalmente

# PRUEBA DE HOMOGENEIDAD

# H0: existe homogeneidad de varianzas
# H1: no existe homogeneidad de varianzas

bartlett.test(Metro$Peso~Metro$Producto)
# Bartlett's K-squared = 1.48, p-value = 0.4771

# como p-value > alfa, no se rechaza H0. Entonces hay evidencia
# estadística que sugiere que si existe homogeneidad de varianzas.

# PRUEBA DE COMPARACIONES MÚLTIPLES

# Método de Tukey (el objetivo es identificar cuál de los 3 productos tiene mayor peso)
tapply(Metro$Peso, Metro$Producto, FUN = mean)  # acá te dan los 3 promedios de los pesos separados por producto
# Chorizo    Jamonada   Salchichas 
# 0.9592857  0.7292857  0.9657143 

TukeyHSD(aov(diseño2), conf.level = 0.95)  
#                             diff         lwr         upr     p adj
# Jamonada-Chorizo    -0.230000000 -0.41422236 -0.04577764 0.0114262  
# Salchichas-Chorizo   0.006428571 -0.17779379  0.19065093 0.9960235  
# Salchichas-Jamonada  0.236428571  0.05220621  0.42065093 0.0091445

# Si el 0 está en el intervalo, quiere decir que son iguales estadísticamente.
# Si no está el 0, quiere decir que estadísticamente no son iguales.

# CONCLUSIÓN: comparamos el promedio entre los dos grupos que no tiene 0.
# El mayor entre ellos dos 

# Jamonada-Chorizo
# H0: el promedio de jamonada = promedio de chorizo
# H1: el promedio de jamonada != promedio de chorizo
# p-value: 0.0114262
# Como p-value < alfa, se rechaza H0. Enotnces si existe diferencia.

# Salchichas-Chorizo
# H0: promedio de salchichas = promedio de Chorizo
# H1: promedio de salchichas != promedio de Chorizo
# p-value: 0.9960235
# Como p-value > alfa, no se rechaza H0. Entonces la salchicha con el chorizo son iguales

# c) Con 96% de confianza, ¿existe diferencia significativa en la cantidad de
# salchicha y jamonada que piden los clientes?

# Con intervalo de confianza podemos concuir que entre salchicha-chorizo, no hay diferencia, son iguales.
# Con intervalo de confianza podemos concluir que entre salchicha-jamonada si hay diferencia.

