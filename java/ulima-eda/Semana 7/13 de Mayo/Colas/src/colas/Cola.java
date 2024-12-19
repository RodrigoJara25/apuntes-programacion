/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author Usuario
 */
public class Cola {
    
    private int[] datos;
    private int front;   //posicion del inicio
    private int back;    //posicion del final
    int MAX_SIZE = 10;   //tamaño maximo de la cola
    
    //Constructor
    public Cola() {
        this.datos = new int[MAX_SIZE];  //inicializamos
        this.front = -1;                 //front apunta a nada
        this.back = -1;                  //back apunta a nada
    }
    
    //Método para ver si esta vacia
    public boolean estaVacia(){
        if (front == -1 && back == -1) {
            return true;
        }
        else{
            return false;
        }
    }
    
    //Método para ver si la cola esta completamente llena
    public boolean estaLlena(){
        if ((back +1) == front || ((front == 0) && (back == MAX_SIZE - 1))) { //si el front esta al inicio y el back al final
            return true;
        }
        else{
            return false;
        }
    }
    
    //Método para encolar (insertar)
    public void encolar(int valor){
        if (estaLlena()==false) {  //si la cola no esta llena
            if (estaVacia()) {     //si la cola esta vacia
                front = 0;         //el primer elemnto va a ser el front y back
                back = 0;
            }
            else if (back != MAX_SIZE - 1) {  //y si el back no está en la última posicion de la cola
                back++;  //el back se amumenta uno más
            }
            else{  //si no
                back = 0;  //regresas al back a la posición inicial
            }
            datos[back] = valor;   //y en esa posición se agrega el nuevo valor
        }
    }
    
    //Método para desencolar (sacar)
    public int desencolar(){    //desencolo cuando quiero hacer algo con el objeto
        if (estaVacia()==false) {  //si la cola no esta vacia
            int item = datos[front];   //el que voy a desencolar siempre es el que está adelante
            datos[front] = -999;   //es opcional esto, no es necesario
            if (front == back) {  //si el front esta en la misma posicion del back
                front = -1;  //Es porque erá el último elemento de la cola
                back = -1;   //Se reinician los indices de front y back
            }
            else if (front != MAX_SIZE - 1) {  //si no estas en el final, el front++
                front++;
            }
            else{  //si el front está al final de la cola
                front = 0;   //vuelve al inicio
            }
            return item;
        }
        else{   //si la cola esta vacia
            System.out.println("La cola esta vacia");
            return -1;
        }
    }
    
    //Método para mostrar la cola
    public void mostrarCola(){
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print(datos[i]+ " | ");    
        }
        System.out.println("");
    }
}
