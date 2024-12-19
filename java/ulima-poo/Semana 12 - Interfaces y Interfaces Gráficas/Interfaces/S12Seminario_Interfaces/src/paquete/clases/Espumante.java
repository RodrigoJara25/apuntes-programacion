/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;
import paquete.SuperClase.Producto;

/**
 *
 * @author Usuario
 */
public class Espumante extends Producto
{
    public Espumante(String nomCom, int cantMili, String fechaFab) 
    {
        super(nomCom, cantMili, fechaFab);
    }

    //Implementh Method (abstracta)
    @Override
    public void CalcularCostoTotal() 
    {
        Random rand = new Random();
        this.costoTotal = 8000 + 3500*(rand.nextInt(20-10+1)+10);
    }
    
    
}
