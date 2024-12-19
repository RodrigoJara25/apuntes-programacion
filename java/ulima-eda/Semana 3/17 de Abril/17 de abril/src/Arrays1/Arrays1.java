/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays1;

/**
 *
 * @author Usuario
 */
public class Arrays1 
{
    public static int insertarArrarNoOrdenado(int array[], int contador, int num){
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
        return -1;  //no existen posicones negativas
    }
    
    public static int eliminarArrayNoOrdenado(int array[], int contador, int valor_eliminar){
        int indice = buscarArrayNoOrdenado(array, contador, valor_eliminar);
        if (indice != -1) {
            for (int i = indice; i < contador-1 ; i++) {
            array[i] = array[i+1];
            }
        }
        contador--;
        return contador;
    }
    
    public static void main(String[] args) {
        int[] array = new int[6]; //tamaño de 6 del array
        int contador = 0;
        contador = insertarArrarNoOrdenado(array, contador, 4);
        contador = insertarArrarNoOrdenado(array, contador, 2);
        contador = insertarArrarNoOrdenado(array, contador, 1);
        mostrarArray(array, contador);
       
        int pos_buscado = buscarArrayNoOrdenado(array, contador, 1);
        System.out.println("Buscado: " + pos_buscado);
        pos_buscado = buscarArrayNoOrdenado(array, contador, 10);
        System.out.println("Buscado: " + pos_buscado);
        
        contador = eliminarArrayNoOrdenado(array, contador, 4);
        mostrarArray(array, contador);
    }
}
