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
public class Pregunta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de números N: ");
        int N = sc.nextInt();
        int num;
        float suma = 0;
        int cont_pares = 0;
        int cont_impares = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese número entre 0 y 100: ");
            num = sc.nextInt();
            suma = suma + num;
            if (num%2==0) {
                cont_pares++;
            }
            else{
                cont_impares++;
            }
            if (num<40) {
                cont1++;
            }
            else if (num>=40 && num<80) {
                cont2++;
            }
            else{
                cont3++;
            }
        }
        float promedio = suma/N;
        
        System.out.println("Promedio: " + promedio);
        System.out.println("Pares: " + cont_pares);
        System.out.println("Impares: " + cont_impares);
        System.out.println("Numeros <40: " + cont1);
        System.out.println("Numeros >=40 y <80: "+cont2);
        System.out.println("Numeros >=80: "+cont3);
    }
}
