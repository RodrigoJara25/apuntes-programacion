/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcursoDeBelleza;

/**
 *
 * @author Usuario
 */
public class unDiaConcursando 
{
    public static void main(String[] args) 
    {
        ConcursoBelleza obj1 = new ConcursoBelleza();
        
        obj1.GenerarPuntaje();
        
        obj1.CalcularTotal();
        
        obj1.Ganadoras();
        
        System.out.println(obj1.Resultados());
        
        System.out.println(obj1.Ganadoras());
        
    }
    
}
