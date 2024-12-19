/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import paquete.clases.*;
import paquete.arreglos.*;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        CuentaMancomunada obj1 = new CuentaMancomunada(1111,3434,9778,10000);
        obj1.Retirar(4000);
        
        CuentaSaldo obj2 = new CuentaSaldo("Pizzeria",6767,9567,8000.5f);
        obj2.Depositar(obj1, 1200);
        
        RegistroCuentas refG = new RegistroCuentas();
        refG.RegistrarCuenta(obj1);
        refG.RegistrarCuenta(obj2);
        
        System.out.println(refG.MostrarInfo());
        
        refG.CalcularMontoComisiones();
    }
    
}
