

###EJERCICIO 20 - MARKEING DIRECTO

tabla <- read.delim("clipboard")
tabla

gasto <- c(tabla$Monto)
t.test(gasto, conf.level = 0.95)$conf

# a) 1157.131 y 1276.409

library(TeachingDemos)
sqrt(sigma.test(x = gasto, n = 1000, conf.level = 0.92)$conf.int)

# b) 924.9202 y 1000.3196

hijos <- c(tabla$Hijos)
table(hijos)

condicion <- 146 + 125 

library(binom)
binom.confint(x = condicion, n = length(hijos), conf.level = 0.9, methods = "asymptotic")

# c) 0.2478806 y 0.2941194

gasto <- c(tabla$Monto)

library(samplingbook)
sample.size.mean(e = 300, S = sd(gasto), level = 0.95)

# d) hay una muestra de 40 clientes

alquilada <- tabla$Vivienda
table(alquilada)
condicion <- 484


library(samplingbook)
sample.size.prop(e = 0.04, P = 484/1000, level = 0.95)

# e) muestra 600



