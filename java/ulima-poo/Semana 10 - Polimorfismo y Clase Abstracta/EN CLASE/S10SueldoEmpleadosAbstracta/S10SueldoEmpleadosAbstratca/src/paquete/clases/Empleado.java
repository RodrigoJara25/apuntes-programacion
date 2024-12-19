/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author Usuario
 */
public abstract class Empleado 
{
    //Atributos
    protected String nombre, genero, cargo;
    protected int numGrados, añosServ;
    protected float sueldoB, boni, sueldoT;
    
    //Constructor
    public Empleado(String nombre, String genero, String cargo, int numGrados, int añosServ, float sueldoB) {
        this.nombre = nombre;
        this.genero = genero;
        this.cargo = cargo;
        this.numGrados = numGrados;
        this.añosServ = añosServ;
        this.sueldoB = sueldoB;
    }
    
    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumGrados() {
        return numGrados;
    }

    public void setNumGrados(int numGrados) {
        this.numGrados = numGrados;
    }

    public int getAñosServ() {
        return añosServ;
    }

    public void setAñosServ(int añosServ) {
        this.añosServ = añosServ;
    }

    public float getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(float sueldoB) {
        this.sueldoB = sueldoB;
    }

    public float getBoni() {
        return boni;
    }

    public void setBoni(float boni) {
        this.boni = boni;
    }

    public float getSueldoT() {
        return sueldoT;
    }

    public void setSueldoT(float sueldoT) {
        this.sueldoT = sueldoT;
    }
    
    //Métodos (son iguales para todas las SubClases)
    public void CalcularSueldoTotal()
    {
        this.sueldoT = this.sueldoB + this.boni;
    }

    public String VerInfo() 
    {
        return "Nombre: " + nombre + 
                "\nGenero: " + genero + 
                "\nCargo: " + cargo + 
                "\nNumGrados: " + numGrados + 
                "\nañososServ: " + añosServ + 
                "\nSueldoB=" + sueldoB + 
                "\nBoni: " + boni + 
                "\nsueldoT=" + sueldoT;
    }
    
    //Método Abstracto (es diferente para cada SubClase)
    public abstract void CalcularBoni(); //la bonificación se calcula diferente en cada SubClase, pero todos lo calculan
    
    
    
}
