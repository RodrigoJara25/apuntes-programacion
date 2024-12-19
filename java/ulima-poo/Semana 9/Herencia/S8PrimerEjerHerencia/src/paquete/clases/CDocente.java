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
public class CDocente extends CPersona
{
    private int CodeDocente;
    private String dptoAcadec;
    private String FechaNombra;
    private int TpoServ;
    
    //Constructor
    public CDocente(int CodeDocente, String dptoAcadec, String FechaNombra, String nombre, String direccion, String fechaNac) 
    {
        super(nombre, direccion, fechaNac);
        this.CodeDocente = CodeDocente;
        this.dptoAcadec = dptoAcadec;
        this.FechaNombra = FechaNombra;
    }
    
    //Getters and Setters
    public int getCodeDocente() {
        return CodeDocente;
    }

    public void setCodeDocente(int CodeDocente) {
        this.CodeDocente = CodeDocente;
    }

    public String getDptoAcadec() {
        return dptoAcadec;
    }

    public void setDptoAcadec(String dptoAcadec) {
        this.dptoAcadec = dptoAcadec;
    }

    public String getFechaNombra() {
        return FechaNombra;
    }

    public void setFechaNombra(String FechaNombra) {
        this.FechaNombra = FechaNombra;
    }
    
    //Métodos
    public void TiempoServicio()
    {
        Random rand = new Random();
        this.TpoServ = rand.nextInt(15-5+1)+5;
    }
    
    //Override
    @Override
    public String VerInfo() 
    {
        return super.VerInfo() + 
                "\nDepartamente Académico: " + this.dptoAcadec +
                "\nFecha de nombramiento: " + this.fechaNac + 
                "\nTiempo de Servicio: " + this.TpoServ; 
    }
    
    
    
    
    
    
    
}
