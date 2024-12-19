### EJERCICIO 7

# Unidad experimental:  cada automóvil
# Variable respuesta: rendimiento de combustible
# Factor: Marca de automovil
# Niveles: A, B, C, D

df7 <- read.delim("clipboard")
df7

# H0: Ua = Ub = Uc = Ud
# H1: Al menos un Ui es diferente

diseño7 <- lm(Rendimiento~Marcas, data=df7)
anova(diseño7)
# estadístico F: 7.5494
# p-value: 0.001441 

# Como p-value < alfa, entonces se rechaza H0. Entonces existe evidencia
# estadística para sugerir que al menos un promedio de rendimiento en alguna marca de automovil es diferente.

tapply(df7$Rendimiento, df7$Marcas, FUN = mean)
TukeyHSD(aov(diseño7), conf.level = 0.94) 
