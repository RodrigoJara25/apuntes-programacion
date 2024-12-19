/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import java.util.Scanner;
import paquete.clases.SerHumano;

/**
 *
 * @author Usuario
 */
public class prueba 
{
    public static void main(String[] args) 
    {
        //Importamos el paquete SerHumano (la clase creada anteriormente)
        SerHumano obj1 = new SerHumano("Ana","negros",20); //asi se crea un objeto de la clase SerHumano
        System.out.println(obj1.getNombre());
        obj1.setNombre("Juan"); //cambiamos de nombre
        System.out.println(obj1.getNombre());
        
        SerHumano obj2 = new SerHumano("Pedro","verdes",20);
        System.out.println(obj2.getNombre());
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre del ser humano: ");
        String nom = sc.nextLine();
        System.out.println("Ingrese color de ojos: ");
        String ojos = sc.nextLine();
        System.out.println("Ingrese edad: ");
        int edad = sc.nextInt();
        
        SerHumano obj3 = new SerHumano(nom, ojos, edad);
        System.out.println("Nombre 3: " + obj3.getNombre());
        
        SerHumano obj4 = new SerHumano();
        System.out.println(obj3.getNombre());
        
        System.out.println("Cantidad de objetos creados: " + SerHumano.cantObj);
        
        
    }
    
}
