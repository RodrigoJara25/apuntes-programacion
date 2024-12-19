### EJEMPLO 1

qf(0.99,25,29)

### EJEMPLO 2

qnorm(0.99)

### EJEMPLO 3

### EJEMPLO 4

m1 <- c(2, 4, 9, 3, 2)
m2 <- c(3, 7, 5, 8, 4, 3)
var.test(m1,m2,alternative = "two.sided")

t.test(m1,m2,alternative = "two.sided",var.equal = TRUE)
qt(0.05,9)
qt(0.95,9)


### EJEMPLO 5

qt(0.95,11)
inicio <- c(67,71,67,83,70,75,71,68,72,88,78,70)
final <- c(61,72,70,76,58,61,74,59,61,64,71,77)
t.test(inicio, final, alternative="greater",paired=TRUE)

### EJEMPLO 6


qnorm(0.025)
qnorm(0.975)
