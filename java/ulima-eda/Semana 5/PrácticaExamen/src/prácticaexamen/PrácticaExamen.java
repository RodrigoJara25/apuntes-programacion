/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaexamen;

/**
 *
 * @author Usuario
 */
public class PrácticaExamen {

    public static int insertArrayNoOrdenado(int array[], int contador, int num){
        if (contador < array.length) {
            array[contador] = num;
            contador++;
        }
        return contador;
    }
    
    public static void mostrarArray(int array[], int contador){
        for (int i = 0; i < contador; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static int buscarArrayNoOrdenado(int array[], int contador, int valor_buscado){
        for (int i = 0; i < contador; i++) {
            if (array[i]==valor_buscado) {
                return i;
            }
        }
        return -1;
    }
    
    public static int eliminarArrayNoOrdenado(int array[], int contador, int valor_eliminar){
        int indice_eliminar = buscarArrayNoOrdenado(array, contador, valor_eliminar);
        if (indice_eliminar != -1) {
            for (int i = indice_eliminar; i < contador-1; i++) {
                array[i] = array[i+1];
            }
            contador--;
        }
        return contador;
    }
    
    public static int insertArrayOrdenado(int array[], int contador, int num){
        int pos = -1;
        if (contador < array.length) {
            for (int i = contador-1; i >= 0; i--) {
                if (num < array[i]) {
                    array[i+1] = array[i];
                }
                else{
                    pos = i;
                }
            }
            array[pos+1] = num;
            contador++;
        }
        return contador;
    }
    
    public static int busquedaBinaria(int array[], int contador, int valor_buscado){
        int inicio = 0;
        int fin = contador-1;
        int medio;
        while(inicio <= fin){
            medio = (inicio + fin)/2;
            if (array[medio]==valor_buscado) {
                return medio;
            }
            else{
                if (valor_buscado > array[medio]) {
                    inicio = medio+1;
                }
                else{
                    fin = medio -1;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
