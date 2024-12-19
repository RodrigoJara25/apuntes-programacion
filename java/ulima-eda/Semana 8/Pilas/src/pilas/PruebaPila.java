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
public class PruebaPila {
    public static void main(String[] args) {
        Pila p1 = new Pila();
        p1.push(5);
        p1.push(10);
        p1.push(15);
        p1.mostrarPila();
        int dato1 = p1.pop();
        System.out.println("Dato recuperado: " + dato1);
        p1.mostrarPila();
    }
    
}
