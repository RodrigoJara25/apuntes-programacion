#PARTE II

#parte ii - 1

datos <- read.delim("clipboard")
datos

n <- 420
n

var(datos$Cantidad)
var(datos$Tiempo)

install.packages("e1071")
library(e1071)
skewness(datos$Tiempo)


regular <- datos$Tipo_vuelo
str(regular)
table(regular)


datos_regular <- read.delim("clipboard")
datos_regular

datos_regular$Nivel <- factor(datos_regular$Nivel, levels = c("Bajo", "Medio", "Alto"), ordered = TRUE)

cor(datos_regular$Tiempo, as.numeric(datos_regular$Nivel))




retrasado <- datos$Estado
table(retrasado)

x <- 197
n <- 420

install.packages("binom")
library(binom)
binom.confint(x = x, n = n, conf.level = 0.92, methods = "asymptotic")

install.packages("samplingbook")
library(samplingbook)

P <- 197/420
P
sample.size.prop(e = 0.04, P = P, level = 0.92)


table(retrasado)


low_costo <- datos$Tipo_vuelo
table(low_costo)

library(binom)
binom.confint(x = 151, n = 420, conf.level = 0.97,
              methods = "asymptotic")

tabla15 <- read.delim("clipboard")
tabla15

tiempo <- tabla15$Tiempo
tiempo

t.test(x = tiempo, conf.level = 0.99)$conf
