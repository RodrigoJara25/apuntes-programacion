qt(1-0.05, 14)
qt(0.01,7)

x <- c(6.61, 6.25, 6.40, 6.57, 6.35, 5.95, 6.53, 6.29)
mean(x)
sd(x)


x <- c(51, 175, 47, 49, 44, 54, 145, 203, 21, 59, 42, 100)
n <- length(x) 
alfa <- 0.05
S<- sd(x)

qt(1-alfa, n-1)

t0 <- (mean(x)-50)/(S/sqrt(n))
t0  

install.packages("BSDA")
library(BSDA)
tsum.test(mean.x = 109.4, s.x = 9.963, n.x = 15, mu = 100, alternative = "greater")


x <- c(6.61, 6.25, 6.40, 6.57, 6.35, 5.95, 6.53, 6.29)
t.test(x, mu = 6.5, alternative = "less")

#p-value > alfa, entonces no se rechaza u0
#p-value < alfa, entonces se rechaza u0