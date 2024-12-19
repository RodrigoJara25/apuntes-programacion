/*
6. Sea A un arreglo unidimensional de n números enteros. Escriba una función 
recursiva que determine si todos los elementos de A son positivos, retornando 
el valor booleano correspondiente.
*/
package Ejercicio_6;

public class Ejercicio_6 {
    public static boolean Positivos(int[] A, int index){
        if (A[index] < 0) {
            return false;
        }
        else if (index == A.length-1) {
            return true;
        }
        else {
            return Positivos(A, index+1);
        }
    
    }
    
    public static void main(String[] args) {
        int[] A = {1,2,-3,4,5};
        boolean resultado = Positivos(A, 0);
        System.out.println("Resultado: " + resultado);
    }
    
}
