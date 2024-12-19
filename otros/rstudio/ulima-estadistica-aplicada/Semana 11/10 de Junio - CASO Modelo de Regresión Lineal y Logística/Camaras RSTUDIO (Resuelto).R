library(readr)
df <- read_delim("C:/Users/Usuario/Desktop/Ciclo 2024-1/Estadística Aplicada/Semana 11/10 de Junio - CASO Modelo de Regresión Lineal y Logística/Camaras.csv", 
                      delim = ";", escape_double = FALSE, trim_ws = TRUE)
View(df)
df
df$CategoriaPuntaje <- ifelse(df$Puntaje >= 65, "Aceptable", "No aceptable")
df
df$CategoriaPuntaje <- as.factor(df$CategoriaPuntaje)

# EJERCICIO 1 

# Creamos el primer modelo de regresion
modelo1 <- glm(CategoriaPuntaje~Marca+Precio+Peso+Megapixeles+Color,
               family = "binomial", data = df)
modelo1
summary(modelo1)

# Interpretación coeficientes del modelo de regresion logistica
# logit(p) =7.03593+5.53100*MarcaNikon-0.02591*Precio+0.01898*Peso-0.40431*Megapixeles
# -0.71119*ColorPlateado-2.25070*ColorRojo 

# log(  p(X)  )
#     1 - p(X)

# EJERCICIO 2

# H0: B1=B2=B3=B4=B5=0
# H1: Al menos un Bi es diferente de 0

# Estadístico de prueba para la Prueba Global (chi.cuadrado)
chi2 <- modelo1$null.deviance - modelo1$deviance
chi2   #35.72976

# Ahora necesitamos los grados de libertad para halla el p-value
q <- modelo1$df.null - modelo1$df.residual
q

# p-value 
1-pchisq(chi2, q)  # 3.110845e-06

# Conclusión: como p-value < alfa, entonces se rechaza Ho. Al menos una variable es significativa.

# EJERCICIO 3 (prueba individual)

# HO: B1 = 0
# H1: B1 != 0

# z = 2.893  p-value = 0.00382
#Como p-value < alfa, entonces se rechaza H0. Entonces es significativa.

# EJERCICIO 4

# Eliminamos las variables no significativas
library(MASS)
stepAIC(modelo1)
# glm(formula = CategoriaPuntaje ~ Marca + Precio, family = "binomial", data = df)

modelo2 <- glm(formula = CategoriaPuntaje ~ Marca + Precio, family = "binomial", 
               data = df)
modelo2
summary(modelo2)

# logit(p)=3.18183+4.513169*MarcaNikon -0.019471*Precio

# a)

# Odds ratio
exp(modelo2$coefficients)

# OR_MarcaNikon = 91.2103952, si la marca de la cámara es Nikon, hay un 91.21 veces más posiibilidad de que
# el cleinete calisifique a la cámara como aceptable

# OR_Precio = 0.9807171, por cada dolar de aumento en el precio, la posibilidad
# de que la cámara sea aceptable disminuye a menos de 1 (0.98)

# b)

odd_precio_8 = 0.9807171*8
odd_precio_8
# Por cada 8 sólares el OR = 7.845737; es decir hay 7 veces más desventaja
# de dar un puntaje aceptable (desventaja xq el coeficiente original tenia simbolo negativo)

# c)

# Solo consideramos las variables que estan dentro de nuestro modelo final
predict(modelo2, data.frame(Marca="Canon", Precio=225), type="response")
# La probabilidad de que sea esa cámra sea considerada aceptable es de 0.2316282.

