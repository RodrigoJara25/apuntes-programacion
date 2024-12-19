x <- c(2800, 3000, 2900, 8900)
mean(x)
median(x)
install.packages("modeest")
library(modeest)
nota <- c(14,18,12,16,14,15,16,18,10,12)
mfv(nota) 


# Primer cuartil
quantile(nota,0.25)

# Percentil 60
quantile(nota,0.60)


A <- c(2500, 2800, 2300, 2600)
B <- c(5000, 2800, 1200, 1200)
mean(A)
mean(B)

IQR(nota)
quantile(nota,0.75)-quantile(nota,0.25)

#Varianza y Desv. Estandar
var(nota)
sd(nota)
##sqrt(var(nota)) == desviacion estandar

#Coeficiente de variación
sd(A)/mean(A)
sd(B)/mean(B)


#Coeficiente de asimetría Pearson
edades <- c(18,19,26,24,14,22,21,17,18,19,29,
            25,24,18,17,27,23,19,19,15,40,37)
3*(mean(edades)-median(edades))/sd(edades)

#Coefiiente de asimetría Fisher
install.packages("e1071")
library(e1071) 
skewness(edades) 

#Coeficiente de asimetría curtosis
library(e1071) 
kurtosis(edades) 



