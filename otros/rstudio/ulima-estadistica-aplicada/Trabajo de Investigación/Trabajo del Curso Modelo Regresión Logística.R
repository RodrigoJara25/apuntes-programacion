# =============================================================================
### Curso: Estadística Aplicada
### Tema: REGRESIÓN LINEAL MÚLTIPLE
### Elaborado por: Grupo 3
# =============================================================================

# Lectura de datos
credito <- read.delim("clipboard")
credito

# Removemos la columna de Monto porque no entra en este modelo
credito <- credito[,-1]
credito
str(credito)

# Tranformamos la variable Credito en factor
credito$Credito <- as.factor(credito$Credito)
str(credito)
 
# Estimación de coeficientes
glm(Credito~., family = "binomial", data = credito)

# Modelo de Regresión Logísitica 
modelo_RL <- glm(Credito~., family = "binomial", data = credito)
modelo_RL

# Mostrar los resultados del modelo
summary(modelo_RL)

# PRUEBA GLOBAL

# Estadístico de prueba para la Prueba Global (chi.cuadrado)
chi2 <- modelo_RL$null.deviance - modelo_RL$deviance
chi2   # 390.0819

# Ahora necesitamos los grados de libertad para halla el p-value
q <- modelo_RL$df.null - modelo_RL$df.residual
q      # 13

# p-value 
1-pchisq(chi2, q)  # 0

# Mostramos signifcancia de cada variable independientemente
modelo_RL
summary(modelo_RL)

# Eliminamos las variables no significativas
library(MASS)
stepAIC(modelo_RL)
# glm(formula = Credito ~ E.Civil + Prioridad + Edad + Deuda + Saldo + CrediScore + Ingresos, family = "binomial", data = credito)

# Modelo de regresión logística ajustado
modelo_RL2 <- glm(formula = Credito ~ E.Civil + Prioridad + Edad + Deuda + Saldo + CrediScore + Ingresos, family = "binomial", data = credito)
modelo_RL2
summary(modelo_RL2)

# ODDS RATIO
exp(modelo_RL2$coefficients)

# PREDICCION 3
nuevos_datos3 <- data.frame(E.Civil = "Casado", Prioridad = "Si", Edad = 55, Deuda = 8540, Saldo = 1300, CrediScore = 5, Ingresos = 4000)
nuevos_datos3
predict(modelo_RL2, nuevos_datos3, type="response")

# PREDICCION 4
nuevos_datos4 <- data.frame(E.Civil = "Soltero", Prioridad = "No", Edad = 25, Deuda = 11000, Saldo = 500, CrediScore = 2, Ingresos = 2250)
nuevos_datos4
predict(modelo_RL2, nuevos_datos4, type="response")
