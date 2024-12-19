### =======================================================#
### Curso: EstadÃ­stica Aplicada
### Tema: ASOCIACIÃ“N ENTRE VARIABLES CUALITATIVAS
### =======================================================#

# Datos -------------------------------------------------------------------
# ImportaciÃ³n de datos
datos <- read.delim("clipboard")
datos
# Estructura de datos
str(datos)

datos$Edad <- factor(datos$Edad,levels = c("Joven","Media","Adulta"),ordered=TRUE)
datos$Genero <- as.factor(datos$Genero)
datos$Vivienda <- as.factor(datos$Vivienda)
datos$Ecivil <- as.factor(datos$Ecivil)
datos$Ubicacion <- as.factor(datos$Ubicacion)
datos$Historial <- factor(datos$Historial,levels = c("Bajo","Medio","Alto"),ordered=TRUE)


# 1. Tabla de Contingencia ------------------------------------------------
table(datos$Vivienda, datos$Ecivil)
addmargins(table(datos$Vivienda, datos$Ecivil))

# margin = 2, las proporciones son calculadas por columna
prop.table(table(datos$Vivienda, datos$Ecivil), margin = 2)   #para sacar las proporciones


# GrÃ¡fico de Barras Apilado -----------------------------------------------
library(ggplot2)
ggplot(datos) +
  geom_bar(aes(x = Ecivil, fill = Vivienda), position = "fill", colour = "white") +
  theme_classic() + xlab("Estado civil") + ylab(" ") +
  labs(fill = "Vivienda")


# 2. Chi-Cuadrado ---------------------------------------------------------
chisq.test(datos$Vivienda, datos$Ecivil, correct = FALSE)


# 3. Cramer's V -----------------------------------------------------------
# Tomada de 
# https://www.r-bloggers.com/example-8-39-calculating-cramers-v/
cv.test <- function(x,y) {
  CV <- sqrt(chisq.test(x, y, correct=FALSE)$statistic /
              (length(x) * (min(length(unique(x)),length(unique(y))) - 1)))
  print.noquote("CramÃ©r V / Phi:")
  return(as.numeric(CV))
}

cv.test(datos$Vivienda, datos$Ecivil)


# Directamente usando el paquete vcd
install.packages("vcd")
library(vcd)
assocstats(table(datos$Vivienda, datos$Ecivil))


# 4. Kendall's Tau --------------------------------------------------------

# Las variables cualitativas deben estar codificadas de manera numÃ©rica
cor(as.numeric(datos$Edad), as.numeric(datos$Historial), method = "kendall")


# 5. CorrelaciÃ³n de Spearman ----------------------------------------------
# Las variables cualitativas deben estar codificadas de manera numÃ©rica
cor(as.numeric(datos$Edad), as.numeric(datos$Historial), method = "spearman")


# 6. CorrelaciÃ³n Biserial Puntual -----------------------------------------
# Numericamente igual que Pearson
cor(as.numeric(datos$Salario), as.numeric(datos$Vivienda))


tabla1 <- matrix(c(245,	228,	177,	219, 31,	27,	13,	10), nrow=2, ncol = 4, byrow = TRUE,
                 dimnames = list(c("Nutrición buena","Nutrición pobre"),c("< 80",	"80 - 90",	"90 - 99",	"≥100")))
tabla1

#ejercicio 9
tabla9 <- read.delim("clipboard")
tabla9

tabla9$Rendimiento <- factor(tabla9$Rendimiento ,
                             levels = c("Muy bajo","Bajo","Medio","Alto","Muy alto"),
                             ordered=TRUE)
cor(as.numeric(tabla9$Rendimiento), tabla9$Antigüedad, method = "spearman")

#ejercicio 10
tabla10 <- read.delim("clipboard")
tabla10

plot(tabla10$Espacio,tabla10$Ventas)
cor(tabla10$Espacio, tabla10$Ventas)   #pearson
