/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author Usuario
 */
public abstract class Persona 
{
    //Atributos
    protected String nombre;
    protected int dni;
    protected float totalConsumido;
    protected float totalPagar;
    protected String medioPago;
    //protected static float montoFacturadoFinal;
    
    //Constrcutor
    public Persona(String nombre, int dni, float totalConsumido, String medioPago) {
        this.nombre = nombre;
        this.dni = dni;
        this.totalConsumido = totalConsumido;
        this.medioPago = medioPago;
    }
    
    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public float getTotalConsumido() {
        return totalConsumido;
    }

    public void setTotalConsumido(float totalConsumido) {
        this.totalConsumido = totalConsumido;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    
    //Método Abstracto
    public abstract void CalcularTotalPagar();
    
    //Métodos
    public String VerInfo()
    {
        return "Nombre: " + this.nombre +
                "\nDNI: " + this.dni + 
                "\nMonto consumido: " + this.totalConsumido +
                "\nMedio de pago: " + this.medioPago;
    }
}
