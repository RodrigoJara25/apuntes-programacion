### GUIA COMUN 3

# Ejercicio 13

# a)

#H0: los datos se distribuyen normalmente
#H1: los datos no se distribuyen normalmente

#Shapiro: porque muestra es menor a 50.

datos <- c(810, 600, 350, 1100, 540, 570, 540, 1600, 590, 520, 720)
shapiro.test(datos)

#W = 0.78763, p-value = 0.006468
#Como p-value < alfa, entonces se rechaza H0. Los datos
#no se distribuyen normalmente

# b)

#H0: mediana = 570
#H1: mediana > 570

wilcox.test(datos, mu = 570, alternative = "greater")

#V = 37, p-value = 0.1788
#Como p-value > alfa, entonces no se rechaza H0.

#CONCLUSION: no existe suficiente evidencia para afirmar
#que la mediana a aumentado, al 5% de significancia.




