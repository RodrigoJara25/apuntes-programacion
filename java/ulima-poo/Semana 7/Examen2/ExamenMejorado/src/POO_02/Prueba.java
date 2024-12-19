/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del administrador: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese el apellido del administrador: ");
        String apellido = sc.next();
        
        System.out.println("Ingrese la edad del administrador: ");
        int edad = sc.nextInt();
        
        sc.nextLine();
        
        Administrador admin1 = new Administrador(nombre, apellido, edad);
        
        System.out.println("Ingrese el codigo de la sucursal: ");
        String code = sc.nextLine();
        
        System.out.println("Ingrese el número de empleados de la sucursal: ");
        int empleados = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Ingrese la ciudad de la sucursal: ");
        String ciudad = sc.nextLine();
        
        MiNoticia sucursal1 = new MiNoticia(code, empleados, ciudad, admin1);
        
        sucursal1.nroTipoLibros();
        sucursal1.LlenarMatriz();
        sucursal1.MayorPuntoVenta();
        
        System.out.println(sucursal1.MostrarInfo());
    }
    
}
