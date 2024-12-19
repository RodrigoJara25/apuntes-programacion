FÓRMULAS MANUALES
X <- media
t <- qt( , )
S <- desv estandar
p <- proporcion
Z <- qnorm( , )
X^2 <- qchisq( , )

read.delim("clipboard")

datos$Edad <- factor(datos$Edad, levels = c("Joven", "Media", "Adulta"), 
                     ordered = TRUE)
datos$Genero <- as.factor(datos$Genero)

CREAR TABLA: tabla1 <- matrix(c(245,	228,	177,	219, 31,	27,	13,	10), nrow=2, ncol = 4, byrow = TRUE,
                                dimnames = list(c("Nutrición buena","Nutricion pobre"),c("<80","80-90",">90")))



table() <- para visualizar datos

Coeficiente de Asimetría Pearson <- 3*(media - mediana)/desviacion estandar
Coeficiente de Asimetría Fisher
"=0" <- distribución simétrica
">0" <- distribucion asimetrica positiva
"<0" <- distribución asimetrica negativa

Coeficiente de Curtosis
"k > 0" <- leptocurtica
"k = 0" <- mesocurtica
"k < 0" <- platicurtica

Covarianza 
Positiva <- misma direccion
Negativa <- direcciones opuestas
Cero <- no existe relacion

Correlación de Pearson / Spearman
=0 <- lineal perfecta Positiva
=-1 <- lineal perfecta Negativa
=0 <. no existe correlación

Chi-Cuadrado <- indica si hay asociacion (nominal x nominal)
Cramers V <- indica que tan fuerte es la asociacion (discreta x discreta)









