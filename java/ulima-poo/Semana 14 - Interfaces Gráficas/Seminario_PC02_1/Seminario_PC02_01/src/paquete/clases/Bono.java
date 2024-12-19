/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;
import paquete.interfaz.*;

/**
 *
 * @author Usuario
 */
public class Bono extends Producto implements Tiempo
{
    //Atributo
    private int tiempoPermanencia;
    
    //Constructor
    public Bono(String code, String descripcion) 
    {
        super(code, descripcion);
    }
    
    //Getters and setters
    public int getTiempoPermanencia() {
        return tiempoPermanencia;
    }

    public void setTiempoPermanencia(int tiempoPermanencia) {
        this.tiempoPermanencia = tiempoPermanencia;
    }
    
    //Implementh Method 
    @Override
    public void CalcularMontoMAX() 
    {
        Random rand = new Random();
        
        int cont = 0;
        int suma = 0;
        int num;
        while(cont<2)
        {
            num = rand.nextInt(83000-80000+1)+80000;
            if (num%2==0) 
            {
                suma = suma + num;
                cont++;
            }
        }
        this.montoMAX = suma;
    }

    @Override
    public void CalcularTiempoMinimoPermanencia() 
    {
        Random rand = new Random();

        this.tiempoPermanencia = rand.nextInt(8-4+1)+4;
        while(this.tiempoPermanencia%2==0)
        {
            this.tiempoPermanencia = rand.nextInt(8-4+1)+4;
        }
    }
    
    //Funcion 
    
    
    
    
    
    
}
