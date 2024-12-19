/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.arreglos;

import paquete.clases.*;

/**
 *
 * @author Usuario
 */
public class GestionarLibros 
{
    //Atributos
    private Libro[] arreglo;
    private int contador;
    
    //Constructor
    public GestionarLibros() 
    {
        this.arreglo = new Libro[100];
        this.contador = 0;
    }
    
    //Métodos
    public void RegistrarLibros(Libro ref)
    {
        if (contador < arreglo.length) 
        {
            arreglo[contador] = ref;
            contador++;
        }
    }
    
    
    
    
}
