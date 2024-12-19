/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.de.abril;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DeAbril {

    
    public static void Code1(int n){
        int m = n*n;
        System.out.println("m = "+m);
    }
    public static void Code2(int n){
        int m = 0;
        for (int i = 0; i < n; i++) {
            m = m+n;
        }
        System.out.println("m = "+m);
    }
    public static void Code3(int n){
        int m = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m++;
            }
        }
        System.out.println("m = " + m);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = sc.nextInt();
        Code1(n);
        Code2(n);
        Code3(n);
    }
    
}
