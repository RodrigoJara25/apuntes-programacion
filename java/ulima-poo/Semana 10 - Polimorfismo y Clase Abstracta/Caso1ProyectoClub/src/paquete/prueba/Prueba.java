/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import paquete.arreglos.*;
import paquete.clases.*;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        Socio obj1 = new Socio(344, 5, "Rodrigo", 2222, 1890, "Tarjeta");
        Socio obj3 = new Socio(331, 11, "Dina", 4422, 1500, "Efectivo");
        obj1.CalcularTotalPagar();
        obj3.CalcularTotalPagar();
        
        NoSocio obj2 = new NoSocio(4, "Gerson", 2233, 1566.5f, "Efectivo");
        obj2.CalcularTotalPagar();
        
        
        GestionAsistentes refG = new GestionAsistentes();
        refG.RegistrarAsistentes(obj1);
        refG.RegistrarAsistentes(obj2);
        refG.RegistrarAsistentes(obj3);
        
        System.out.println(refG.MostrarInfo());
        refG.MontoFinalFacturado();
        
    }
    
}
