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
public class Nodo {
    private int codeEstudiante;
    private int codeCurso;
    private int notaFinal;
    private Nodo next;

    //Constructor
    public Nodo(int codeEstudiante, int codeCurso, int notaFinal) {
        this.codeEstudiante = codeEstudiante;
        this.codeCurso = codeCurso;
        this.notaFinal = notaFinal;
        this.next = null;
    }
    
    //Getters and setters
    public int getCodeEstudiante() {
        return codeEstudiante;
    }

    public void setCodeEstudiante(int codeEstudiante) {
        this.codeEstudiante = codeEstudiante;
    }

    public int getCodeCurso() {
        return codeCurso;
    }

    public void setCodeCurso(int codeCurso) {
        this.codeCurso = codeCurso;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
