/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAArbol;

/**
 *
 * @author Usuario
 */
public class Nodo {
    //Atributos
    private int valor;
    private Nodo der;
    private Nodo izq;
    
    //Constructor
    public Nodo(int valor){
        this.valor = valor;
        this.der = null;
        this.izq = null;
    }
    
    //Getters and setters
    public int getValor(){
        return valor;
    }
    
    public Nodo getDerecho(){
        return der;
    }
    
    public Nodo getIzquierdo(){
        return izq;
    }
    
    public void setValor(int val){
        this.valor = val;
    }
    
    public void setDerecho(Nodo der){
        this.der = der;
    }
    
    public void setIzquierdo(Nodo izq){
        this.izq = izq;
    }
    
    
}
