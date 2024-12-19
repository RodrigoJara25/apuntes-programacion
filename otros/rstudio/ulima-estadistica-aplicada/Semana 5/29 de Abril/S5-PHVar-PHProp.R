### =======================================================#
### Curso: Estadística Aplicada
### Tema: 
###   - PRUEBA DE HIPÓTESIS PARA LA PROPORCIÓN POBLACIONAL
###   - PRUEBA DE HIPÓTESIS PARA LA VARIANZA POBLACIONAL
### Elaborado por: Vilma Romero
### =======================================================#

# PH PARA LA PROPORCIÓN POBLACIONAL ---------------------------------------

# EJEMPLO 1
# H0: p >= 0.90 
# H1: p < 0.90

# Z_(0.10)
qnorm(0.10)

Z0 <- (0.82-0.90)/sqrt(0.90*(1-0.90)/100)
Z0


# Método Alternativo (p-value)
pruebaProp <- prop.test(x = 82, n = 100, p = 0.90, alternative = "less", correct = FALSE)
pruebaProp$p.value


# EJEMPLO 2
# H0: p >= 0.33 
# H1: p < 0.33

# Z_(0.025)
qnorm(0.025)

Z0 <- (0.20-0.33)/sqrt(0.33*(1-0.33)/80)
Z0


# Método Alternativo
pruebaProp <- prop.test(x = 16, n = 80, p = 0.33, alternative = "less", correct = FALSE)
pruebaProp$p.value


# PH PARA LA VARIANZA POBLACIONAL -----------------------------------------

# EJEMPLO 3
# H0: sigma2 = 49 
# H1: sigma2 diferente de 49

# Chi2_(20,0.025)
qchisq(0.025, 20)

# Chi2_(20,0.975)
qchisq(0.975, 20)

# Chi2_0
(21-1)*15.6/49


# EJEMPLO 4
# H0: sigma2 = 660.49
# H1: sigma2 diferente de 660.49
helado <- c(360, 347, 346, 347, 338, 370, 362, 356, 330, 339, 372, 358, 387, 359, 343, 372, 369, 349, 344, 334)

library(EnvStats)
varTest(x = helado, sigma.squared = 660.49, alternative = "two.sided")

