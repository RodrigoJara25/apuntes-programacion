/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotasInstituciónEducativa;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        NotasInstitucionEducativa obj1 = new NotasInstitucionEducativa();
        
        obj1.GenerarNotas();
        
        obj1.CalcularPromedio();
        
        obj1.PromedioMayorMenor();
        
        System.out.println(obj1.VerInfo());
    }
    
}
