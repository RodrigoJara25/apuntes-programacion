/*
2. Caso de Negocio: Proyecto Pelota.
Diseñe la clase Pelota y la clase Prueba, que permitan calcular el volumen y determinar 
si la pelota es de niño o niña. El criterio es el siguiente: Si el color es rosado es de 
niña, caso contrario es de niño.
 */
package clase.Pelota;
import java.lang.Math;

/**
 *
 * @author Usuario
 */
public class Pelota 
{
    //Atributos
    private double radio;
    private String color;
    
    //Método Constructor
    public Pelota(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    
    //Método Getters and Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Méotodos
    public double Volumen(double pradio)
    {
        double vol = 4 * pradio * pradio * pradio / 3 * 3.1415;
        return vol;
    }
    
    public void Sexo(String pcolor)
    {
        if ("rosado".equals(pcolor) || "rosado".equals(pcolor)) 
        {
            System.out.println("La pelota es de niña");
        }
        else
        {
            System.out.println("La pelota es de niño");
        }
    }
    
    public void VerInfo()
    {
        //double volumen = Volumen(radio);
        System.out.println("El volumen de la pelota es " + Volumen(radio));
        Sexo(color);
    }
}
