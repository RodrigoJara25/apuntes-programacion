/*
1. Escriba una función recursiva para calcular la potencia de un número real x elevado a un entero positivo n, partiendo de:
{𝑥0=1 𝑥𝑛=(𝑥∗𝑥)𝑛/2 𝑠𝑖 𝑛>0 𝑦 𝑒𝑠 𝑝𝑎𝑟 𝑥𝑛=𝑥∗(𝑥)𝑛−1 𝑠𝑖 𝑛>0 𝑦 𝑒𝑠 𝑖𝑚𝑝𝑎𝑟
Realice la traza del algoritmo considerando x= 3 y n = 4.
*/
package Ejercicio_1;

public class Ejercicio_1 {
    public static float Potencia(float x, int n){
        if (n==0) {
            return 1;
        }
        else if (n > 0 && n%2==0) {
            x = x*x;
            n = n/2;
            return Potencia(x,n);
        }
        else if(n > 0 && n%2 != 0){
            return x * Potencia(x, n-1);
        }
        else{
            return -1;
        }
    }
    
    public static void main(String[] args) {
        float resultado = Potencia(3, 4);
        System.out.println("Resultado: " + resultado);
    }
    
}
