df <- read.delim("clipboard")
df

#Ejercicio 20

#### 20 a)
monto <- df$Monto

x <- c(monto)
x
t.test(x, conf.level =0.95)$conf
# A un 95% de confianza, el monto se encuentra entre 1157.131 y 1276.409 dólares
# El estimador es la media

# Extra: Halla Margen de Error

LongitudIntervalo <- 1276.409 - 1157.131
MargenError <- LongitudIntervalo/2
MargenError
#--------------------------------------------------------------

### 20 b)
monto <- df$Monto
x <- c(monto)   #conjunto de datos
x
n <- length(monto)  #tamaño muestra: length(monto)

library(TeachingDemos)
sqrt(sigma.test(x = x, n = n , conf.level = 0.92)$conf.int)

# A un 92% de confianza, la desviación estandar del monto de préstamos está entre 924.9202 y 1000.3196 
#Solo cumple si todo el intervalo supera la condición.

#---------------------------------------------------------------

### 20 c)

hijos <- df$Hijos
table(hijos)
x <- 146 + 125    #cantidad de clientes con más de un hijo
x
p <- x/1000       #proporción
p
library(binom)
#En este caso "x" es la cantidad de hijos mayor a [condicion]
binom.confint(x = x , n =1000 , conf.level = 0.9, methods = "asymptotic")

#A un 90% la proporción del lciente que tiene más de 1 hijo es entre 0.2434516 y 0.2985484

#EXTRA: Halle el intervalo de confianza para el Monto, pero solo
#para los clientes de género femenino

femenino <- subset(df, Género == "Femenino")   #con esto filtras solo el género femenino
femenino
x <- c(femenino$Monto)  #De este monto, haces el intervalo de confianza
x
t.test(x=x, conf.level =0.95)$conf
#----------------------------------------------------------------

### 20 d)

#Nos piden tamaño de la muestra para la media

e = 300   #error
S = sd(df$Monto)   #Desviación estándar del monto

library(samplingbook)
sample.size.mean(e = e, S = S, level = 0.95)

#Hay una muestra de 40 clientes.

#-----------------------------------------------------------------

### 20 e)

#Nos piden tamaño de muestra para la proporción

e <- 0.04    #el error es en % en esta fórmula

alquilada <- df$Vivienda
table(alquilada)

x <- 484    #Cantidad de personas que cumplen con [condicion]

P <- x / 1000             #proporción: [condicion] / tamaño muestra


library(samplingbook)
sample.size.prop(e = 0.04, P = P, level = 0.95)




