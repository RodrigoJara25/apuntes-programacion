/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

public class Nodo {
    private int value;   //valor que va a guardar el nodo
    private Nodo next;   //el puntero (siguiente) apunta a otro Nodo
    
    //Constructor
    public Nodo(int value) {    
        this.value = value;  //para crear un nodo, ya debemos saber que valor a tener "value"
        this.next = null;    //cuando un Nodo se crea, el next apunta a null
    }
    
    //Getters and setters
    public int getValue() {
        return value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Nodo next) {
        this.next = next;  //actualizar el next
    }
    
}
