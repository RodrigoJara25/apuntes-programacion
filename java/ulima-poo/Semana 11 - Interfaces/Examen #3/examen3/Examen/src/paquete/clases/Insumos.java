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
public class Insumos extends Producto 
{
    //Atributos
    private int diasMantenimiento;
    private String perecible;
    
    //Constructor
    public Insumos(String perecible, int code, String nombre, float costo) 
    {
        super(code, nombre, costo);
        this.perecible = perecible;
    }
    
    //Getters and setters
    public int getDiasMantenimiento() {
        return diasMantenimiento;
    }

    public void setDiasMantenimiento(int diasMantenimiento) {
        this.diasMantenimiento = diasMantenimiento;
    }

    public String getPerecible() {
        return perecible;
    }

    public void setPerecible(String perecible) {
        this.perecible = perecible;
    }
    
    //Implement Method
    @Override
    public void CalcularStock() 
    {
        Random rand = new Random();
        int num;
        int suma = 0;
        
        for (int i = 0; i < 2; i++) 
        {
            do 
            {
                num = rand.nextInt(360-130+1)+130;
            } while (EsImpar(num)==false);
            suma = suma + num;
        }
        this.stock = suma;
    }
    
    //FuncionEsImpar
    private boolean EsImpar(int num)
    {
        if (num%2==0) 
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    //Métodos
    public void CalcularDiasManteniiento()
    {
        Random rand = new Random();
        int num;
        do 
        {
            num = rand.nextInt(360-130+1)+130;
        } while (EsImpar(num)==false);
        this.diasMantenimiento = num;
    }
    
    //Override
    @Override
    public String VerInfo() 
    {
        return super.VerInfo()+
                "\nDias de mantenimiento: " + this.diasMantenimiento+
                "\nPerecible: " + this.perecible; 
    }
    
    
    
    
}
