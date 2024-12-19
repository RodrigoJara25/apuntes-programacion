/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays2;

/**
 *
 * @author Usuario
 */
public class Arrays2 {
    
    public static int insertArrayOrdenado(int array[], int contador, int num){
        if (contador < array.length) 
        {
            int pos = -1; //cualquiera
            for (int i = contador-1; i >= 0; i--) {
                if (num < array[i]) {
                    array[i+1]=array[i];   //se agrega un nuevo espacio y se meuve todo a la derecha
                }
                //el i va a acabar en 0, el primer elemnto del array si es el menor de todos
                else{
                    pos = i;  //guardo la posición donde debo meter el numero
                    break;
                }
            }
            array[pos+1] = num;
            contador++;
        }
        else{
            System.out.println("El arreglo está lleno");
        }
        return contador;
    }
    
    public static int busquedaBinaria(int array[], int contador, int valor_buscado){
        int inicio=0;
        int fin = contador -1;
        int medio;
        while(inicio <= fin){
            medio = (fin + inicio)/2;
            if (array[medio] == valor_buscado) {
                return medio;
            }
            else{
                if (valor_buscado > array[medio]) {
                    inicio = medio + 1;
                }
                else{
                    fin = medio -1;
                }
            }
        }
        return -1;   //se retorna esto si no se encuentra el número
    }
    
    public static void mostrarArray(int array[], int contador){
        for (int i = 0; i < contador; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void main(String[] args) {
        int array[] = new int[6];
        int contador = 0;
        contador = insertArrayOrdenado(array,contador,2);
        contador = insertArrayOrdenado(array,contador,4);
        contador = insertArrayOrdenado(array,contador,6);
        mostrarArray(array, contador);
        
        System.out.println("----------");
        contador = insertArrayOrdenado(array,contador,3);
        mostrarArray(array, contador);
        
        System.out.println("----------");
        contador = insertArrayOrdenado(array,contador,1);
        contador = insertArrayOrdenado(array,contador,5);
        contador = insertArrayOrdenado(array,contador,7);
        mostrarArray(array, contador);
        
        System.out.println("----------");
        int pos_buscado = busquedaBinaria(array,contador,2);
        System.out.println(pos_buscado);
        pos_buscado = busquedaBinaria(array,contador,10);
        System.out.println(pos_buscado);
        
    }
    
}
