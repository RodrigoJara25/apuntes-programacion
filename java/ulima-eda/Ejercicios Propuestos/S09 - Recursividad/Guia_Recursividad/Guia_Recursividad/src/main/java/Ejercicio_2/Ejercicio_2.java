/*
2. El coeficiente binomial C (n, m) indica el número de maneras de escoger m objetos entre n objetos.
Se conoce la relación C (n, m) = C (n-1, m-1) + C (n-1, m). Formule una función recursiva para calcular C (n, m).
Realice la traza del algoritmo considerando n= 5 y m = 3.
*/
package Ejercicio_2;

public class Ejercicio_2 {
    public static int C(int n, int m){
        if (m==1) {
            return n;
        }
        else if (m==n) {
            return 1;
        }
        else{
            return C(n-1, m-1) + C(n-1, m);
        }
    }
    
    public static void main(String[] args) {
        int resultado = C(5,4);
        System.out.println("Resultado: " + resultado);
    }
}
