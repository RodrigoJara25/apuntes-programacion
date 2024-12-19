# =============================================================================
### Curso: Estadística Aplicada
### Tema: REGRESIÓN LINEAL MÚLTIPLE
### Elaborado por: Grupo 3
# =============================================================================

# Lectura de datos
credito <- read.delim("clipboard")
credito

# Removemos la columna de Credito porque no entra en este modelo
credito <- credito[,-2]
credito
str(credito)

# Estimación de coeficientes
lm(Monto ~ ., data = credito)

# Modelo de Regresión Lineal Múltiple
modelo_RLM <- lm(Monto ~ ., data = credito)
modelo_RLM

# Signifcancia de la regresión
# Mostrar los resultados del modelo
summary(modelo_RLM)

# Eliminamos las variables que no influyen en el modelo (AIC)
library(MASS)
stepAIC(modelo_RLM, direction = "backward")
# lm(formula = Monto ~ E.Civil + Prioridad + Edad + Tarjetas + Deuda + CrediScore + Ingresos, data = credito)

# Modelo de Regresión Lineal Múltiple Ajustado
modelo_RLM2 <- lm(formula = Monto ~ E.Civil + Prioridad + Edad + Tarjetas + Deuda + CrediScore + Ingresos, data = credito)
summary(modelo_RLM2)

# Aún hay variables que no son significativas (*)
# La sacamos descartamos manualmente (E.CivilSoltero)

# Adjusted R-squared:  0.4779 
# El riesgo crediticio depende en un 47.79% de las variables E.Civil, Prioridad, Ed   ad, Tarjetas, Deuda, CrediScore e Ingresos.

# Supuesto de normalidad

# Residuales del modelo lineal final ajustado 
residuales <- modelo_RLM2$residuals
residuales

# Prueba de normalidad
# Prueba de Anderson-Darling (más de 50 datos)
library(nortest)
ad.test(residuales)

#A = 8.3199, p-value < 2.2e-16
#"A" es el estadístico y p-value < alfa, entonces se rechaza H0.
#Entonces los erorroes no se distribuyen normalmente

# Supuesto de Multicolinealidad
library(car)
vif(modelo_RLM2)
# Si VIF < 5, entonces no existe multicolinealidad entre las variables regresoras.
# Es decir, es lo que buscamos.

# PREDICCIONES
 
# Prediccion 1
nuevos_datos1 <- data.frame(E.Civil = "Divorciado", Prioridad = "Si", Edad = 45, Tarjetas = 2, Deuda = 1500, CrediScore = 13, Ingresos = 6670)
nuevos_datos1
predict(modelo_RLM2, newdata = nuevos_datos1)

# Predicción 2
nuevos_datos2 <- data.frame(E.Civil = "Soltero", Prioridad = "No", Edad = 20, Tarjetas = 1, Deuda = 500, CrediScore = 10, Ingresos = 3000)
nuevos_datos2
predict(modelo_RLM2, newdata = nuevos_datos2)
