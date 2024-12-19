/*
3. Caso de Negocio: Proyecto Ventana.
Crear una clase Círculo, una clase Cuadrado y una clase Prueba para hallar el área 
con color. Considerar que ambas ventanas tienen el mismo tamaño.
 */
package clase.Ventana;
import java.lang.Math;

/**
 *
 * @author Usuario
 */
public class Circulo 
{
    private double radio;

    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double AreaCirculo(double radio)
    {
        double vol = 3.1415* Math.pow(radio, 2);
        return vol;
    }
}
