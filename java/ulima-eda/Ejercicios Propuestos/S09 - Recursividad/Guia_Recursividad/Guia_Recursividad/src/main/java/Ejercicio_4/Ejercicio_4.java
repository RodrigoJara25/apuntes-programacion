/*
4. Sea A un arreglo unidimensional de n números enteros. Escriba una 
función recursiva que permita buscar un elemento llamado Dato en el arreglo A, 
retornando el valor Verdadero si lo encuentra ó Falso en caso contrario.
*/
package Ejercicio_4;

public class Ejercicio_4 {
    public static boolean Buscar(int dato, int[] A, int index){
        if (index == A.length) {
            return false;
        }
        else if (A[index] == dato) {
            return true;
        }
        else{
            index++;
            return Buscar(dato, A, index);
        }
    }
    
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6};
        int dato = 6;
        boolean resultado = Buscar(dato, A, 0);
        System.out.println("Dato encontrado: " + resultado);
    }
}
