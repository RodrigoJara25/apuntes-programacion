/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.clases;

/**
 *
 * @author Usuario
 */
public class Pollo 
{
    //Atributos
    private int pico;
    private int patas;
    private String color;
    
    //Metodo contructor
    public Pollo(int pico, int patas, String color)
    {
        this.pico = pico;
        this.patas = patas;
        this.color = color;
    }
    
    public Pollo()
    {
        this.pico = 2;
        this.patas = 3;
        this.color = "Verde";
    }
    
    //Metodos
    public int getPico() 
    {
        return pico;
    }
    public void setPico(int pico) 
    {
        this.pico = pico;
    }

    public int getPatas() 
    {
        return patas;
    }
    public void setPatas(int patas) 
    {
        this.patas = patas;
    }

    public String getColor() 
    {
        return color;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }
    
    public String VerInfo()
    {
        return "tienes " + this.patas + " patas\n" +
                "tienes " + this.pico + " picos\n" +
                "y es de color " + this.color ;
    }
    
    
    
}
