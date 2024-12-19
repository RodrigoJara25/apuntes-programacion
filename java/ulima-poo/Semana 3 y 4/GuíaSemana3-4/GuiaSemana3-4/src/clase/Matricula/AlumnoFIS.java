/*
1. Caso de Negocio: Proyecto Gestionar Matricula.
La siguiente aplicación requiere crear una clase llamada AlumnoFIS, con los siguientes 
atributos: código del alumno, nombre del alumno, total de créditos matriculados, precio 
por crédito. Un constructor con parámetros, Métodos accesadores (getters) y modificadores (setters). 
Un método que calcule el monto total a pagar por el ciclo académico. Un método que retorne toda 
la información relacionada al alumno incluido el pago mensual si se sabe que el ciclo dura 4 meses.
 */

package clase.Matricula;

/**
 *
 * @author Usuario
 */
public class AlumnoFIS 
{
    //Atributos
    private int code;
    private String nombre;
    private int creditos;
    private float precio;
    
    //Método Constructor
    public AlumnoFIS(int code, String nombre, int creditos, float precio) 
    {
        this.code = code;
        this.nombre = nombre;
        this.creditos = creditos;
        this.precio = precio;
    }
    
    //Métodos Getters and Setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //Métodos
    public float TotalPagar(int pcreditos, float pprecio)
    {
        float total = pcreditos * pprecio * 4;
        return total;
    }
    
    public void VerInfo()
    {
        float total = TotalPagar(creditos, precio);
        System.out.println("Código: " + code + "\nNombre: " + nombre + "\nCréditos matriculados: " + creditos + "\nPrecio por crédito: " + precio + "\nPago mensual: " + total);
    }
    
}
