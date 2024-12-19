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
public class LibroElectronico extends Libro
{
    //Atributos
    private String formatoDigital;
    private int numPaginas;
    
    //Constructor
    public LibroElectronico(String formatoDigital, int numPaginas, String titulo, float precio, Autor autor) 
    {
        super(titulo, precio, autor);
        this.formatoDigital = formatoDigital;
        this.numPaginas = numPaginas;
    }
    
    //Getters and setter
    public String getFormatoDigital() {
        return formatoDigital;
    }

    public void setFormatoDigital(String formatoDigital) {
        this.formatoDigital = formatoDigital;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    //Implement Method
    @Override
    public void CalcularPrecioVenta() 
    {
        if (this.formatoDigital.equalsIgnoreCase("PDF")) 
        {
            this.precioVenta = this.precioUnit + this.precioUnit*0.18f + this.numPaginas*0.1f;
        }
        else if (this.formatoDigital.equalsIgnoreCase("kindle")) 
        {
            this.precioVenta = this.precioUnit + this.precioUnit*0.18f + this.numPaginas*0.5f;
        }
    }
    
    //Override
    @Override
    public String VerInfo() {
        return super.VerInfo() +
                "\nFormato: " + this.formatoDigital+
                "\nNúmero de páginas: " + this.numPaginas +
                "\nPrecio de Venta: " + this.precioVenta; 
    }
    
    
    
    
    
}
