/*
3. Caso de Negocio: Proyecto Ventana.
Crear una clase Círculo, una clase Cuadrado y una clase Prueba para hallar el área 
con color. Considerar que ambas ventanas tienen el mismo tamaño.
 */
package clase.Ventana;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese el radio de las ventanas: ");
        double radio = sc.nextDouble();
        Circulo ventana1 = new Circulo(radio);
        
        System.out.println("Ingrese la longitud del lado de la pared: ");
        double lado = sc.nextDouble();
        Cuadrado pared1 = new Cuadrado(lado);
        
        double AreaColor = pared1.AreaCuadrado(lado) - ventana1.AreaCirculo(radio);
        
        System.out.println("El área con color es de " + AreaColor + " m2");
    }
}
