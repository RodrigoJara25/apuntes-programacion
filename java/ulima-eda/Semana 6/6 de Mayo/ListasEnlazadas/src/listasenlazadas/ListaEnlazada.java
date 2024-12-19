/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author Usuario
 */
public class ListaEnlazada {

    private Nodo L;    //puntero al primer nodo de la lista

    //Constructor
    public ListaEnlazada() {   //cuando una lista se crea, se crea vacia
        this.L = null;   //no apunta a nadie porque recíen se crea
    }
    
    
    //Método para ver si está vacía o no la lista
    public boolean estaVacia(){
        if (L == null) {
            return true;
        }
        else{
            return false;
        }
    }
    
    
    //Método para insertar a la lista
    public void insertar(int valor){
        
        //1- se crea un Nodo
        Nodo nuevo_nodo = new Nodo(valor);
        
        //2-Enlazar el Nodo a la lista
        if (estaVacia()) {  //si la lista esta vacia
            this.L = nuevo_nodo;   //el L (puntero) apunta directamente al nuevo nodo, ya no recorre nada
        }
        else{
            //Creamos un Nodo que va a recorrer la lista, desde el inicio L
            Nodo ptr = this.L;

            //Recorremos la lista hasta llegar a alguien que apunte a null
            while(ptr.getNext() != null){
                ptr = ptr.getNext();  //ptr va avanzando hasta llegar a alguien que "next" sea null 
            }
            //Cuando el bucle rompe es porque ya llegó al último Nodo de la lista
            ptr.setNext(nuevo_nodo); //asignamos al nuevo_nodo con el ptr y asi lo enlazamos y creamos un nuevo Nodo en la lista
        }
    }
    
    
    //método para mostrar los valores de la lista
    public void mostrar(){
        //1-Creamos un nodo en el inicio de la lista 
        Nodo ptr = this.L;
        
        //2-El nodo recorre la lista
        while(ptr != null){
            System.out.print(ptr.getValue()+ " -> ");  //va mostrando los valores 
            ptr = ptr.getNext();   //se actualiza y pasa al siguiente Nodo
        }
        System.out.println("");
    }
    
    
    //Método para búsqueda
    public int buscar(int val_buscado){
        
        //1-crear un nodo en el inicio de la lista que recorra la lista.
        Nodo ptr = this.L;
        
        while(ptr != null && ptr.getValue() != val_buscado){   //mientras no sea null y no sea el valor buscado
            ptr = ptr.getNext();  //pasar al siguiente nodo
        }
        
        //hay dos formas de romper el bucle: 1)Se encuentra el valor buscado 2)No se encuentra el valor buscado y llega a null
        if (ptr == null) {   //si no se encuentra el valor buscado
            return -1;       //indicamos que retorne -1 si no se encuentra
        }
        else {    //ptr.getValue() == val_buscado
            return ptr.getValue();      //si se encuentra el valor, lo retornamos
        }
    }
    
    
    //Método de eliminación
    public void eliminar(int val_eliminar){
        
        //1-creamos las variables
        Nodo ptr = this.L;   //ptr va a recorrer toda la lista
        Nodo prev = null;    //esta variable va a almacenar el Nodo anterior al ptr para hacer la eliminación
        //el "prev" siempre va a ser uno anterior al "ptr"
        
        //2-Recorremos el array en busca del valor a eliminar
        while(ptr != null && ptr.getValue() != val_eliminar){
            prev = ptr;             //el previo guarda el valor del ptr
            ptr = ptr.getNext();    //el ptr avance al siguiente
        }
        
        //hay dos formas de romper el bucle: 1)Se encuentra el valor buscado 2)No se encuentra el valor buscado y llega a null
        if (ptr != null && ptr.getValue() == val_eliminar) {   //si encontramos el valor a eliminar
            if (prev == null) {   //si prev==null, significa que quiero eliminar el 1er elemtno de la lista
                this.L = ptr.getNext();
            }
            else{
                prev.setNext(ptr.getNext());
            }
        }
    }
    
    
    //Método que devuelve la cantidad de elementos a la lista
    public int cantidadElementos(){
        Nodo ptr = this.L;
        int contador=0;
        while(ptr != null){
            contador++;
            ptr = ptr.getNext();
        }
        return contador;
    }
    
    
    //Método para insertar al inicio de la lista un nuevo elemento (insertarInicio)
    public void insertarInicio(int valor){
        //Creacion de nodo
        Nodo nuevoNodo = new Nodo(valor);
        
        //Si la lista esta vacia
        if(estaVacia()){
            nuevoNodo.setNext(null);     //el nuevo nodo no tiene siguiente, asi que es null
            this.L = nuevoNodo;          //y el inicio L, es declarado como nuevoNodo
        }
        //Si no esta vacia
        else{
            nuevoNodo.setNext(L);        //El siguiente de nuevoNodo debe ser el primero de la lista original (L)
            this.L = nuevoNodo;          //y el inicio L, es declarado como nuevoNodo
        }
    }   
}
