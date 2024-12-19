### ================================================================#
### Curso: Estadística Aplicada
### Tema: PRUEBA DE HIPÓTESIS PARA LA COMPARACIÓN DE DOS POBLACIONES
### ================================================================#

# PH PARA LA RAZÓN DE VARIANZAS -------------------------------------------
# EJEMPLO 1
# H0: sigma2_1 = sigma2_2
# H1: sigma2_1 diferente de sigma2_2

# Valor crítico: F_(25,29,0.99)
qf(0.99, df1 = 25, df2 = 29)

# Valor del estadístico de prueba F0
F0 <- (94^2)/(58^2)
F0


# PH DIFERENCIA DE DOS MEDIAS ---------------------------------------------

# VARIANZAS CONOCIDAS Y MUESTRAS INDEPENDIENTES ------------------------

# EJEMPLO 2
# H0: mu_s = mu_f
# H1: mu_s > de mu_f

# Valor crítico: Z_0.99
qnorm(0.99)

# Valor del estadístico de prueba: Z0
Z0 <- (5.50-5.30)/sqrt(0.40^2/50 + 0.30^2/100)
Z0



# VARIANZAS DESCONOCIDAS Y DIFERENTES ----------------------------------------
# EJEMPLO 3
maquina1 <- c(12,28,10,25,24,19,22,33,17)
maquina2 <- c(16,20,16,20,16,17,15,21)

# Prueba de razón de varianzas
# H0: sigma2_1 = sigma2_2
# H1: sigma2_1 diferente de sigma2_2
var.test(maquina1, maquina2, alternative = "two.sided")

# Rpta. Las varianzas son diferentes

# Prueba de medias
# H0: mu1 = mu2
# H1: mu1 es diferente de mu2
t.test(maquina1, maquina2, alternative = "two.sided", var.equal = FALSE)

# Método Alternativo (usando p-value)
# p-value (obtenido de t.test)
t.test(maquina1, maquina2, alternative = "two.sided", var.equal = FALSE)$p.value


# .---.---.
# Cálculos adicionales

# gl (valor v, según la fórmula en las diapositivas)
(var(maquina1)/9+var(maquina2)/8)^2/((var(maquina1)/9)^2/8+(var(maquina2)/8)^2/7)

# Región Crítica (valores críticos exactos)
resultado <- t.test(maquina1, maquina2, alternative = "two.sided", var.equal = FALSE)
# <t(v,alpha/2) U >t(v,1-alpha/2)
qt(p = 0.05/2, df = resultado$parameter)
qt(p = 1-0.05/2, df = resultado$parameter)

# .---.---.


# VARIANZAS DESCONOCIDAS E IGUALES ----------------------------------------
# EJEMPLO 4
metodo1 <- c(2,4,9,3,2)
metodo2 <- c(3,7,5,8,4,3)

# Prueba de razón de varianzas
# H0: sigma2_1 = sigma2_2
# H1: sigma2_1 diferente de sigma2_2
var.test(metodo1, metodo2, alternative = "two.sided")

# Rpta. Las varianzas son iguales

# Prueba de medias
# H0: mu1 = mu2
# H1: mu1 es diferente de mu2
t.test(metodo1, metodo2, alternative = "two.sided", var.equal = TRUE)



# MUESTRAS PAREADAS -------------------------------------------------------
# EJEMPLO 5
inicio <- c(67,71,67,83,70,75,71,68,72,88,78,70)
final <- c(61,72,70,76,58,61,74,59,61,64,71,77)

# H0: mu_d = 0
# H1: mu_d > 0
# Donde mu_d = mu_inicio - mu_final

t.test(inicio, final, alternative = "greater", paired = TRUE)


# PH DIFERENCIA DE DOS PROPORCIONES ---------------------------------------
# EJEMPLO 6

# H0: p1 = p2
# H1: p1 diferente de p2

# Z_0.025
qnorm(0.025)

# Z_0.975
qnorm(0.975)

# Proporción común
p <- (19+62)/(100+200)

# Valor del estadístico de prueba Z0
Z0 <- (19/100 - 62/200)/sqrt(p*(1-p)*(1/100+1/200))
Z0


# Método Alternativo (usando p-value)
prop.test(x = c(19,62), n = c(100,200), alternative = "two.sided", correct = FALSE)$p.value


