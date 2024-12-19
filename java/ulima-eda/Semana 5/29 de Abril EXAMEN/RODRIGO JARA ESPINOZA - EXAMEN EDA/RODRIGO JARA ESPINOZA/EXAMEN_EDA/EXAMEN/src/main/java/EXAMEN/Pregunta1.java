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
public class Pregunta1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        float suma =0;
        float nota_mayor = 0;
        float nota_menor = 1000000;
        
        int cont_aprobados=0;
        int cont_jalados=0;
        
        
        
        System.out.println("Ingresar nota: ");
        float nota = sc.nextFloat();
        while(nota!=-1){
            suma = suma + nota;
            cont++;
            if (nota >= nota_mayor) {
                nota_mayor = nota;
            }
            if (nota <= nota_menor) {
                nota_menor = nota;
            }
            if (nota>=10.5) {
                cont_aprobados++;
            }
            else{
                cont_jalados++;
            }
            System.out.println("Ingresar nota: ");
            nota = sc.nextFloat();
        }
        
        float promedio = suma/cont;
        
        System.out.println("Nota mayor: " + nota_mayor);
        System.out.println("Nota menor: " + nota_menor);
        System.out.println("Promedio: " + promedio);
        
        System.out.println("Aprobados: " + cont_aprobados);
        System.out.println("Desaprobados: " + cont_jalados);   
    }
}
