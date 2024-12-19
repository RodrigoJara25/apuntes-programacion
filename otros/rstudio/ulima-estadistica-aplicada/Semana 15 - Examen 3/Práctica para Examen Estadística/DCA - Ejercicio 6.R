### EJERCICIO 6

# Unidad experimental: cada muestra  
# Variable respuesta: tiempo de secado
# Factor: el tipo de pintura
# Niveles: pintura 1, pintura 2, pintura 3, pintura 4

# a) ¿Qué tipo de estudio se realizó?
# Se realizó un estudio de experimentos

# b) ¿El tipo de pintura tiene efecto sobre el tiempo medio de secado? Use 𝛼 = 0.05
# (en otras palabras nos preguntan si algun tipo de pintura seca diferente)

# H0: U1 = U2 = U3 = U4
# H1: Al menos un U es diferente

df <- read.delim("clipboard")
df

diseño3 <- lm(Tiempo~Pintura, data=df)
anova(diseño3)
# estadístico F = 2.5434, p-value = 0.09276 

# Como p-value > alfa, entonces no se rechaza H0.
# Hay evidencia estadística que sugiere que el promedio del tiempo de secado de los 4 tipos
# de pintura es el mismo

# CONCLUSIÓN: SON IGUALES