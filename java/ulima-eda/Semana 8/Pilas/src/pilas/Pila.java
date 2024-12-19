/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author Usuario
 */
public class Pila {
    private int MAX_SIZE = 10;
    private int top;
    private int[] datos;
    
    //Constructor
    public Pila() {
        this.datos = new int[MAX_SIZE];
        this.top = -1;
    }
    
    //Método esta vacia
    public boolean estaVacia(){
        if (top == -1) {
            return true;
        }
        else{
            return false;
        }
    }
    
    //Método para ver si esta llena
    public boolean estaLlena(){
        if (top == MAX_SIZE - 1) {
            return true;
        }
        else{
            return false;
        }
    }
    
    //Método para ingresar
    public void push(int item){
        if (!estaLlena()) {
            top++;
            datos[top] = item;
        }
    }
    
    //Método para retirar, cuando retiro es para usar el dato
    public Integer pop(){
        if (!estaVacia()) {
            int elem = datos[top];
            datos[top] = -999;   //limpiar la posición
            top--;
            return elem;
        }
        else{
            System.out.println("La pila está vacía");
            return null;  //retorna null
        }
    }
    
    //Mostrar pila
    public void mostrarPila(){
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print(datos[i] + " | ");
        }
        System.out.println("");
    }
}
