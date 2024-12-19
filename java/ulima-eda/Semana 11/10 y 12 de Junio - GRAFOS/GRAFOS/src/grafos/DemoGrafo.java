/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author Usuario
 */
public class DemoGrafo {
    public static void main(String[] args) {
        TDAGrafo g1 = new TDAGrafo(5);
        g1.insertarArista(0, 1);
        g1.insertarArista(0, 2);
        g1.insertarArista(1, 3);
        
        g1.insertarArista(1, 0);
        g1.insertarArista(2, 0);
        g1.insertarArista(3, 1);
        
        
        g1.insertarArista(2, 3);
        g1.insertarArista(3, 2);
        
        g1.insertarArista(3, 4);
        g1.insertarArista(4, 3);
        
        g1.mostrarGrafo();
    }
}
