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
public abstract class Cuenta 
{
    //Atributos
    protected int nroCuenta;
    protected int dni;
    protected float saldo;
    protected float comision;
    
    //Constructor
    public Cuenta(int nroCuenta, int dni, float saldo) 
    {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.comision = 0;
    }
    
    //Getters ans Setters
    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }
    
    //Métodos
    public void Depositar(Cuenta ref, float monto)
    {
        this.saldo = this.saldo - monto;
        ref.saldo = ref.saldo + monto;
    }
    
    public float getSaldo() 
    {
        return saldo;
    }
    
    public int getNroCuenta() 
    {
        return nroCuenta;
    }
    
    public String VerInfo()
    {
        return "Nro Cuenta: " + this.nroCuenta+
                "\nDNI: " + this.dni +
                "\nSaldo: " + this.saldo;
    }
    
    //Método abstracto
    public abstract void Retirar(float monto);
    
}
