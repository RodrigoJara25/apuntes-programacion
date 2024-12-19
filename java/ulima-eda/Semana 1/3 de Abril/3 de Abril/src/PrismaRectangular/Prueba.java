/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrismaRectangular;

/**
 *
 * @author Usuario
 */
public class Prueba {
    public static void main(String[] args) {
        PrismaRectangular prisma1 = new PrismaRectangular(3,4,5);
        System.out.println("área prisma: " + prisma1.calcularArea());
	System.out.println("perímetro prisma: " + prisma1.calcularPerimetro());
    }
}
