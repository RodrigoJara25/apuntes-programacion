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
public class CuentaMancomunada extends Cuenta
{
    //Atributos
    private int dni2;
    
    //Constructor
    public CuentaMancomunada(int dni2, int nroCuenta, int dni, float saldo) 
    {
        super(nroCuenta, dni, saldo);
        this.dni2 = dni2;
    }
    
    //Implement Method
    @Override
    public void Retirar(float monto) 
    {
        if (this.saldo - (monto + monto*0.02f)<= this.saldo) 
        {
            this.comision = monto*0.02f;
            this.saldo = this.saldo - (monto + this.comision);
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }
    }
    
    //Override
    @Override
    public String VerInfo() {
        return super.VerInfo()+
                "\nDNI 2: " + this.dni2;
    }
    
    
    
    
    
    
    
}
