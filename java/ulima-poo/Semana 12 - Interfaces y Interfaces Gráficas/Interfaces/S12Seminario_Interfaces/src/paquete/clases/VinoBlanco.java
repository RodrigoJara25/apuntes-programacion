/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;
import paquete.SuperClase.Producto;
import paquete.interfaces.Reposo;

/**
 *
 * @author Usuario
 */
public class VinoBlanco extends Producto implements Reposo 
{
    //Atributos
    private int diasReposo;
    
    //Constructor
    public VinoBlanco(String nomCom, int cantMili, String fechaFab) 
    {
        super(nomCom, cantMili, fechaFab);
    }
    
    //Getters and setters
    public int getDiasReposo() {
        return diasReposo;
    }

    public void setDiasReposo(int diasReposo) {
        this.diasReposo = diasReposo;
    }
    
    //Implementh Method (abtratcto)
    @Override
    public void CalcularCostoTotal() 
    {
        Random rand = new Random();
        int aux = rand.nextInt(15-5+1)+5;
        float suma=1;
        for (int i = 1; i <= aux; i++) 
        {
            float calc = (float) Math.pow(aux, i);
            suma = suma + calc/i;
        }
        this.costoTotal = suma;
    }

    //Implementh Method (interface)
    @Override
    public void CalcularDiasReposo() 
    {
        Random rand = new Random();
        this.diasReposo = rand.nextInt(250-150+1)+150;
    }
    
    
    
    
}
