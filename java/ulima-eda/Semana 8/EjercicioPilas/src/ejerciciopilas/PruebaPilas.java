/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopilas;

/**
 *
 * @author Usuario
 */
public class PruebaPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila pila1 = new Pila();
        pila1.push(5);
        pila1.push(8);
        pila1.push(1);
        pila1.mostrarPila();
        pila1.pop();
        pila1.mostrarPila();
        pila1.push(15);
        pila1.push(8);
        pila1.push(34);
        pila1.mostrarPila();
        pila1.intercambiarDatos(8, 11);
        pila1.mostrarPila();
    }
    
}
