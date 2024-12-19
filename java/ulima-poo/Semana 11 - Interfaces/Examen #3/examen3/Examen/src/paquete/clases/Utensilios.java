/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author o22234
 */
public class Utensilios extends Producto 
{
    //Atributos
    private String fechaFabri;
    
    //Constructor
    public Utensilios(String fechaFabri, int code, String nombre, float costo) 
    {
        super(code, nombre, costo);
        this.fechaFabri = fechaFabri;
    }
    
    //Getters and setters
    public String getFechaFabri() {
        return fechaFabri;
    }

    public void setFechaFabri(String fechaFabri) {
        this.fechaFabri = fechaFabri;
    }

    //Implement Method
    @Override
    public void CalcularStock() 
    {
        Random rand = new Random();
        int num;
        do 
        {
            num = rand.nextInt(360-130+1)+130;
        } while (EsPar(num)==false);
        this.stock = num;
    }
    
    //Función EsPar
    private boolean EsPar(int num)
    {
        if (num%2==0) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //Override
    @Override
    public String VerInfo() 
    {
        return super.VerInfo()+
                "\nFecha de Fabricación: " + this.fechaFabri; 
    }
    
    
    
    
    
    
}
