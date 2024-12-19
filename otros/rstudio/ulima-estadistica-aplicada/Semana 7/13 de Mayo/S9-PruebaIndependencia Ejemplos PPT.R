### ================================================================#
### Curso: Estadística Aplicada
### Tema: PRUEBA DE INDEPENDENCIA
### Elaborado por: Vilma Romero
### ================================================================#


# EJEMPLO 1 ---------------------------------------------------------------

# Ingreso de datos
ave <- c(49,51,67,47)
res <- c(35,27,41,26)
pescado <- c(17,19,41,26)
pasta <- c(14,41,22,33)

# Datos de manera matricial
resultados <- matrix(c(ave,res,pescado,pasta), nrow = 4, ncol = 4,
                     dimnames = list(c("Helado","Fruta","Torta","Ninguno"),
                                     c("Ave","Res","Pescado","Pasta")))
resultados


# Planteamiento de hipótesis
# H0: El tipo de postre y el tipo de plato principal son independientes.
# H1: El tipo de postre y el tipo de plato principal no son independientes.

# Prueba chi-cuadrado para la independencia
chisq.test(resultados)

# Región crítica
# RC = <21.66599, Inf+>
qchisq(1-0.01,9)

# Valor del estadístico de prueba
chisq.test(resultados)$statistic

# Como chi2_0 = 26.60807 está en RC => Se rechaza la hipótesis nula.
# Existe suficiente evidencia para concluir que el tipo de postre y el tipo de plato principal no son independientes, al 1% de significación.


# Método alternativo (usando p-value)
chisq.test(resultados)$p.value

# Como p-value = 0.00162345 < 0.05 => Se rechaza la hipótesis nula.


#--
# Tabla de frecuencias esperadas
chisq.test(resultados)$expected

# Tabla de frecuencias observadas
chisq.test(resultados)$observed
#--


# EJEMPLO 2 ---------------------------------------------------------------
# Lectura de datos
library(readr)
datos <- read_csv("C:/Users/Usuario/Downloads/Preferencias (1).csv")
datos

# Variables cualitativas como factor
datos$Preferencia <- factor(datos$Preferencia)
datos$Sexo <- factor(datos$Sexo)

# Tabla de contingencia (frecuencias observadas)
table(datos$Preferencia, datos$Sexo)

# Planteamiento de Hipótesis
# H0: El tipo de chocolate y el sexo del consumidor son independientes.
# H1: El tipo de chocolate y el sexo del consumidor no son independientes.

# Prueba de independencia
chisq.test(datos$Preferencia, datos$Sexo)

# Solución usando p-value
chisq.test(datos$Preferencia, datos$Sexo)$p.value

# Como p-value = 0.03981902 < 0.05 => Se rechaza la hipótesis nula.
# Existe suficiente evidencia para concluir que el tipo de chocolote y el sexo no son independientes, al 5% de significación.

#--
# Tabla de frecuencias esperadas
chisq.test(datos$Preferencia, datos$Sexo)$expected

#--


# Gráfico adicional
library(ggplot2)

ggplot(datos) +
  aes(x = Preferencia, fill = Sexo) +
  geom_bar(position = "fill") 


