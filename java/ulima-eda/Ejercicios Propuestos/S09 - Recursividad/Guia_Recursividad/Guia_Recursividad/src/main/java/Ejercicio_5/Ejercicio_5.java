/*
5. Sea A un arreglo unidimensional de n números enteros. Escriba una función 
recursiva que determine el elemento más grande de A.
*/
package Ejercicio_5;

public class Ejercicio_5 {
    public static int masGrande(int[] A, int index){ // vas sacando el valor máximo desde el último elemento del array
        if (index == A.length-1) {
            return A[index];
        }
        int maxResto = masGrande(A, index+1);
        
        if(A[index] >= maxResto){
            return A[index];
        }
        else{
            return maxResto;
        }
    }
    
    public static void main(String[] args) {
        int[] A = {1, 10, 3, 9, 2, 8};
        int maximo = masGrande(A, 0);
        System.out.println("El elemento má s grande del arreglo es: " + maximo);
    }
    
}
