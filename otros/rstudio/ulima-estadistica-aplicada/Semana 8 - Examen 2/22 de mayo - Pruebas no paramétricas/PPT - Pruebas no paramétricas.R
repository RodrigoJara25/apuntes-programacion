### Prueba de Rangos de Signos de Wilcoxon

#Ejemplo 1

library(readr)
df <- read_csv("C:/Users/Usuario/Downloads/VentasSemanales.csv")
View(df)

wilcox.test(df$Ventas, mu = 460, alternativa ="two.sided")
#mu: hipotesis de la mediana
#two.sided: porque es bilateral

#V = 35, p-value = 0.1688
#p-value > alfa, entonces no se rechaza H0. La media es igual a 460.
#Las ventas semanales tienen un mediana de 460.

###Prueba de Mann Whitney

#Ejemplo 2

muestra1 <- c(13, 21, 15, 10, 11, 14, 12, 8)
muestra2 <- c(9, 18, 16, 17, 20, 7, 22, 19)

#H0 : MedianaMuestra 2 ≤ Medianamuestra 1
#H1 : MedianaMuestra 2 > Medianamuestra 1

wilcox.test(muestra2, muestra1, alternative = "greater")

#W = 44, p-value = 0.1172
#como p-value > alfa, entonces no se rechaza H0.


###Prueba de Mann Whitney

#Ejemplo 3

Antes <-c(24, 20, 19, 20, 13, 28, 15)
Despues <- c(11, 18, 23, 15, 16, 22, 8)

wilcox.test(Antes, Despues, paired = TRUE, alternative = "greater")

#V = 23, p-value = 0.07813
#Como p-value > alfa, no se rechaza H0.





