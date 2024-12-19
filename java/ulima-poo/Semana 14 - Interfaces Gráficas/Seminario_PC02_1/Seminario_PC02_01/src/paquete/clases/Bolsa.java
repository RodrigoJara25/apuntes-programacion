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
public class Bolsa extends Producto implements Tiempo
{
    //Atributos
    private int tiempoPermanencia;
    private Asesor ref;
    
    //Constructor
    public Bolsa(Asesor ref, String code, String descripcion) 
    {
        super(code, descripcion);
        this.ref = ref;
    }
    
    //Getters and setters
    public int getTiempoPermanencia() {
        return tiempoPermanencia;
    }

    public void setTiempoPermanencia(int tiempoPermanencia) {
        this.tiempoPermanencia = tiempoPermanencia;
    }
    
    public Asesor getRef() {
        return ref;
    }

    public void setRef(Asesor ref) {
        this.ref = ref;
    }
    
    //Implement Method
    @Override
    public void CalcularMontoMAX() 
    {
        Random rand = new Random();

        this.montoMAX = rand.nextInt(118000-112000+1)+112000;
    }

    @Override
    public void CalcularTiempoMinimoPermanencia() 
    {
        Random rand = new Random();
        
        this.tiempoPermanencia = rand.nextInt(8-5+1)+5;
    }
}
