/*
La clase Pollo tiene como variables de instancia: nombre, peso y tiempo en días.
Un constructor con parámetros y sus métodos getter y setter.
 */
package GestionGranja;

/**
 *
 * @author Usuario
 */
public class Pollo 
{
    //Atributos
    private String nombre;
    private float peso;
    private int tiempo;
    
    //Constructor
    public Pollo(String nombre, float peso, int tiempo) 
    {
        this.nombre = nombre;
        this.peso = peso;
        this.tiempo = tiempo;
    }
    
    //Getters and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }    
}
