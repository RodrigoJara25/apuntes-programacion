/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author Usuario
 */
public class Casa extends Inmueble
{
    //Atributos
    private float precioM2;
    private float mantenimiento;

    //Constructor
    public Casa(float precioM2, float area) 
    {
        super(area);
        this.precioM2 = precioM2;
    }
    
    //Getters and Setters
    public float getPrecioM2() {
        return precioM2;
    }

    public void setPrecioM2(float precioM2) {
        this.precioM2 = precioM2;
    }

    public float getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(float mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    
    //Override 
    @Override
    public String VerInfo() 
    {
        return super.VerInfo()+
                "\nPrecio m2: " + this.precioM2+
                "\nMantenimiento: " + this.mantenimiento; 
    }
    
    //Métodos
    public void CalcularPrecioCasa()
    {
        if (this.area>170) 
        {
            this.precioM2 = this.precioM2 * 1.07f;
        }
        this.precioFinal = this.precioM2 * this.area;
        this.mantenimiento = this.precioFinal*0.2f;
        this.precioFinal = this.precioFinal + this.mantenimiento;
        
        Inmueble.totalRecaudado = Inmueble.totalRecaudado + this.precioFinal;
        
    }
    
    
    
    
    
}
