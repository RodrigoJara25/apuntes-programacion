package paquete.arreglos;


import paquete.clases.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class RegistroCuentas 
{
    //Atributos
    private Cuenta[] arreglo;
    private int contador;
    
    //Constructor
    public RegistroCuentas() 
    {
        this.arreglo = new Cuenta[100];
        this.contador = 0;
    }
    
    //Método
    public void RegistrarCuenta(Cuenta ref)
    {
        if (contador<arreglo.length) 
            {
                this.arreglo[contador] = ref;
                contador++;
            }
    }
    
    public String MostrarInfo()
    {
        String cad = "";
        for (int i = 0; i < contador; i++) 
        {
            if (this.arreglo[i] instanceof CuentaMancomunada) 
            {
                cad = cad + "\nCuenta Mancomunada\n" + this.arreglo[i].VerInfo() + "\n\n";
            }
            else if (this.arreglo[i] instanceof CuentaSaldo) 
            {
                cad = cad + "\nCuenta Saldo\n" + this.arreglo[i].VerInfo() + "\n\n";
            }
        }
        return cad;
    }
    
    public void CalcularMontoComisiones()
    {
        float comisionesT = 0;
        for (int i = 0; i < contador; i++) 
        {
            comisionesT = comisionesT + this.arreglo[i].getComision();
        }
        System.out.println("El monto total por comisiones es " + comisionesT);
    }
}

