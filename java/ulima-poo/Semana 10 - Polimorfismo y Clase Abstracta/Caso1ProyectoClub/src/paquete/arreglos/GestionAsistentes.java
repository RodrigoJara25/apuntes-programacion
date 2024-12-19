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
public class GestionAsistentes 
{
    //Atributos
    private Persona[] arreglo;
    private int contador;
    
    //Constructor
    public GestionAsistentes() 
    {
        this.arreglo = new Persona[100];
        this.contador = 0;
    }
    
    //Métodos
    public void RegistrarAsistentes(Persona ref)
    {
        if (this.contador<this.arreglo.length) 
        {
            this.arreglo[contador] = ref;
            contador++;
        }
    }
    
    public void MontoFinalFacturado()
    {
        float montoFacturado=0;
        for (int i = 0; i < contador; i++) 
        {
            montoFacturado = montoFacturado + this.arreglo[i].getTotalPagar();
        }
        System.out.println("El monto final facturado es: " + montoFacturado);
    }
    
    public String MostrarInfo()
    {
        String cad = "";
        for (int i = 0; i < contador; i++) 
        {
            if (this.arreglo[i] instanceof Socio) 
            {
                cad = cad + "Socio\n" + this.arreglo[i].VerInfo() +"\n\n";
            }
            else if (this.arreglo[i] instanceof NoSocio) 
            {
                cad = cad + "No Socio\n" + this.arreglo[i].VerInfo() +"\n\n";
            }
        }
        return cad;
    }
    
}
