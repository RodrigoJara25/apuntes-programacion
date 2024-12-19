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
public class CDocenteNom extends CDocente 
{
    //Atributos
    private int resol;
    
    //Constructor
    public CDocenteNom(int resol, int codigo, int dpt, String nombre, String dire, String fechaNac) 
    {
        super(codigo, dpt, nombre, dire, fechaNac);
        this.resol = resol;
    }
    
    //Override
    @Override
    public String VerInfo() 
    {
        return super.VerInfo() + 
                "\nResolución: " + resol;
    }
    
    
}
