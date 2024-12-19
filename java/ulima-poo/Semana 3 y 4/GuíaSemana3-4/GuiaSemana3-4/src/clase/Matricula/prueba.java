/*
1. Caso de Negocio: Proyecto Gestionar Matricula.
La siguiente aplicación requiere crear una clase llamada AlumnoFIS, con los siguientes 
atributos: código del alumno, nombre del alumno, total de créditos matriculados, precio 
por crédito. Un constructor con parámetros, Métodos accesadores (getters) y modificadores (setters). 
Un método que calcule el monto total a pagar por el ciclo académico. Un método que retorne toda 
la información relacionada al alumno incluido el pago mensual si se sabe que el ciclo dura 4 meses.
 */
package clase.Matricula;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class prueba 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese código del alumno: ");
        int code = sc.nextInt();
        
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = sc.next();
        
        System.out.println("Total de créditos matriculados: ");
        int creditos = sc.nextInt();
        
        System.out.println("Precio por crédito: ");
        float precio = sc.nextFloat();
        
        AlumnoFIS obj1 = new AlumnoFIS(code, nombre, creditos, precio);
        
        obj1.VerInfo();
        
        
    }
    
}
