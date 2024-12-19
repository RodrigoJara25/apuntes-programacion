/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import paquete.clases.*; //importar todas las clases del paquete clases

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        CPersona refP = new CPersona("nombre","direc1","fecha01");
        refP.CalcularEdad();
        System.out.println(refP.VerInfo());
        
        System.out.println("\n");
        
        CAlumno refA = new CAlumno("Carrera Prof","nombre1","direc2","fecha02");
        refA.CalcularEdad();
        refA.GenerarCodigo();
        System.out.println(refA.VerInfo());
        
        System.out.println("\n");
        
        CDocente refD = new CDocente(20224280,"Sistemas","23/09","nombre2","direc3","fecha03");
        refD.CalcularEdad();
        refD.TiempoServicio();
        System.out.println(refD.VerInfo());
        
        System.out.println("\n");
        
        
        
    }
    
}
