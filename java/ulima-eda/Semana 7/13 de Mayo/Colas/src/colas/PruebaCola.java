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
public class PruebaCola {
    public static void main(String[] args) {
        Cola cola1 = new Cola();
        cola1.encolar(4);
        cola1.encolar(2);
        cola1.encolar(3);
        cola1.mostrarCola();
        cola1.desencolar();
        cola1.mostrarCola();
        int n = cola1.desencolar();
        System.out.println("Dato desencolado: " + n);
        cola1.mostrarCola();
        
    }
    
}
