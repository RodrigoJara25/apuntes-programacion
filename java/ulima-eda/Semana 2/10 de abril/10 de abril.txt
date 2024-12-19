/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Codes {
    public static long codigo1(long n) {
        return n * n;
    }
    
    public static long codigo2(long n) {
        long m = 0;
        for (int i=0; i<n; i++)
            m += n;
        return m;
    }
    
    public static long codigo3(long n) {
        long m = 0;
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++) {
                m++;
            }
        return m;
    }
    
    public static void main(String[] args) {
        long n = 1000;
        
        long inicio1 = System.nanoTime(); //System.currentTimeMillis();
        long m1 = codigo1(n);   // T(n) = 2
        long fin1 = System.nanoTime();
        System.out.println("Tiempo en ms Codigo1: " + (fin1 - inicio1));
        
        long inicio2 = System.nanoTime(); // System.currentTimeMillis();
        long m2 = codigo2(n);   // T(n) = 4n + 3
        long fin2 = System.nanoTime(); // System.currentTimeMillis();
        System.out.println("Tiempo en ms Codigo2: " + (fin2 - inicio2));
        
        long inicio3 = System.nanoTime(); //System.currentTimeMillis();
        long m3 = codigo3(n);   // T(n) = 3n^2 + 4n + 3
        long fin3 = System.nanoTime(); //System.currentTimeMillis();
        System.out.println("Tiempo en ms Codigo3: " + (fin3 - inicio3));
        
        System.out.println("Codigo 1: " + m1);
        System.out.println("Codigo 2: " + m2);
        System.out.println("Codigo 3: " + m3);
    }
}
