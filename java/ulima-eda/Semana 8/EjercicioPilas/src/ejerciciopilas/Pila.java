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
public class Pila {
    private int top;
    private int[] datos;
    private int MAX_SIZE = 10;

    public Pila() {
        this.top = -1;
        this.datos = new int[MAX_SIZE];
    }
    
    public boolean estaVacia(){
        if (top == -1) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean estaLlena(){
        if (top == MAX_SIZE - 1) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public void push(int valor){
        if (!estaLlena()) {
            top++;
            datos[top] = valor;
        }
        else{
            System.out.println("Está llena");
        }
    }
    
    public Integer pop(){
        if (!estaVacia()) {
            int elem = datos[top];
            datos[top] = -999;
            top--;
            return elem;
        }
        else{
            System.out.println("Lista vacia");
            return null;
        }
    }
    
    public void mostrarPila(){
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print(datos[i]+ " | ");
        }
        System.out.println("");
    }
    
    public boolean buscarValor(int val_buscado){
        if (!estaVacia()) {
            for (int i = 0; i < MAX_SIZE; i++) {
                if (datos[i] == val_buscado) {
                    return true;
                }
            }
            return false;
        }
        else{
            return false;
        }
    }
    
    
    public void intercambiarDatos(int valorAntiguo, int valorNuevo){
        if (buscarValor(valorAntiguo)) {
            for (int i = 0; i < MAX_SIZE; i++) {
                if (datos[i] == valorAntiguo) {
                    datos[i] = valorNuevo;
                }
            }
        }
        else{
            System.out.println("Dato no existente");
        }
    }
    
}
