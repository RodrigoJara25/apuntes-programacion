
library(ggpubr)
library(agricolae)
#------------------------------------------------------------------#
#                    FACTORIAL DCA SIMPLE                          #
#------------------------------------------------------------------#
dat<-read.delim("clipboard")
head(dat)
# Tranformamos en factor los factores
dat$Procesador <- factor(dat$Procesador)
dat$Arquitectura <- factor(dat$Arquitectura)

#------------------------------------------------------------------#
#                        Preba de Shapiro Wilk (normalidad)                    #
#------------------------------------------------------------------#
shapiro.test(rstandard(aov(Velocidad ~ Procesador*Arquitectura,data=dat)))
# W = 0.95205, p-value = 0.3
# H0: Los errores se distribuyen normalmente
# H1: Los errores no se distribuyen normalmente

#------------------------------------------------------------------#
#                  Pruebas de homogeneidad de varianzas            #
#------------------------------------------------------------------#
# H0: Los errores tienen varianza constante
# h1: Los errores no tienen varianza constante
library(car)
ncvTest(lm(Velocidad ~ Procesador*Arquitectura,data=dat))
# Chisquare = 0.004310231, Df = 1, p = 0.94765

#------------------------------------------------------------------#
#                         Análisis de varianza                     #
#------------------------------------------------------------------#
# H0: ab = 0 (no hay interaccion)
# h1: ab != 0 (si hay interaccion)
modelo=aov(lm(Velocidad ~ Procesador*Arquitectura,data=dat))
summary(modelo)
# estadístico F: 4.039, p-value: 0.0356
# rechazamos H0, con un nivel de significancia de 0.05 concluimos que si existe interacción
# entre el tipo de procesador y arquitectura.

#------------------------------------------------------------------#
#                          Comparaciones múltiples                 #
#------------------------------------------------------------------#

library(agricolae)

# H0: las interacciones son iguales
# H1: las interraciones son diferentes
# alfa = 0.05

b=HSD.test(aov(Velocidad ~ Procesador*Arquitectura,data=dat),
           c("Procesador","Arquitectura"),group=FALSE)[4]
b

a=HSD.test(aov(Velocidad ~ Procesador*Arquitectura,data=dat ),
           c("Procesador","Arquitectura"),group=TRUE)[5]
a
  
#                     Velocidad   groups
# Intel core:Risc       5.7975      a
# Raizen:Risc           5.5900      a
# Raizen:Harvard        4.6000      b
# Intel core:Cisc       4.4225      b
# Intel core:Harvard    4.0800      b
# Raizen:Cisc           4.0725      b

# Concluimos que hay dos grupos "a" y "b", y que no hay diferencia entre las combinaciones
# del mismo grupo. Entre las "a" y las "b".

# La combinación Intel core:Risc o Raizen:Risc tienen la mayor velocidad

# SI NO HUBIERA INTERACCIÓN ---------------------

c=HSD.test(aov(Velocidad ~ Procesador*Arquitectura,data=dat),
           c("Procesador"),group=FALSE)[4]
c

d=HSD.test(aov(Velocidad ~ Procesador*Arquitectura,data=dat ),
           c("Procesador"),group=TRUE)[5]
d

e=HSD.test(aov(Velocidad ~ Procesador*Arquitectura,data=dat),
           c("Arquitectura"),group=FALSE)[4]
e

f=HSD.test(aov(Velocidad ~ Procesador*Arquitectura,data=dat ),
           c("Arquitectura"),group=TRUE)[5]
f
