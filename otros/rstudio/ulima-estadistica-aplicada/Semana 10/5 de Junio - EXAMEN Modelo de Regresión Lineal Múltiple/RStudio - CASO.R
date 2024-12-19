# PREGUNTA 1 ------------------------------------------------------

# Creamos un modelo de regresión lineal simple que dependa solo del 
# área de la vivienda

# Ingreso de datos
df <- read.delim("clipboard")
df
str(df)

# Pregunta 1 a) Hacemos el modelo 
modelo1 <- lm(Y~X1, data=df)
modelo1

# Pregunta 1 b)
summary(modelo1)
# Multiple R-squared:  0.5313

# Pregunta 1 c)
predict(modelo1, data.frame(X1=100))
# 15.87749

# PREGUNTA 2 ------------------------------------------------------- 

# Parte 1: Planteamiento del modelo inicial ========================

# Parte 1 a)

modelo2 <- lm(Y~X1+X2+X3+X4+X5+X6, data = df)
modelo2

# Parte 1 b)

summary(modelo2)

# Parte 2: Planteamiento del modelo final ==========================

# Parte 2 a)

# SELECCIÓN DE VARIABLES
#Eliminamos las variables no significativas con este método
library(MASS)
stepAIC(modelo2, direction = "backward")
# stepAIC(modelo2, direction = "both")
# la idea es que el AIC sea lo más pequeño posible
# Y ~ X1 + X2 + X3 + X5 + X6 (queda así)

# Realizamos el modelo de regresión lineal multiple
modelo3 <- lm(Y~X1+X2+X3+X5+X6, data = df)
summary(modelo3)

# Cuando usamos el método AIC, aún hay variables que no tienen (*)
# entonces podemos sacarlan(en este caso X3)
modelo3 <- lm(Y~X1+X2+X5+X6, data = df)
summary(modelo3)

# OBSERVACIÓN: Cuando incluimos el X3 (que no es significativa) el R cuadrado era 0.9311
# y cuando quitamos X3, el R cuadrado bajó a 0.9274. Como la disminución
# es baja (solo 1%), entonces se elimina. Aunque hayan variables no significativas
# estas pueden tener una mínima influencia.

# Parte 2 b)

# Solo incluyen las variables significativas aunque el enunciado diga otras
predict(modelo3, data.frame(X1 = 100, X2 = 5, X5 = "Surco", X6 = "Noble"))
# 14.84067 

# Parte 2 c)

# Supuesto de no multicolinealidad
library(car)
vif(modelo3)
# Se toma el VIF Ajustado. Si VIF < 4, no existe correlación entre variables/multicolinealidad.

# Supuesto de normalidad de los errores

#H0: Los errores se distribuyen normalmente
#H1: Los errores no se distribuyen normalmente      

library(nortest)
#Shapiro para <50 y Anderson-Darling para >50
shapiro.test(modelo3$residuals)




