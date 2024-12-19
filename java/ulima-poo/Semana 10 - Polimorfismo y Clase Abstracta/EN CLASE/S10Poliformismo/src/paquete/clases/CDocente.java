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
public class CDocente extends  CPersona
{
    //Atributos
    protected int codigo, dpt;
    
    //Constructor
    public CDocente(int codigo, int dpt, String nombre, String dire, String fechaNac) 
    {
        super(nombre, dire, fechaNac);
        this.codigo = codigo;
        this.dpt = dpt;
    }

    //Override (se llame igual, tenga el mismo retorno y mismos parámetros)
    @Override
    public String VerInfo() 
    {
        return super.VerInfo()+
                "\nCodigo: " + codigo +
                "\nDepartamento: " + dpt;
    }
    
    
}
