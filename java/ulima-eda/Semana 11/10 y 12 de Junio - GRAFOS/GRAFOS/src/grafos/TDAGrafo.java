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
public class TDAGrafo {
    //Atributos
    private int[][] matAdj;
    
    //Constructor
    public TDAGrafo(int numVert){
        matAdj = new int[numVert][numVert];  //es una matriz cuadrada
    }
    
    //Método para insertar las aristas
    public void insertarArista(int vIni, int vFin){  //vertice de inicio y de fin
        matAdj[vIni][vFin] = 1;
    }
    
    public void mostrarGrafo(){
        for (int i = 0; i < matAdj.length; i++) {
            for (int j = 0; j < matAdj.length; j++) {
                System.out.print(matAdj[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
