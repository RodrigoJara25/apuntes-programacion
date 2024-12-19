### =======================================================#
### Curso: Estadística Aplicada
### Tema: PRUEBA DE HIPÓTESIS PARA LA MEDIA DE UNA POBLACIÓN
### Elaborado por: Vilma Romero
### =======================================================#

# CASO : VARIANZA POBLACIONAL DESCONOCIDA  -------------------------------

# EJEMPLO 3
# H0: mu <= 100 
# H1: mu > 100
t0 <- (109.4 - 100)/(9.963/sqrt(15))

# Solución Alternativa
install.packages("BSDA")
library(BSDA)

tsum.test(mean.x = 109.4, s.x = 9.963, n.x = 15, mu = 100, alternative = "greater")
# "greater" es derecha, "less" es izquierda, "two sided" es bilateral.

# EJEMPLO 4
# H0: mu = 6.5 
# H1: mu < 6.5

tiempos <- c(6.61,6.25,6.40,6.57,6.35,5.95,6.53,6.29)

t.test(tiempos, mu = 6.5, alternative = "less")


# EJEMPLO 5
# H0: mu = 50
# H1: mu > 50

mensajes <- c(51,175,47,49,44,54,145,203,21,59,42,100)

t.test(mensajes, mu = 50, alternative = "greater")

