/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumRacional;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        NroRacional obj1 = new NroRacional(10,2);
        System.out.println(obj1.VerInfo());
        
        NroRacional obj2 = new NroRacional(20,3);
        obj1.suma(obj1);
        System.out.println("resultado de suma " + obj1.VerInfo());
    }
    
}
