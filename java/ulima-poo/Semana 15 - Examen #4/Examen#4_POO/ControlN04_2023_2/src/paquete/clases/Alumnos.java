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
public abstract class Alumnos 
{
    //Atributos
    protected String code;
    protected String nombre;
    protected int edad;
    protected int creditos;
    protected float pagoCiclo;
    
    //Constructor
    public Alumnos(String code, String nombre, int edad) 
    {
        this.code = code;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Getters and setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public float getPagoCiclo() {
        return pagoCiclo;
    }

    public void setPagoCiclo(float pagoCiclo) {
        this.pagoCiclo = pagoCiclo;
    }
    
    //Metodo abstracto
    public abstract void CalcularCreditos();
    
    //Método
    public void CalcularPagoCiclo()
    {
        this.pagoCiclo = this.creditos * 105.5f;
    }
    
    
    
}
