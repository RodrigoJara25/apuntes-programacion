/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.clases;
import java.lang.Math;
/**
 *
 * @author Usuario
 */
public class CCuadrado 
{
    //atributos
    private double aLado;
    public static int ContObj;
    public static double SumAreas;
    
    //métodos constructores
    public CCuadrado()
    {
        aLado=1;
        ContObj++;
    }
    
    public CCuadrado(double aLado)
    {
        this.aLado = aLado;
        ContObj++;
    }
    
    
    //metodos operaciones
    public double getaLado() 
    {
        return aLado;
    }

    public void setaLado(double aLado) 
    {
        this.aLado = aLado;
    }
    
    public double Area()
    {
        double area = Math.pow(aLado, 2);
        SumAreas = SumAreas + area;
        return area;
    }
    
    public double Perimetro()
    {
        return 4 * aLado;
    }
    
}
