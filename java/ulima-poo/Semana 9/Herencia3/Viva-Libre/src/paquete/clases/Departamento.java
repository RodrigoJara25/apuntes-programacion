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
public class Departamento extends Inmueble
{
    //Atributos
    private float precioBase, impuesto, dscto;
    private int piso;

    //Constructor

    public Departamento(float precioBase, int piso, float area) 
    {
        super(area);
        this.precioBase = precioBase;
        this.piso = piso;
    }
    
    
    //Getters and Setters
    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public float getDscto() {
        return dscto;
    }

    public void setDscto(float dscto) {
        this.dscto = dscto;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    //Método Override
    @Override
    public String VerInfo() {
        return super.VerInfo() + 
                "\nPrecio Base: " + this.precioBase+
                "\nPiso: " + this.piso+
                "\nImpuesto: " + this.impuesto+
                "\nDscto: " + this.dscto;
    }
    
    //Método
    public void CalcularPrecioDepa()
    {
        if (this.area>170) 
        {
            this.precioBase = this.precioBase*1.15f;
        }
        this.impuesto = this.precioBase * 0.25f;       
        this.precioFinal = this.precioBase + this.impuesto;
        if (this.piso>=3) 
        {
            this.dscto = 0.07f * this.precioFinal;
            this.precioFinal = this.precioFinal - this.dscto;
        }
        
        Inmueble.totalRecaudado = Inmueble.totalRecaudado + this.precioFinal;
    }
    
    
    
    
}
