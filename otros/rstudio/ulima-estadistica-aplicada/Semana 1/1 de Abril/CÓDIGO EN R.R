# Variable
distrito <- c("Surco", "Miraflores", "Surco", "Lince", "Lince",
              "Breña", "Lince", "Surco", "Miraflores", "Lince")
# Gráfico de Barras
table(distrito)
barplot(table(distrito))

# Gráfico de Barras personalizado
barplot(table(distrito), 
main = "Distribución de los distritos donde residen los clientes", 
xlab = "Distrito",
ylab = "Número de clientes",
col = "#CD5C5C")


# Gráfico Circular
pie(table(distrito))

# Gráfico Circular personalizado
pie(table(distrito), 
main = "Distribución de los distritos donde residen los clientes",
col = c("#AED6F1","#F7DC6F","#BFC9CA", "#27AE60"))


#HISTOGRAMA
# Edades de los estudiantes
edad <- c(18,19,26,24,14,22,21,17,18,19,
          29,25,24,18,17,27,23,19,19,15,22)
# Histograma
hist(edad, breaks = "Sturges")

# Histograma personalizado 
hist(edad, breaks = "Sturges",
     xlab = "Edad",
     ylab = "Número de alumnos",
     main = "Histograma de las edades de los alumnos",
     col = "#7FB3D5")

#HISTROGRAMA Y POLÍGONO DE FRECUENCIAS EN R

# Histograma guardado en h1
h1 <- hist(edad,breaks = "Sturges",
           xlab = "Edad",
           ylab = "Número de alumnos",
           main = "Histograma de las edades de los alumnos",
           col = "#7FB3D5")
# Polígono de frecuencias
install.packages("agricolae") 
library(agricolae)
polygon.freq(h1, frequency = 1, 
                                col = "darkred", lwd = 1.5)

#GRÁFICO DE CAJAS
edades <- c(18,19,26,24,14,22,21,17,18,19,29,
            25,24,18,17,27,23,19,19,15,40,37)

boxplot(edades, horizontal = TRUE, 
        xlab = "Edad del alumno", col = "#FAD7A0")

