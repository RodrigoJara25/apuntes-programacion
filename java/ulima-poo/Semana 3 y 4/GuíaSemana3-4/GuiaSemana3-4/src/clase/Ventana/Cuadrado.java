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
public class Cuadrado 
{
    private double lado;

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double AreaCuadrado(double lado)
    {
        double Vol = Math.pow(lado, 2);
        return Vol;
    }
}
