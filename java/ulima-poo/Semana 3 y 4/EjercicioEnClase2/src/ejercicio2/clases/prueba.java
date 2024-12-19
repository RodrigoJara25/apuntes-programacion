/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.clases;
import java.lang.Math;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class prueba 
{
    public static void main(String[] args) 
    {
        CCuadrado obj1 = new CCuadrado();
        
        System.out.println("Lado: " + obj1.getaLado());
        System.out.println("área: " + obj1.Area());
        System.out.println("Perímetro: " + obj1.Perimetro());
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese la longitud de un lado del cuadrado: ");
        double aLado = sc.nextDouble();
        
        CCuadrado obj2 = new CCuadrado(aLado);
        
        System.out.println("Lado: " + obj2.getaLado());
        System.out.println("Area: " + obj2.Area());
        System.out.println("Perimetro: " + obj2.Perimetro());
        
        System.out.println("Cantidad de objetos creados: " + CCuadrado.ContObj);
        System.out.println("Suma de áreas: " + CCuadrado.SumAreas);
    }
    
}
