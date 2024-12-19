/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploenclase;

/**
 *
 * @author Usuario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Alumno obj1 = new Alumno();
        obj1.setCodigo(1555);
        System.out.println("Valor de código: " + obj1.getCodigo());
        
        Alumno obj2 = new Alumno(4280,"Rodrigo", 19);
        System.out.println(obj2.getNombre());
    }
    
}
