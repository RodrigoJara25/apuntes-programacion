### =======================================================#
### Curso: Estadística Aplicada
### Tema: ASOCIACIÓN ENTRE VARIABLES CUANTITATIVAS
### Elaborado por: Vilma Romero
### =======================================================#

# Datos -------------------------------------------------------------------
# Importación de datos

#setwd("C:/Users/n04640/Documents/Clase R")
#datos <- read.csv("MarketingDirecto.csv")
#datos
#datos2

datos <- read.delim("clipboard")
datos

datos$Edad
# Estructura de datos
str(datos)

datos$Edad <- factor(datos$Edad,levels = c("Joven","Media","Adulta"),ordered=TRUE)
datos$Genero <- as.factor(datos$Genero)
datos$Vivienda <- as.factor(datos$Vivienda)
datos$Ecivil <- as.factor(datos$Ecivil)
datos$Ubicacion <- as.factor(datos$Ubicacion)
datos$Historial <- factor(datos$Historial,levels = c("Bajo","Medio","Alto"),ordered=TRUE)

str(datos)

# 1. Gráfico de dispersión ------------------------------------------------
plot(datos$Salario, datos$Monto)

install.packages("ggplot2")
library(ggplot2)
ggplot(datos, aes(x = Salario, y = Monto)) +
  geom_point(size = 1.5, colour = "darkblue") +
  xlab("Salario") + ylab("Monto") +
  theme(axis.title = element_text(face = "bold", colour = "#b83f04", size = 12),
        axis.text = element_text(size = 10)) 


# 2. Dispersión + Histograma ----------------------------------------------
# Guardar el gráfico ggplot como objeto de nombre p 
p <- ggplot(datos, aes(x = Salario, y = Monto)) +
  geom_point(size = 1.5, colour = "darkblue") +
  xlab("Salario") + ylab("Monto") +
  theme(axis.title = element_text(face = "bold", colour = "#b83f04", size = 12),
        axis.text = element_text(size = 10)) 

# Gráfico de dispersión con los histogramas marginales.
install.packages("ggExtra")
library(ggExtra)
ggExtra::ggMarginal(p, type = "histogram")


# 3. Covarianza -----------------------------------------------------------
cov(datos$Salario, datos$Monto)


# 4. Correlación de Pearson -----------------------------------------------
cor(datos$Salario, datos$Monto)


# 5. Matriz de Correlación ------------------------------------------------
cor(datos)

cor(datos[c("Salario", "Monto")])

cor(datos[c("Salario", "Monto", "Salario")])


# 6. Gráficos adicionales -------------------------------------------------

# Gráfico de dispersión 2 a 2
pairs(datos[,c("Salario", "Monto")])
pairs(datos[,c("Salario", "Monto")], pch = 19)


# Histograma y correlaciones 2 a 2
install.packages("psych")
library(psych)
pairs.panels(datos[,c("Salario", "Monto")], 
             method = "pearson", # método de correlación
             hist.col = "darkgreen",
             density = TRUE,  # mostrar gráficos de densidad
             ellipses = FALSE # mostrar elipses de correlación
)


# Visualización de una matriz de correlación
install.packages("corrplot")
library(corrplot)

corrplot(cor(datos[,c("Salario", "Monto")]), method="circle")

corrplot(cor(datos[,c("Salario", "Monto")]), 
         method = "color", 
         type = "upper",  
         addCoef.col = "black", # Añadir coeficiente de correlación
         tl.col = "black", tl.srt = 45, # Color de la etiqueta y rotación
)

# Gráficos interactivos
#https://plotly.com/r/

  
  
cor(datos$Salario, datos$Monto, method="spearman")
cor(datos$Salario, datos$Monto, method="pearson")

cor(as.numeric(datos$Historial), datos$Monto, method="spearman")

cor(as.numeric(datos$Edad), as.numeric(datos$Historial), method="spearman")
