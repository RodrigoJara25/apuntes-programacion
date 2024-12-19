package Ejercicio_6;

import demografo.*;

public class TDAGrafo {
    private int[][] matAdj;
    
    public TDAGrafo(int numVert) {
        matAdj = new int[numVert][numVert];
    }
    
    public void insertarArista(int vIni, int vFin) {
        matAdj[vIni][vFin] = 1;
    }
    
    public int[] adyacentes(int vertice){
        //calculamos la cantidad de adaycentes
        int numAdj = 0;
        for (int i = 0; i < matAdj.length; i++) {
            if (matAdj[vertice][i]==1) {
                numAdj++;
            }
        }
        //creamos lista con el tamaño de los adaycentes
        int[] listaAdj = new int[numAdj];
        //almacenamos los indices de los adyacentes
        int idx = 0;
        for (int i = 0; i < matAdj.length; i++) {
            if (matAdj[vertice][i]==1) {
                listaAdj[idx] = i;
                idx++;
            }
        }
        return listaAdj;
    }
    
    //recorrido por anchura
    public void bfs(int nodoInicial){  //matAdj[filaId].length --> cantidad de columnas
        //matAdj.lenght -> retorna la cantidad de filas
        boolean[] visitados = new boolean[matAdj.length];  //se crea una lista llena de 0
        TDACola cola = new TDACola();
        visitados[nodoInicial] = true;
        cola.encolar(nodoInicial);  //iniciamos bfs con el nodo inicial
        //hasta qu ela cola no este vacia, hacemos el procedimiento
        while(!cola.estaVacia()){
            int nodo = cola.desencolar();
            System.out.println("Nodo visitado: " + nodo);
            int[] adj = adyacentes(nodo);
            for (int i = 0; i < adj.length; i++) {
                if (visitados[adj[i]] == false) {  //si no ha sido visitado, se encola
                    visitados[adj[i]] = true;
                    cola.encolar(adj[i]);
                }
            }
            //cola.mostrarCola();
        }
    }
    
    //recorrido por largo
    public void dfs(int nodoInicial){
        boolean[] visitados = new boolean[matAdj.length];
        visitados[nodoInicial] = true;
        TDAPila pila = new TDAPila();
        pila.push(nodoInicial);
        while(!pila.estaVacia()){
            int nodo = pila.pop();
            System.out.println("Nodo visitado: " + nodo);
            int[] adj = adyacentes(nodo);
            for (int i = adj.length - 1; i >= 0; i--) {
                if (visitados[adj[i]] == false) {
                    visitados[adj[i]] = true;
                    pila.push(adj[i]);
                }
            }
        }
    }
    
    // Saber si el grafo es dirigido o no
    public boolean esDirigido(){
        for (int i = 0; i < matAdj.length; i++) {
            for (int j = 0; j < matAdj.length; j++) {
                if (matAdj[i][j] != matAdj[j][i]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    /*
    5) Dado un grafo G, implemente un algoritmo que imprima un reporte con el grado de cada uno de
    sus vértices. Denominamos grado a la cantidad de aristas incidentes en cada vértice.
    */
    public void GradoVertice(){
        for (int i = 0; i < matAdj.length; i++) {
            int gradoVertice = 0;
            for (int j = 0; j < matAdj.length; j++) {
                if (matAdj[i][j]==1) {
                    gradoVertice++;
                }
            }
            System.out.println("Grado Vertice " + i + ": " + gradoVertice);
        }
    }
    
    /*
    6) Implemente un algoritmo que, dado un grafo G representado utilizando una matriz de
    adyacencias y un vector A que representa la secuencia de vértices de un camino, permita
    determinar si la ruta representada por A es posible de realizar en el grafo G.
    */
    public boolean rutaPosible(int[] A){
        for (int i = 0; i < A.length-1; i++) {
            boolean seguir = false;
            int[] listaAdj = adyacentes(A[i]);
            for (int j = 0; j < listaAdj.length; j++) {
                if (A[i+1]==listaAdj[j]) {
                    seguir = true;
                    break;
                }
            }
            if (seguir==false) {
                return false;
            }
        }
        return true;
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
