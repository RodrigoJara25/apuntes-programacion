### GUIA DE EJERCICIOS 2

### EJEMPLO 20

hombres <- c(31, 44, 25, 30, 70, 63, 54, 42)
mujeres <- c(38, 34, 33, 47, 58, 83, 18, 36, 41)
var.test(hombres, mujeres, alternative = "two.sided")
t.test(hombres,mujeres,alternative = "two.sided",var.equal = TRUE)


### EJEMPLO 22

Antes <- c(8, 7, 6, 9, 7, 10, 8, 6, 5, 8, 10, 8)
Después <- c(6, 5, 8, 6, 9, 8, 10, 7, 5, 6, 9, 8)
t.test(Antes, Después, alternative = "greater", paired = TRUE)


### EJEMPLO 25

# e) Pruebe si los hombres tienen un mayor gasto que las mujeres.
library(readr)
df <- read_csv("C:/Users/Usuario/Downloads/MarketingDirecto.csv")
View(df)
df

hombres_data <- subset(df, Genero == "Masculino")
mujeres_data <- subset(df, Genero == "Femenino")

hombres_gasto <- hombres_data$Monto
mujeres_gasto <- mujeres_data$Monto

var.test(hombres_gasto, mujeres_gasto, alternative = "two.sided")
t.test(hombres_gasto,mujeres_gasto,alternative = "greater",var.equal = TRUE)

#f) ¿Es posible afirmar que la proporción de clientes que gastan más de 2 mil dólares es
#   menor en los clientes solteros que en los casados?

df$monto2 <- ifelse(df$Monto>2000, ">2000","<=2000")  #creas una nueva columna en la base de datos
df

solteros_data <- subset(df, Ecivil == "Soltero")
casados_data <- subset(df, Ecivil  == "Casado")

solteros_monto <- table(solteros_data$monto2)
casados_monto <- table(casados_data$monto2)
solteros_monto
casados_monto

n1 = sum(solteros_monto)
n1
n2 = sum(casados_monto)
n2

prop.test(x = c(18,162), n = c(498,502), alternative = "less", correct = FALSE)


### EJEMPLO 10

nutricio_buena <- c(245, 228, 177, 219)
nutricion_pobre <- c(31, 27, 13, 10)

tabla <- matrix(c(nutricio_buena,nutricion_pobre),nrow = 2,ncol = 4,  byrow = TRUE)
tabla

chisq.test(tabla)


### EJEMPLO 12

España <-  c(200, 300, 300, 100)
Francia <- c(300, 400, 350, 150)
Italia <- c(350, 300, 250, 150)

tabla <- matrix(c(España, Francia, Italia), nrow = 3, ncol = 4, byrow = TRUE)
tabla

chisq.test(tabla)

### EJEMPLO 19

# b) ¿Hay alguna evidencia que sugiera que la mediana de duración del desempleo es
#    mayor a 36 semanas?Use � = 0.10.

datos <- c(35, 40, 38, 43, 38, 45, 35, 47, 41, 37, 39, 43, 49, 39, 34)
datos

# H0: u = 36
# H1: u > 36

t.test(x = datos, mu = 36, alternative = "greater")

# p-value < alfa, entonces se rechaza H0


### EJEMPLO 23

#p-value = 0.1713




