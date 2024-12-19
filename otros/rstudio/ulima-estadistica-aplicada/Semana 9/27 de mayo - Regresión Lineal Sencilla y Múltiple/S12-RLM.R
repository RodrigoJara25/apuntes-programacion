# =============================================================================
### Curso: Estadística Aplicada
### Tema: REGRESIÓN LINEAL MÚLTIPLE
### Elaborado por: Vilma Romero
# =============================================================================

# Base de datos "Advertising.csv", tomada del libro "An introduction to Statistical Learning with applications in R" (James et al, 2014). 
# Información sobre las ventas de diferentes productos (en miles de unidades) en función de presupuestos (en miles de dólares) invertidos en distintos medios de comunicación como televisión, radio y periódico.

# Lectura de datos
library(readr)
publicidad <- read_csv("Advertising.csv")
View(publicidad)
publicidad

# Removemos la primera columna que no es de nuestro interés
publicidad <- publicidad[,2:5]
publicidad

# Cambiamos los nombres de las columnas
names(publicidad) <- c("TV", "Radio", "Periodico", "Ventas")
publicidad

# ESTIMACIÓN DE COEFICIENTES ----------------------------------------------
lm(Ventas ~ TV + Radio + Periodico, data = publicidad)
#lm: lineal mode
#Variable Y: ventas, en función de TV, Radio y Periódico
#data: donde se encuentran las variables

#Estas respuestas son los "betas"
#Ventas = 2.938889 + 0.045765*TV + 0.188530*Radio - 0.001037*Periodico
 
# lm(Ventas ~ ., data = publicidad)  (Si hay muchas variables)
lm(Ventas ~ ., data = publicidad)

# INTERVALO DE CONFIANZA DE LOS COEFICIENTES
# Modelo de Regresión Lineal Múltiple
modelo <- lm(Ventas ~ TV + Radio + Periodico, data = publicidad)

# IC al 95% de los coeficientes de regresión
confint(modelo, level = 0.95)

#INTERPRETACION. Por cada 1000 dolares que se invierten en radio, las ventas aumentan en 0.188530 miles de unidades. 

# SIGNIFICANCIA DE LA REGRESIÓN -------------------------------------------

# Mostrar los resultados del modelo
summary(modelo)

#Las variables que no tengan ninguna * significa que no aportan al modelo y deben ser eliminadas.

# MODELO FINAL ------------------------------------------------------------

#Eliminamos Periódico
lm(Ventas ~ TV + Radio, data = publicidad)

# Nuevo modelo lineal ajustado
modelo2 <- lm(Ventas ~ TV + Radio, data = publicidad)

# Resumen del nuevo modelo lineal ajustado
summary(modelo2)

#Adjusted R-squared:  0.8962 (R^2)
#La inversión en TV y en Radio influyen en un 89.62% sobre las ventas.Las ventas dependen en un 89.62% de la TV y Radio.

#F-statistic: 859.6 on 2 and 197 DF,  p-value: < 2.2e-16
#Cuando utilizamos la F se llama "Prueba Global". 

#El estadístico "t". Ambos son significativos, ambos son influyentes.
#p-value < alfa, enotnces se rechaza H0. Eso quiere decir que las dos variables son diferente de 0, es decir, si portan al modelo.

# ESTIMACIÓN Y PREDICCIÓN -------------------------------------------------

# Supongamos, que se desea predecir la cantidad de ventas considerando 
# una inversión en publicidad en TV de 100,000 dólares y 20,000 dólares en radio.

# Nueva información
nuevos_datos <- data.frame(TV = 100, Radio = 20)

# Predicción
predict(modelo2, newdata = nuevos_datos)
# 11.25647 

# IC al 95% de la respuesta media
predict(modelo2, newdata = nuevos_datos, interval = "confidence", level = 0.95)

# Intervalor de predicción al 95% (para valor individual)
predict(modelo2, newdata = nuevos_datos, interval = "predict", level = 0.95)


# ADECUACIÓN DEL MODELO ---------------------------------------------------

# 1. NORMALIDAD DE LOS ERRORES

# Residuales del modelo lineal final ajustado
residuales <- modelo2$residuals

# ===
# QQ-Plot
qqnorm(residuales)
qqline(residuales)

# Gráfico Q-Q Plot con intervalos de confianza
library(car)
qqPlot(residuales)

# ===
# Prueba de Normalidad
# Prueba de Anderson-Darling
library(nortest)
ad.test(residuales)

# Prueba de Shapiro-Wilk
shapiro.test(residuales)

# ===
# 2. EVALUACIÓN DE MULTICOLINEALIDAD
library(car)
vif(modelo2)

# ===
# 3. OBSERVACIONES INFLUYENTES

# Identificar valores influyentes
# D > 4/(n-2)
dcook_modelo2 <- cooks.distance(modelo2)
corte <- 4/(nrow(publicidad) - 2)

# Número de posibles influyentes
sum(dcook_modelo2 > corte)

library(ggfortify)
# Distancia de Cook
gc <- autoplot(modelo2, label.size = 3, which = 4) 
gc + geom_hline(aes(yintercept=corte), colour="red", linetype="dashed")

# ===
# 4. GRÁFICOS DE EVALUACIÓN
library(ggfortify)
autoplot(modelo2, label.size = 3)


