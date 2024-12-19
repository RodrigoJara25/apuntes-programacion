## EJERCICIO 8

tabla <- matrix(c(245,	228,	177,	219, 31,	27,	13,	10), nrow=2, ncol = 4, byrow = TRUE,
                dimnames = list(c("Nutrición buena","Nutrición pobre"),c("< 80",	"80 - 90",	"90 - 99",	"≥100")))
tabla

#Indique si existe asociación entre las variables

chisq.test(tabla)

#9.7514 -> osea si existe asociación

#La fuerza de asociación
# nominal(nutrición) x nominal(coeficiente)

library(vcd)
assocstats(tabla)

#Cramer's V: 0.101, es decir casi no se relacionan
#-------------------------------------------------------------------

##EJERCICIO 9

tabla9 <- read.delim("clipboard")
tabla9

# Rendimiento (Ordinal) x Antiguedad (Continuo)
# Kendall o Spearman: "más adecuado" es Spearman

tabla9$Rendimiento <- factor(tabla9$Rendimiento, levels = c("Muy bajo", "Bajo", "Medio", "Alto", "Muy alto"), ordered=TRUE)
str(tabla9)

cor(as.numeric(tabla9$Rendimiento), tabla9$Antigüedad, method = "spearman")
#La asociación entre el Rendimiento y la Antiguedad de la planta es de 0.5303753 

#--------------------------------------------------------------------

##EJERCICIO 10

tabla10 <- read.delim("clipboard")
tabla10

# Espacio (Continua) x Ventas (Continua)
# Pearson o Spearman: Pearson es más precisa

plot(tabla10$Espacio, tabla10$Ventas)    #diagrama de dispersión

#¿Es lineal? Si. Al ser una asociación linea, entonces se puede usar pearson

cor(tabla10$Espacio, tabla10$Ventas)     #correlación de Pearson

# 0.83 -> es una correlación directa/positiva y fuerte.

