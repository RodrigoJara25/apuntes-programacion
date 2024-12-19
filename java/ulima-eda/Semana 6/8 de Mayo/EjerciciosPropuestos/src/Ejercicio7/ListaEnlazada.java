/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author Usuario
 */
public class ListaEnlazada {
    
    private Nodo L;
    
    //Constructor
    public ListaEnlazada() {
        this.L = null;
    }
    
    //Métodos
    public boolean estaVacia(){
        if (this.L  == null) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public void insertar(int codA, int cantV, int precioU){
        Nodo nuevoNodo = new Nodo(codA, cantV, precioU);
        if (estaVacia()) {
            this.L = nuevoNodo;
        }
        else{
            Nodo ptr = this.L;
            while(ptr.getNext() != null && ptr.getCodArticulo() != codA){
                ptr = ptr.getNext();
            }
            if (ptr != null && ptr.getCodArticulo() != codA) {
                ptr.setNext(nuevoNodo);
            }
            else{
                System.out.println("Artículo ya existente");
            }
        }
    }
    
    public int cantidadElementos(){
        Nodo ptr = this.L;
        int contador=0;
        while(ptr != null){
            contador++;
            ptr = ptr.getNext();
        }
        return contador;
    }
    
    public void simpleBubbleSort(){
        int contador = cantidadElementos();
        for (int i = 0; i < contador; i++) {
            Nodo ptr = this.L;
            Nodo siguiente = ptr.getNext();
            for (int j = 0; j < contador - 1; j++) {
                if (ptr.getCodArticulo() > siguiente.getCodArticulo()) {
                    Nodo aux = ptr;
                    ptr = siguiente;
                    siguiente = aux;
                }
            }
        }
    }
    
    public void mostrar(){
        Nodo ptr = this.L;
        while(ptr != null){
            System.out.print("CodeArticulo: " + ptr.getCodArticulo() + " -> ");
            System.out.print("CantVendida: " + ptr.getCantVendida() + " -> ");
            System.out.print("PrecioUnitario: " + ptr.getPrecioUnitario() + " -> ");
            System.out.println("");
            ptr = ptr.getNext();
        }
    }
    
    
    
    
}
