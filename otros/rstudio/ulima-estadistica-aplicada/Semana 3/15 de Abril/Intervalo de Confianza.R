#Ejemplo
horas <- c(9, 8, 7, 4, 8, 6, 8, 8, 7, 10, 8, 10, 6, 7, 7, 8, 9,
           6, 5, 8, 5, 6, 8, 7, 8, 5, 5, 8, 7, 6, 6, 4, 5, 6)

media <- mean(horas)
media
s <- sd(horas)   #desviacion estandar
s
#n <- length(horas)
n <- 34
n
#alfa <- (1-0.9)
alfa <- 0.1
ts <- qt(1-alfa/2, n-1) #distribución t
ME <- ts*s/sqrt(n)
ME
LI <- media-ME   #limite inferior
LS <- media + ME   #limite superior
c(LI, LS)

#A un 90% de confianza el tiempo que escuchan semanalmente es entre
#6.45 y 7.36 horas.


#forma resumida
t.test(horas, conf.level = 0.9)

#esta fórmula funciona solo si tienes los datos sueltos, si no tienes
#sumar y restar el margen de error

t.test(horas, conf.level = 0.9)$conf



#Ejemplo
install.packages("TeachingDemos")
library(TeachingDemos)

#"Ejercicio 1"
media <- 305
media
s <- sqrt(25.07)
s
#n <- length(horas)
n <- 31
n
#alfa <- (1-0.9)
alfa <- 0.1
ts <- qt(1-alfa/2, n-1) #distribución t
ME <- ts*s/sqrt(n)
ME
LI <- media-ME   #limite inferior
LS <- media + ME   #limite superior
c(LI, LS)
#El peso medio de los artíclos producidos por la máquina está entre 303.47 y 306.52 gramos


#Ejercicio 2
library(TeachingDemos)

media <- 308
media
sigma <- sqrt(34)
sigma
#n <- length(horas)
n <- 36
n
#alfa <- (1-0.95)
alfa <- 0.05
zc <- qnorm(1-alfa/2) #distribución normal
ME <- zc*sigma/sqrt(n)
ME
LI <- media-ME   #limite inferior
LS <- media + ME   #limite superior
c(LI, LS)

z.test(308, stdev = sqrt(34) , n = 36, conf.level = 0.95)$conf
#El peso medio está entre 306.09 y 309.90