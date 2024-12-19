/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int codArticulo;
    private int cantVendida;
    private int precioUnitario;
    private Nodo next;
    
    //Constructor
    public Nodo(int codArticulo, int cantVendida, int precioUnitario) {
        this.codArticulo = codArticulo;
        this.cantVendida = cantVendida;
        this.precioUnitario = precioUnitario;
        this.next = null;
    }
    
    //Getters and setters
    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    public int getCantVendida() {
        return cantVendida;
    }

    public void setCantVendida(int cantVendida) {
        this.cantVendida = cantVendida;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }    
}
