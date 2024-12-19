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
public class PruebaListaEnlazada {
    public static void main(String[] args) {
        
        //1- Creamos una lista enlazada
        ListaEnlazada lista1 = new ListaEnlazada();
        
        //2-Insertamos a la lista
        lista1.insertar(5);
        
        //3-Mostramos
        lista1.mostrar();
        
        //Probamos
        lista1.insertar(-1);
        lista1.insertar(6);
        lista1.insertar(8);
        lista1.insertar(10);
        lista1.insertar(4);
        lista1.mostrar();
        
        //4-Buscar
        System.out.println(lista1.buscar(5));   //si está
        System.out.println(lista1.buscar(10));  //no está
        
        //5-Eliminar
        lista1.eliminar(10);
        lista1.eliminar(6);
        lista1.mostrar();
        
        //6-Cantidad de elementos
        System.out.println("Cantidad de elementos: " + lista1.cantidadElementos());
        
        //7-Insertar al inicio
        lista1.insertarInicio(7);
        lista1.mostrar();
    }
}
