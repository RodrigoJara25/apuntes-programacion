/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analisis;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Codigo 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        do 
        {
            System.out.println("Introduce un número mayor a 0: ");
            n = sc.nextInt();
        } while (n<=0);
        int potencia = 1;
        for (int i = 0; i < n; i++) 
        {
            potencia = potencia*2;
            System.out.println(potencia);
        }
    }
    
    
}
