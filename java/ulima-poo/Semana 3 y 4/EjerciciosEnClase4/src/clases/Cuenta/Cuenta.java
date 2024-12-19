/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Cuenta;

/**
 *
 * @author Usuario
 */
public class Cuenta 
{
    //ATRIBUTOS
    private int aNroCuenta;
    private int aDni;
    private double aSaldo;
    
    //MÉTODOS CONSTRUCTORES
    public Cuenta()
    {
        this.aNroCuenta=0;
        this.aDni=0;
        this.aSaldo=0;
    }
    
    public Cuenta(int NroCuenta, int Dni, double Saldo)
    {
        this.aNroCuenta = NroCuenta;
        this.aDni = Dni;
        if (Saldo>=0) 
        {
            this.aSaldo = Saldo;
        }
        else
        {
            this.aSaldo = 0;
        }
    }
    
    //MÉTODOS

    public int getaNroCuenta() 
    {
        return aNroCuenta;
    }

    public double getaSaldo() 
    {
        return aSaldo;
    }
    
    public void depositar(double monto)
    {
        if (monto > 0) 
        {
            aSaldo = aSaldo + monto; 
            System.out.println("El depósito ha sido realizado correctamente");
        }
        else
        {
            System.out.println("Ha ocurrido un error");
        }    
    }
    
    public void retirar(double monto)
    {
        if (monto >= 0 && monto <= aSaldo) 
        {
            aSaldo = aSaldo - monto;
            System.out.println("El retiro se ha realizado correctamente");
        }
        else if (monto < 0 )
        {
            System.out.println("Ha ocurrido un error");
        }
        else if (monto < aSaldo)
        {
            System.out.println("Saldo insuficiente");
        }    
    }
    
    public void transferencia (Cuenta ref, double monto) //"Cuenta": es para que me mande toda la info del objeto "ref" (NrCuneta, Saldo, Dni)
    {
         if (monto <= aSaldo) 
         {
             aSaldo = aSaldo - monto;
             
             ref.depositar(monto);
             
             System.out.println("Transferencia con éxito");  
         }
    }
    
    public void transferencia (Cuenta origen, Cuenta destino, double monto)
    {
        origen.transferencia(destino, monto);
    }
    
    
    public void VerInfo()
    {
        System.out.println("Nro de Cuenta: " + aNroCuenta);
        System.out.println("DNI: " + aDni);
        System.out.println("Saldo: " + aSaldo);
    }        
    
    
}
