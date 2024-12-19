/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class CAdministrativo extends CPersona
{
    //Atributos
    private int CodeAdmin;
    private String dependencia;
    private String FechaCon;
    private int sueldo;
    
    //Constructor
    public CAdministrativo(int CodeAdmin, String dependencia, String FechaCon, String nombre, String direccion, String fechaNac) 
    {
        super(nombre, direccion, fechaNac);
        this.CodeAdmin = CodeAdmin;
        this.dependencia = dependencia;
        this.FechaCon = FechaCon;
    }
    
    //Getters and setters
    public int getCodeAdmin() {
        return CodeAdmin;
    }

    public void setCodeAdmin(int CodeAdmin) {
        this.CodeAdmin = CodeAdmin;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getFechaCon() {
        return FechaCon;
    }

    public void setFechaCon(String FechaCon) {
        this.FechaCon = FechaCon;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    //Métodos
    public void calcularSueldo()
    {
        Random rand = new Random();
        this.sueldo = rand.nextInt(1500-500+1)+500;
    }
    
    //Override
    @Override
    public String VerInfo() 
    {
        return super.VerInfo() + 
                "\nSueldo: " + this.sueldo +
                "\nCod Admin: " + this.CodeAdmin + 
                "\nDependencia: " + this.dependencia + 
                "\nFecha Con: " + this.FechaCon;
    }
    
    
    
    
}
