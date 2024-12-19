/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author Usuario
 */
public class DemoGrafo {
    public static void main(String[] args) {
        TDAGrafo g1 = new TDAGrafo(6);
        g1.insertarArista(0, 1);
        g1.insertarArista(0, 2);
        g1.insertarArista(0, 3);
        g1.insertarArista(1, 0);
        g1.insertarArista(1, 4);
        g1.insertarArista(2, 0);
        g1.insertarArista(2, 5);
        g1.insertarArista(3, 0);
        g1.insertarArista(3, 4);
        g1.insertarArista(3, 5);
        g1.insertarArista(4, 1);
        g1.insertarArista(4, 3);
        g1.insertarArista(4, 5);
        g1.insertarArista(5, 2);
        g1.insertarArista(5, 3);
        g1.insertarArista(5, 4);
        System.out.println("GRAFO: ");
        g1.mostrarGrafo();
        
        System.out.println("ADYACENTES: ");
        int[] adj = g1.adyacentes(4);
        for (int i = 0; i < adj.length; i++) {
            System.out.println(adj[i]);
        }
    }
}
