/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionGranja;

/**
 *
 * @author Usuario
 */
public class Granja 
{
    //Atributos
    private String nombre;
    private int area;
    private Pollo[] listaPollo;
    private int numPollitos;
    
    //Constructor
    public Granja(String nombre, int area) 
    {
        this.nombre = nombre;
        this.area = area;
        this.numPollitos = 0;
        this.listaPollo = new Pollo[10];
    }
    
    //Getters and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Pollo[] getListaPollo() {
        return listaPollo;
    }

    public void setListaPollo(Pollo[] listaPollo) {
        this.listaPollo = listaPollo;
    }

    public int getNumPollitos() {
        return numPollitos;
    }

    public void setNumPollitos(int numPollitos) {
        this.numPollitos = numPollitos;
    }
    
    //Módulos
    public  void IngresarPollitos(Pollo obj1)
    {
        if (this.numPollitos<this.listaPollo.length) 
        {
            this.listaPollo[this.numPollitos]=obj1;
            this.numPollitos=this.numPollitos+1;
        }
        else
        {
            System.out.println("No hay más espacio disponible");
        }
    }
    
    
}
