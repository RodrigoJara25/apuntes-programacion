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
public class Socio extends Persona
{
    //Atributos
    private int codigo;
    private int añosAntiguedad;
    
    //Constructor
    public Socio(int codigo, int añosAntiguedad, String nombre, int dni, float totalConsumido, String medioPago) 
    {
        super(nombre, dni, totalConsumido, medioPago);
        this.codigo = codigo;
        this.añosAntiguedad = añosAntiguedad;
    }
    
    //Getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    //Implement Method
    @Override
    public void CalcularTotalPagar() 
    {
        if (this.añosAntiguedad<=5) 
        {
            this.totalPagar = this.totalConsumido * 0.4f;
        }
        else if (this.añosAntiguedad<=10) 
        {
            this.totalPagar = this.totalConsumido * 0.3f;
        }
        else
        {
            this.totalPagar = this.totalConsumido * 0.2f;
        }
        
    }
    
    //Override
    @Override
    public String VerInfo() {
        return super.VerInfo() +
                "\nCódigo: " + this.codigo + 
                "\nAños de antiguedad: " +this.añosAntiguedad+
                "\nTotal a pagar: " + this.totalPagar;
    }
}
