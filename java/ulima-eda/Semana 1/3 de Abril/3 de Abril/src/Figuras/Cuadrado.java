/*
lado
acciones: calcularArea, calcularPerimetro
 */
package Figuras;

/**
 *
 * @author Usuario
 */
public class Cuadrado 
{
    //atributos
    private double lado;
    
    //Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
        this.lado = 1;
    } 
    
    //Getters and setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //Métodos
    public void calcularArea(double lado){
        double area = lado*lado;
        System.out.println("El área es "+area);
    }
    
    public void calcularPerimetro(double lado){
        double perimetro = lado*4;
        System.out.println("El perímetro es "+perimetro);
    }
}
