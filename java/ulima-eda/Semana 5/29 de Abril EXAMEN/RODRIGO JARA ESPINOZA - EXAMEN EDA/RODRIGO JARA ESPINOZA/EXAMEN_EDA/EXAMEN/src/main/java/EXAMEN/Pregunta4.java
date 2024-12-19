/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;

import java.util.Scanner;

/**
 *
 * @author n04640
 */
public class Pregunta4 {
    
    public static void paresArray(int array[], int M){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i]*array[j]==M) {
                    System.out.println("Número1: "+array[i]+" | Número2: " +array[j]);
                    //System.out.println("Número2: "+ array[j]);
                }
            }
            for (int j = i+1; j < 6; j++) {
                if (array[i]*array[j]==M) {
                    System.out.println("Número1: "+array[i]+" | Número2: " +array[j]);
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int array[] = new int[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingresar arreglo: ");
            array[i] = sc.nextInt();
        }
        
        System.out.println("Ingresar número M: ");
        int M = sc.nextInt();
        
        System.out.println("-----------------");
        paresArray(array, M);
    }
}
