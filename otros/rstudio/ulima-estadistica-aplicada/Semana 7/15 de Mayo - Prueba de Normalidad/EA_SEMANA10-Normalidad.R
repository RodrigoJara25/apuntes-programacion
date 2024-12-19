####################################################################
### Curso: Estadística Aplicada
### Tema: EVALUACIÓN DE NORMALIDAD
### Elaborado por: Vilma Romero
####################################################################

# Lectura de datos
library(readr)
datos <- read_csv("Puntajes.csv")
View(datos)

# Exploración
hist(datos$Puntaje)

boxplot(datos$Puntaje, horizontal = TRUE)


# QQ-PLOT -----------------------------------------------------------------

# Gráfico Q-Q Plot
qqnorm(datos$Puntaje)
qqline(datos$Puntaje)


# Gráfico Q-Q Plot con intervalos de confianza
library(car)
qqPlot(datos$Puntaje)


# PRUEBA DE ANDERSON-DARLING ----------------------------------------------
install.packages("nortest")
library(nortest)
ad.test(datos$Puntaje)

#p-value = 0.1002. p-value > alfa. No se rechaza H0.

# PRUEBA DE SHAPIRO-WILK --------------------------------------------------
shapiro.test(datos$Puntaje)

#p-value = 0.06508. p-value > alfa. No se rechaza H0.

# PRUEBA DE BONDAD DE AJUSTE CHI-CUADRADO ---------------------------------
library(nortest)
pearson.test(datos$Puntaje)


