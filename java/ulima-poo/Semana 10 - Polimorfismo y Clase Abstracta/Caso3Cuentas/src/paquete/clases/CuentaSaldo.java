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
public class CuentaSaldo extends Cuenta 
{
    //Atributos
    private String nomTrabajo;
    
    //Constructor
    public CuentaSaldo(String nomTrabajo, int nroCuenta, int dni, float saldo) 
    {
        super(nroCuenta, dni, saldo);
        this.nomTrabajo = nomTrabajo;
    }
    
    //Implement Method
    @Override
    public void Retirar(float monto) 
    {
        if (this.saldo>2000) 
        {
            this.comision = monto * 0.01f; 
        }
        this.saldo = this.saldo - (monto + this.comision);
    }
    
    //Override
    @Override
    public String VerInfo() {
        return super.VerInfo()+
                "\nnomTrabajo: " + this.nomTrabajo; 
    }
    
    
    
    
    
    
}
