/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosObjetos1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        Persona obj1 = new Persona(1544, "Luis", "Direc1","tele1");
        Persona obj2 = new Persona(6574, "Ana", "Direc2","tele2");
        Persona obj3 = new Persona(9177, "Patty", "Direc3","tele3");
        
        RegistroPersona registro1 = new RegistroPersona();  //creo una lista de objetos llamada "registro1"
        
        registro1.IngresarPersona(obj1);
        registro1.IngresarPersona(obj2);
        registro1.IngresarPersona(obj3);
        
        System.out.println(registro1.VerInfo());
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el DNI que desea buscar: ");
        int dni = sc.nextInt();
        
        registro1.Ubicar(dni);
        
    }
    
    
}
