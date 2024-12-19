/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Definiciones;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        int edad[][] = new int[4][3]; //los arreglos son de un tipo específico (ejem. solo enteros. Va a tener 10 elementos.
        
        //edad[0]=20; //en la posición 0, el valor será 20.
        
        Random rand = new Random();
        
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                edad[i][j] = 20 + rand.nextInt(11);  //aleatroios entre 20 y 30
            }
        }
/*        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.println(edad[i][j]);
            }
        }
*/        
        for (int i = 0; i < 4; i++) 
        {
            String cad = "";
            for (int j = 0; j < 3; j++) 
            {
                cad = cad + edad[i][j]+"\t";
            }
            System.out.println(cad);
        }
        
        
    }
}
