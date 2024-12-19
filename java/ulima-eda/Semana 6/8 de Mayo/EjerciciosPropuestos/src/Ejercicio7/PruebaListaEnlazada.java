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
public class PruebaListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada lista1 = new ListaEnlazada();
        lista1.insertar(255, 10, 200);
        lista1.insertar(777, 15, 100);
        lista1.insertar(199, 10, 300);
        lista1.mostrar();
        
        System.out.println("-----------------------------------");
        lista1.simpleBubbleSort();
        lista1.mostrar();
    }
    
}
