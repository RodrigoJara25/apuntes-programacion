/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7;

/**
 *
 * @author Usuario
 */
public class Ejercicio_7 {
    public static boolean busquedaBinaria(int[] array, int inicio, int fin, int valor_buscado){
        int medio = inicio + (fin - inicio) / 2;
        if(array[medio]==valor_buscado) {
            return true;
        }
        else{
            if (valor_buscado < array[medio]) {
                fin = medio-1;
                return busquedaBinaria(array, inicio, fin, valor_buscado);
            }
            else{
                inicio = medio+1;
                return busquedaBinaria(array, inicio, fin, valor_buscado);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        boolean resultado = busquedaBinaria(A, 0, A.length-1, 9);
        System.out.println("Encontrado: " + resultado);
    }
}
