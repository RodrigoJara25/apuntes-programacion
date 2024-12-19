/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author Usuario
 */
public class ListaEnlazada {
    private Nodo L;
    
    //Constructor
    public ListaEnlazada() {
        this.L = null;
    }
    
    //Metodos
    public boolean estaVacia(){
        if (this.L == null) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public void insertar(int codeEstudiante, int codeCurso, int notaFinal){
        Nodo nuevo_nodo = new Nodo(codeEstudiante, codeCurso, notaFinal);
        if (estaVacia()) {
            this.L = nuevo_nodo;
        }
        else{
            Nodo ptr = this.L;
            while(ptr.getNext() != null && (ptr.getCodeEstudiante() != codeEstudiante || ptr.getCodeCurso() != codeCurso)){
                ptr = ptr.getNext();
            }
            if (ptr != null && (ptr.getCodeEstudiante() != codeEstudiante ||
                    ptr.getCodeCurso() != codeCurso)) {
                ptr.setNext(nuevo_nodo);
            }
            else{
                System.out.println("Código del estudiante y curso ya existentes");
            }
        }
    }
    
    public void mostrar(){
        Nodo ptr = this.L;
        while(ptr != null){
            System.out.print("CodeEstudiante: " + ptr.getCodeEstudiante() + " -> ");
            System.out.print("CodeCurso: " + ptr.getCodeCurso() + " -> ");
            System.out.print("notaFinal: " + ptr.getNotaFinal() + " -> ");
            System.out.println("");
            ptr = ptr.getNext();
        }
    }
    
    public int cantidadElementos(){
        Nodo ptr = this.L;
        int contador=0;
        while(ptr != null){
            contador++;
            ptr = ptr.getNext();
        }
        return contador;
    }
    
    public float promedioEstudiante(int codeEst){
        Nodo ptr = this.L;
        float contador = cantidadElementos();
        float sumaNotas = 0;
        int contProm = 0;
        for (int i = 0; i < contador; i++) {
            if (ptr.getCodeEstudiante() == codeEst) {
                sumaNotas = sumaNotas + ptr.getNotaFinal();
                contProm++;
            }
            ptr = ptr.getNext();
        }
        float promedio = sumaNotas / contProm;
        return promedio;
    }
    
    
    
}
