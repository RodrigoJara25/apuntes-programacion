/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class prueba 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        Pollo obj1 = new Pollo();
        
        System.out.println(obj1.VerInfo());
        
        System.out.println("Ingresar cantidad de picos: ");
        int pico = sc.nextInt();
        
        System.out.println("Ingresar cantidad de patas: ");
        int patas = sc.nextInt();
        
        System.out.println("Ingresar color: ");
  
        String color = sc.next();
        
        Pollo obj2 = new Pollo(pico, patas, color);
        
        System.out.println("El animal tiene las siguientes caracteristicas: ");
        System.out.println("Patas: " + obj2.getPatas());
        System.out.println("Picos: " + obj2.getPico());
        System.out.println("Color: " + obj2.getColor());
        
       
    }
}
