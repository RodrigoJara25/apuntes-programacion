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
public class PrismaRectangular {
    //Atributos
    int a;
    int b;
    int c;
    
    //Constructor
    public PrismaRectangular(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //MGetters and setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    //Métodos
    public double calcularArea(){
        return (a + b) * c + 2 * a * b;
    }
    
    public double calcularPerimetro(){
        return (a*4) + (a*4) + (b*4);
    }
    
}
