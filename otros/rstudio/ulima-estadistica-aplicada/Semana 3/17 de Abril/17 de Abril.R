#=======================================================#
#            ESTADÍSTICA INFERENCIAL                    #
#=======================================================#
#------------------------------------------------------------------#
#     Intervalos de confianza                                      #
#------------------------------------------------------------------#

# Ejercicio b)
# Intervalo de confianza con varianza (poblacional) conocida
xbar <- 308 #media
sigma <- sqrt(34)  #varianza 
n <- 36  #muestra
alfa <- 0.05   #1-0.95
Z <- qnorm(1-alfa/2)
ME <- Z*sigma/sqrt(n)
IC <- xbar + c(-1,1)*ME
IC

# Ejercicio b)

## Directamente con paquete (datos resumidos)
library(TeachingDemos)
z.test(308, stdev= sqrt(34), n=36, conf.level= 0.95)$conf.int

set.seed(21)
x <- rnorm(n=36, mean=308, sd=sqrt(34))
x

z.test(x, stdev= sqrt(34), conf.level= 0.95)$conf.int

# Ejercicio a)

# Intervalo para la media con varianza desconocida 

#t.test(n,conf.level= 0.90)$conf.int  #si tenemos los datos sueltos
                                    #podemos usar esta fórmula

xbar <- 305
s <- sqrt(25.07)
n <- 31 
alfa <- 0.10
t <- qt(1-alfa/2, n-1)
ME <- t*s/sqrt(n)
IC <- xbar + c(-1,1)*ME
IC

# Ejercicio c)

s2 <- 25.07  #varianza
n <- 31      #tamaño muestra
alfa <- 0.1  #cofnianza
LI=(n-1)*s2/qchisq(1-alfa/2, n-1)
LS=(n-1)*s2/qchisq(alfa/2, n-1)
LI
LS

library(TeachingDemos)
sigma.test(x = x, n = 31, conf.level =0.9 )
#si te dan un vector de datos (es un ejemplo lo de arriba)

#a un 90% la varianza se encuentra entre 17.18 y 40.67 gramos al cuadrado

library(remotes)
devtools::install_github('fhernanb/stests', force=TRUE)
library(stests)  # Para cargar el paquete

var.test(x=x, conf.level=0.90)$conf.int

# Ejercicio d)

# Intervalo de confianza para la proporción

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

## Directamente con paquete
library(binom)
binom.confint(x = 4, n = 31, conf.level = 0.95, methods = "asymptotic")

# 3.3. Escenario 3 --------------------------------------------------------
# No asumir normalidad en los datos.
# Para este escenario, se puede utilizar un IC Bootstrap.

# Suponga que tenemos la edad de 50 alumnos
x <- runif(n=50, 17, 22)
x
# Cantidad de veces para remuestrear
nboostraps <- 1000
n <- 10

bestimado <- rep(NA, nboostraps)
for(i in 1:nboostraps){
  # Tomar la muestra
  bmuestra <- sample(x, n, replace = T)
  # Calcular estimación bootstrap
  bestimado[i] <- mean(bmuestra)
}

# IC Bootstrap al 95%
alfa <- 0.05
LI <- quantile(bestimado, alfa/2)
LS <- quantile(bestimado, 1-alfa/2)
c(LI, LS)
