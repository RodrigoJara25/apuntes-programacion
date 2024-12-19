/*
2. Caso de Negocio: Proyecto Pelota.
Diseñe la clase Pelota y la clase Prueba, que permitan calcular el volumen y determinar 
si la pelota es de niño o niña. El criterio es el siguiente: Si el color es rosado es de 
niña, caso contrario es de niño.
 */
package clase.Pelota;

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
        
        System.out.println("Ingresar el radio de la pelota: ");
        double radio = sc.nextDouble();
        
        System.out.println("Ingrese el color de la pelota: ");
        String color = sc.next();
        
        Pelota obj1 = new Pelota(radio, color);
        
        obj1.VerInfo();
    }
    
}
