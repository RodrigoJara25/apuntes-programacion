package Ejercicio_3;

public class TDAGrafo {
    private int[][] matAdj;
    
    public TDAGrafo(int numVert) {
        matAdj = new int[numVert][numVert];
    }
    
    public void insertarArista(int vIni, int vFin) {
        matAdj[vIni][vFin] = 1;
    }
    
    public int[] adyacentes(int vertice){
        int cantAdj = 0;
        for (int i = 0; i < matAdj.length; i++) {
            if (matAdj[vertice][i] == 1) {
                cantAdj++;
            }
        }
        int[] listaAdj = new int[cantAdj];
        int index = 0;
        for (int i = 0; i < matAdj.length; i++) {
            if (matAdj[vertice][i] == 1) {
                listaAdj[index] = i;
                index++;
            }
        }
        return listaAdj;
    }
    
    public void mostrarGrafo() {
        for (int i = 0; i < matAdj.length; i++) {
            for (int j = 0; j < matAdj.length; j++) {
                System.out.print(matAdj[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
