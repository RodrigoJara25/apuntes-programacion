# =============================================================================
### Curso: Estadística Aplicada
### Tema: REGRESIÓN LOGÍSTICA
# =============================================================================
# CONTEXTO
# Una determinada cadena de tiendas de ropa femenina que opera en todo el país
# desea gestionar de manera productiva el envío de su catálogo, el cual
# contiene cupones de descuento.
# Se cree que el gasto anual en la tienda y si el cliente tiene una tarjeta de crédito de la tienda son dos variables
# que podrían ser útiles para predecir si un cliente que recibe un catálogo
# usará el cupón.

# Cliente: ID del cliente
# Gasto: Monto gastado por el cliente en la tienda durante el año anterior, en miles de dólares.
# Tarjeta: El cliente cuenta con una tarjeta de crédito de la tienda.
# Cupón: El cliente usó o no el cupón del catálogo.

# (0 y 1) o (SI y NO) son datos categóricos.

# LECTURA DE DATOS --------------------------------------------------------
datos <- read.delim("clipboard")
# Estructura de los datos
datos
str(datos)


# ANÁLISIS EXPLORATORIO ---------------------------------------------------
# Diagrama de cajas (Cuantitativa y Cualitativa)
boxplot(Gasto~Cupon, data = datos)

# Porcentajes por columna (2 cualitativas)
prop.table(table(datos$Tarjeta,datos$Cupon), margin = 2)


# CREACIÓN DEL MODELO -----------------------------------------------------
# ESTIMACIÓN DEL MODELO ---------------------------------------------------
modelo <- glm(Cupon~Gasto+Tarjeta, family = "binomial", data = datos)
#gml(Cupon~., family = "binomial", data = datos)

# Mostrar los coeficientes estimados
modelo        
# BO = -2.1464
# B1 = 0.3416 
# B2 = 1.0987 

# Con estos coeficientes, aún no se puede realizar una interpretación completa (sale con algoritmo).
# Es mejor hallar los odds ratio

# INTERPRETACIÓN DE LOS COEFICIENTES --------------------------------------
# ===
# ODDS RATIO = e^(beta_j)
exp(coef(modelo))   #sacamos la exponencial a cada uno de coeficientes
# ===
# 1. Variable Tarjeta: OR = 3.0003587 aprox. 3

# Los odds estimados de usar el cupón para los clientes que tienen 
# una tarjeta de crédito de la tienda son 3 veces mayores que
# los odds estimados de usar el cupón para los clientes que no tienen
# una tarjeta de crédito de la tienda, manteniendo constante el gasto anual.

# ===
# 2. Variable Gasto: OR = 1.4072585 aprox. 

# Para el cambio en una unidad ($1000) del gasto anual, los odds estimados en favor de usar el cupón se incrementan.
# Los odds estimados a favor de usar el cupón para alguien que gastó $5000 el año pasado es 1.4073 veces mayor que los odds 
# a favor de usar el cupón para un cliente que gastó $4000 el año pasado, manteniendo constante el contar o no con una tarjeta de crédito de la tienda.
# Por cada mil dolares de gasto de una cliente, existe 1.4 veces más de probabilidad que haga uso del cupón.

# ===
# IC PARA EL ODDS RATIO (intervalo de confianza)
# ===
## IC usando profiled log-likelihood
exp(confint(modelo, level = 0.95))


# ===
# OR estimado + IC al 95%
exp(cbind(OR = coef(modelo), confint(modelo, level = 0.95)))


# SIGNIFICANCIA DEL MODELO GLOBAL -----------------------------------------

# Mostrar los resultados del modelo
summary(modelo)
# Gasto y Tarjeta si son significativas para el modelo de regresión logística
# Porque p-value < alfa


# Prueba de Razón de Verosimilitud

# X2_0 = 134.60 - 120.97 = 13.62844  (Estadístico chi-cuadrado)
modelo$null.deviance - modelo$deviance

# Grados de libertad
# q = 2 (hay dos variables predictoras)
# q = 99 - 97  (degrees of freedom en null y residual evidence)
modelo$df.null - modelo$df.residual

# hallar p-value
1-pchisq(13.62844, 2)

# Como p-value = 0.001098049 < alpha = 0.5 => Se rechaza la H0.
# Existe suficiente evidencia para afirmar que al menos uno de los 
# parámetros correspondientes a los predictores es diferente de 0.
# Se concluye que el modelo es significativo.


# SIGNIFICANCIA INDIVIDUAL ------------------------------------------------
# Mostrar los resultados del modelo
summary(modelo)

# H0: Beta1 = 0
# H1: Beta2 != 0

# p-value = 0.007928

# Como p-value < alpha = 0.05 => Se rechaza la H0.
# Existe suficiente evidencia para afirmar que la variable Gasto anual
# influye en el modelo.

# Se concluye que ambas variables son significativas.


# PREDICCIÓN --------------------------------------------------------------
# Estimar la probabilidad de usar el cupón para clientes que 
# gastaron $2000 anualmente y no cuentan con tarjeta de crédito de la tienda.

# Nueva información
nuevos_datos <- data.frame(Gasto = 2, Tarjeta = 0)

# Predicción
predict(modelo, newdata = nuevos_datos, type = "response")

# Una estimación de la probabilidad de usar el cupón para este grupo particular de clientes es aprox. 0.19  


# Estimar la probabilidad de usar el cupón para clientes que 
# gastaron $2000 anualmente y si cuentan con tarjeta de crédito de la tienda.

# Nueva información
nuevos_datos <- data.frame(Gasto = 2, Tarjeta = 1)

# Predicción
predict(modelo, newdata = nuevos_datos, type = "response")  #type respondese te da la probabilidad

# Para este grupo de cliente, probabilidad de usar el cupón es aprox. 0.41

# Por lo tanto, se puede notar que:
# La probabilidad de usar cupón es mucho mayor para los clientes con una tarjeta de crédito de la tienda.


# BONDAD DE AJUSTE --------------------------------------------------------
# Pseudo-R2
# # En RL no existe un valor que indique la “variabilidad explicada” como en la RLM.
# Se puede calcular un valor similar a R^2 de los modelos lineales mediante el indicador llamado Pseudo R2 o también llamado McFadden
# Los valores oscilan entre 0 y 1.
# Pseudo-R2 que oscila entre 0.2 y 0.4 indica un muy buen ajuste del modelo.
# https://cowles.yale.edu/sites/default/files/files/pub/d04/d0474.pdf

# Cálculo de Pseudo-R2 (pseudo R cuadrado)
(modelo$null.deviance - modelo$deviance)/modelo$null.deviance

# Mediante paquete
library(pscl)
pR2(modelo)

# Este R cuadrado no está entre 0.2 y 0.4. Estas variables si son soognfciativas y aportan
# al modelo, pero no son suficiente. Hay más variables que influyen.