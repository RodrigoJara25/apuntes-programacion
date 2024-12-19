#GUIA 2 - Ejercicio 19

# A)

#H0: los datos tienen distribución normal
#H1: los datos no tienen distribución normal

datos <- c(35, 40, 38, 43, 38, 45, 35, 47, 41, 37, 39, 43, 49, 39, 34)

#FORMA 1... por gráfico
library(car)
qqPlot(datos)

#FORMA 2... Shapiro
shapiro.test(datos)

#p-value = 0.5911
#como p-value > alfa, entonces no se rechaza H0.

# B)

#Cuando los datos tienen distribucion normal, la media
#y la mediana son iguales. Por lo que se procede igual.

#H0: u <= 36
#H1: u > 36

t.test(datos, alternative = "greater")

#p-value = 2.561e-15
#como p-value < alfa, entonces se rechaza H0.
#El promedio si es mayor a 36 semanas.

#------------------------------------------------------------------------------
#GUIA 2 - EJERCICIO 23

# A) Prueba de normalidad

Campo <- c(14.8, 10.6, 7.3, 12.5, 5.6, 12.9, 6.3, 16.1, 9, 11.4, 4.2, 2.7)
Ciudad <- c(2.2, 16.9, 7.6, 2.4, 6.2, 1.2,
            14.2, 7.9, 2, 6.4, 6.1, 10.6,
            12.6, 16, 8.3, 9.1, 15.3, 14.8,
            2.1, 10.6, 6.7, 6.7, 10.6, 5,
            17.7, 5.6, 3.6, 18.6, 1.8, 2.6,
            11.8, 5.6, 1, 3.2, 5.9, 4)

#H0: los datos de los alumnos del campo tienen distribución normal
#H1: los datos de los alumnos del campo no tienen distribución normal

shapiro.test(Campo)

#W = 0.96891, p-value = 0.8991
#como p-value > alfa, entonces no se rechaza H0

#H0: los datos de los alumnos de la ciudad tienen distribución normal
#H1: los datos de los alumnos de la ciudad no tienen distribución normal

shapiro.test(Ciudad)

#W = 0.92669, p-value = 0.01988
#como p-value < alfa, entonces se rechaza H0.

# B)

# H0: u1 <= u2
# H1: u1 > u2

# H0: sigma^2 1 <= sigma^2 2
# H1: sigma^2 1 > sigma^2 2

var.test(Campo, Ciudad, alternative = "two.sided")

#F = 0.68402, num df = 11, denom df = 35, p-value = 0.512
#como p-value > alfa, no se rechaza H0. Varianzas iguales.

t.test(Campo, Ciudad, alternative = "greater", var.equal = TRUE)

#t = 0.9588, df = 46, p-value = 0.1713
#como p-value > alfa, no se rechaza H0.
