dat <- read.delim("clipboard")
dat

# H0: u1=u2=u3=u4=u5  (los 5 promedios de tratamientos son iguales)
# h1: Al menos un ui es diferente

modelo1 <- lm(Tiempo~ Método + Bloque, data=dat) # cuando se le agrega el bloque, se vuelve en DBCA
anova(modelo1)

# Tomamos el F y p-value de los métodos, no de los bloques
# Estadístico F: 82.116
# P-value: 1.301e-08
# Como p-value < alfa, se rechaza H0.

# supuestos --------

# Supuesto de normalidad
# H0: Los errores se distribuyen normalmente
# H1: Los errores no se distribuyen normalmente

shapiro.test(modelo1$residuals)
# W = 0.95464, p-value = 0.4431
# No se rechaza H0.

# Supuesto de homogeneidad
# H0: Los errores tienen varianza constante (homogenidad)
# H1: Los errores no tienen varianza constante (no homogenidad)

library(car)
ncvTest(modelo1)
# Chisquare = 0.02477797, Df = 1, p = 0.87492
# No se rechaza H0.


# COMPARACIONES MÚLTIPLES -------------------------------------------------
# Método de Tukey
tapply(dat$Tiempo, dat$Método, mean)
TukeyHSD(aov(modelo1), conf.level = 0.95) # me interesa solo los bloques

# H0: UA = UB
# H1: UA dif UB

# El método "D" es el más efectivo
plot(TukeyHSD(aov(modelo1), conf.level = 0.95))
