/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

/**
 *
 * @author Usuario
 */
public class Ordenamiento {
    
    public static int insertArray(int array[], int contador, int num){
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
    
    public static void simpleBubbleSort(int[] array, int contador){
        for(int i = 0; i < contador; i++){
            for(int j = 0; j < contador - 1; j++){
                if(array[j] > array[j + 1]){
                int aux = array[j];
                array[j] = array[j + 1];
                array[j + 1] = aux;
                }
            }   
        }
    }
    
    public static void selectionSort(int[] array, int contador){
        for(int i = 0; i < contador; i++){
            int p = i;
                for(int j = i + 1; j < contador; j++){
                    if(array[j] < array[p]){
                        p = j;
                    }
                }
            if(p != i){
                int temp = array[p];
                array[p] = array[i];
                array[i] = temp;
            }
        }
    }
    
    public static void insertionSort(int[] array, int contador){
        for(int i = 0; i < contador; i++){
            int current = array[i];
            int position = i;
            while(position > 0 && array[position - 1] > current){
                array[position] = array[position - 1];
                position--;
            }
            array[position] = current;
        }
    }
    
    
    public static void main(String[] args) {
        
        int array[] = new int[5];
        int contador = 0;
        contador = insertArray(array, contador, 3);
        contador = insertArray(array, contador, 4);
        contador = insertArray(array, contador, 7);
        contador = insertArray(array, contador, 1);
        contador = insertArray(array, contador, 9);
        mostrarArray(array, contador);
        
        System.out.println("-----------------");
        simpleBubbleSort(array, contador);
        mostrarArray(array, contador);
        
        System.out.println("-----------------");
        selectionSort(array, contador);
        mostrarArray(array, contador);
        
        System.out.println("-----------------");
        insertionSort(array, contador);
        mostrarArray(array,contador);
    }
    
}
