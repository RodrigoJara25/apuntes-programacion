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
public class prueba 
{
    public static void main(String[] args) 
    {
        System.out.println("Primera cuenta:");
        
        Cuenta ctaA = new Cuenta(7854, 5222, 500); //creamos una cuenta (objeto)
        ctaA.VerInfo();
        
        ctaA.depositar(250.50);
        ctaA.VerInfo();
        
        ctaA.retirar(150.0);
        ctaA.VerInfo();
        
        System.out.println("Segunda cuenta:");
        
        Cuenta ctaB = new Cuenta(4280, 7195, 300); //Creamos una segunda cuenta (objeto)
        ctaB.VerInfo();
        
        System.out.println("Transferencia de cuentaA a cuentaB: ");
        
        ctaA.transferencia(ctaA, ctaB, 100);
        
        System.out.println("CuentaA: ");
        ctaA.VerInfo();
        
        System.out.println("CuentaB: ");
        ctaB.VerInfo();
    }
}
