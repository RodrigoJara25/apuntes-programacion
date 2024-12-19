##### EJERCICIOS DISEÑO COMPLETAMENTE ALEATORIO - ANOVA

### EJERICIO 4 ---------------------------------------------

# a) Indique la unidad experimental, la variable respuesta, el factor y sus niveles.
# Unidad experimental: cada lote
# Variable respuesta: rendimiento
# Factor: nivel de temperatura
# Niveles: 50, 60 y 70 grados

# b) ¿El nivel de temperatura tiene efecto sobre la media del rendimiento del proceso químico? Use alfa = 0.05

# H0: u1 = u2 = u3  (el promedio con la temératura en 50, 60 y 70 son iguales)
# H1: Al menos un u es diferente
# estadísitico F   , p-value

df <- read.delim("clipboard")
df
df$Temperaturas <- factor(df$Temperaturas) # la temperatura es una variable cualitativa, son niveles, por eso se usa factor(no se pusieron los C°)
df

diseño1 <- lm(Rendimiento~Temperaturas, data=df)
anova(diseño1)

# F 1.7797
# p-value 0.2104

# Como p-value > alfa, entonces no se rechaza H0. Entonces hay evidencia estadística para asegurar que 
# los promedios con las temperaturas 50, 60 y 70°C son iguales. Que la temperatura no influye 
# en el rendimiento de los lotes

# Si no se cumple la primera condición, entonces ahi termina, peor supondremos que si cumplió
# Ahora probramos la NORMALIDAD

diseño1$residuals  # (hay 15 datos) se usa Shapiro
library(nortest)
shapiro.test(diseño1$residuals)

# H0: los errores se distribuyen normalmente
# H1: los errores no se distribuyen normalmente
# W = 0.94349, p-value = 0.4283

# Como p-value > alfa, no se rechaza H0. Por lo que si se cumple la normalidad



