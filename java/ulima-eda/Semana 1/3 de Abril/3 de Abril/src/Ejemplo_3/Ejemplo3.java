/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejemplo3 {
    
    public static int MayorNum(int n){
        Scanner sc = new Scanner(System.in);
        int mayor = -1;
        System.out.println("Ingrese números: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= mayor) {
                mayor = num;
            }
        }
        return mayor;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de números: ");
        int n = sc.nextInt();
        int mayor = MayorNum(n);
        System.out.println("El número mayor es: " + mayor);
    }
}
