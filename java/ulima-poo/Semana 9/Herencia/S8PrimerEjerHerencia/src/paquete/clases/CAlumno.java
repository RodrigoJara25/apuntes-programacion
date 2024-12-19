/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author Evento
 */
public class CAlumno extends CPersona
{
    private int codAlum;
    private String carrProf;

    public CAlumno(String carrProf, String nombre, String direccion, String fechaNac) 
    {
        super(nombre, direccion, fechaNac);
        this.carrProf = carrProf;
    }

    public int getCodAlum() {
        return codAlum;
    }

    public void setCodAlum(int codAlum) {
        this.codAlum = codAlum;
    }

    public String getCarrProf() {
        return carrProf;
    }

    public void setCarrProf(String carrProf) {
        this.carrProf = carrProf;
    }
    
    //Métodos
    public void GenerarCodigo()
    {
        Random rand = new Random();
        this.codAlum = rand.nextInt(500-300+1)+300;
        this.peso = 25;
    }

    //Override method (sobreescribir un método de la SuperClase)
    @Override
    public String VerInfo() 
    {
        return super.VerInfo() + 
                "\nCódigo de alumno: " + this.codAlum +
                "\nCarrera: " + this.carrProf; 
    }
    
    
    
}
