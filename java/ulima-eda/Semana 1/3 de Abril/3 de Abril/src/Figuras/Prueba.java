/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        int lado = sc.nextInt();
        Cuadrado cuad1 = new Cuadrado(lado);
        cuad1.calcularArea(lado);
        cuad1.calcularPerimetro(lado);
    }
    
}
