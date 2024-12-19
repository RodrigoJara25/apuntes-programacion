##Ejemplos

#Se toma una muestra de 34 personas que escuchen radio y
# se determina la cantidad de horas, por semana que
# escuchan la radio. Los datos se muestran a continuación:

horas <- c(9, 8, 7, 4, 8, 6, 8, 8, 7, 10, 8, 10, 6, 7, 7, 8, 9,
           6, 5, 8, 5, 6, 8, 7, 8, 5, 5, 8, 7, 6, 6, 4, 5, 6)

# A) Determinar el intervalo de confianza a un nivel del 90% de confianza para
# la verdadera media de la cantidad de horas por semana que escuchan radio
# y ¿se podrá afirmar que el valor de 5 cae dentro de este intervalo?

t.test(horas, conf.level = 0.9)$conf

# Con un 90% de confianza la media de la cantidad de horas por semana que
# escuchan radio esta entre 6.457794 y 7.365736 horas. El valor de 5 no cae
# dentro del intervalo.

# B) ¿Se puede afirmar que la media de la cantidad de horas por semana que
# escuchan radio es superior a 5 horas por semana? Evalúe a un nivel de
# confianza del 90%.

# La cantidad de horas si es superior a 5 (el intervalo empieza en 6.457794)

# C) ¿Se puede afirmar que la media de la cantidad de horas por semana que
# escuchan radio es diferente a 6.3 horas por semana? Evalúe a un nivel de
# confianza del 95%

t.test(horas, conf.level = 0.95)$conf

# IC: 6.366012 - 7.457518
#Si es diferente a 6.3 horas

#-------------------------------------------------------------------------------

##Ejemplos

# Suponga que dos máquinas A y B producen en forma independiente un mismo 
# artículo y que en un estudio para analizar el sistema de producción se 
# encontró los siguientes resultados:
  

# a) Hallar e interpretar un intervalo del 90% de confianza para
# el peso medio de los artículos producidos por la máquina A

# como no tenemos los datos en vector, debemos usar la fórmula manual

media <- 305
S <- sqrt(25.07)
alfa <- 1-0.9
n <- 31
t <- qt(1-alfa/2, n-1)
IL <- media - t*S/sqrt(n)
IR <- media + t*S/sqrt(n)
c(IL,IR)

# A un 90% de confianza el peso medio de los artículos producidos por la máquina A
# está entre 303.4737 y 306.5263.


# b) Hallar e interpretar un intervalo del 95% de confianza para el peso 
# medio de los artículos producidos por la máquina B, si se conoce que 2=34

#OJO: te dan la varianza poblacional

install.packages("TeachingDemos")
library(TeachingDemos)
z.test(308, stdev = sqrt(34), n = 36, conf.level = 0.95)$conf

# A un 90% de confianza, el peso medio está entre 306.0953 y 309.9047 gramos


# c) Hallar e interpretar un intervalo del 90% de confianza para la variancia 
# y la desviación estándar de los pesos de los artículos producidos por la
# máquina A.

#library(TeachingDemos)
#sigma.test(x=,n=,conf.level = )   --->  no se puede utilizar xq no hay vector de datos

n <- 31
s <- sqrt(25.07)
alfa <- 1-0.9
XI <- qchisq(1-alfa/2, n-1)
XR <- qchisq(alfa/2, n-1)

IL <- ((n-1)*s*s)/XI
IR <- ((n-1)*s*s)/XR 

c(IL,IR)

# A un 90% de confianza, el intervalo esta entre 17.18184 y 40.67019


# d) Hallar un intervalo de confianza al 95% para la proporción de
# artículos que cuyo peso es mayor a 310 gramos

# OJO: acá si se puede usar formula sin vector de datos

n <- 31   #muestra
x1 <- 4   #objetos mayores a 310
pest <- x1/n    #proporcion
alfa <- 0.05
z <- qnorm(1-alfa/2)
ME <- z*sqrt(pest*(1-pest)/n)
IC <- pest+c(-1,+1)*ME
IC

IR <- pest + ME
IR

IL <- pest - ME
IL

install.packages("binom")
library(binom)
binom.confint(x = 4, n = 31, conf.level = 0.95, methods = "asymptotic")
