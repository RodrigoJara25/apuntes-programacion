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
public class VinoTinto extends Producto implements Reposo
{
    //Atributos
    private String temporada;
    private int diasReposo;
    
    //Constructor
    public VinoTinto(String temporada, String nomCom, int cantMili, String fechaFab) 
    {
        super(nomCom, cantMili, fechaFab);
        this.temporada = temporada;
    }
    
    
    //Gettsr and setters
    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    
    //Implementh Method
    @Override
    public void CalcularCostoTotal() 
    {
        Random rand = new Random();
        int cantKG;
        if ("Verano".equals(this.temporada)) 
        {
            cantKG = rand.nextInt(10000-5000+1)+5000;
            this.costoTotal = 2500 + cantKG*1.2f;
        }
        else if ("Invierno".equals(this.temporada)) 
        {
            cantKG = rand.nextInt(8000-4000+1)+4000;
            if (cantKG % 2 != 0) 
            {
                cantKG = cantKG + 1;
            }
            this.costoTotal = 2500 + cantKG*2.5f;
        }
    }
    
    //Interface
    @Override
    public void CalcularDiasReposo() 
    {
        this.diasReposo = (this.cantMili / 10) * 20;
    }
    
    
    
    
    
    
    
}
