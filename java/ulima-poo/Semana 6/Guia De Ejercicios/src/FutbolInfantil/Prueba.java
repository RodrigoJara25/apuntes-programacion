/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FutbolInfantil;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        EquipoDeFutbol obj1 = new EquipoDeFutbol("Alianza Lima");
        
        obj1.LlenarDatos();
        
        System.out.println(obj1.Rango());
        
        obj1.MayorMenorPeso();
        
        System.out.println(obj1.VerInfo());
        
        
        
        
    }
    
    
    
}
