/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalarioDeEmpleados;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        Empleados obj1 = new Empleados(20224280,40,100);
        Empleados obj2 = new Empleados(20224281,42,100);
        Empleados obj3 = new Empleados(20224282,46,100);
        
        obj1.HorasExtra();
        obj1.Salario(); //calcular salario
        
        obj2.HorasExtra();
        obj2.Salario(); //calcular salario
        
        obj3.HorasExtra();
        obj3.Salario(); //calcular salario
        
        GestionEmpleado ref1 = new GestionEmpleado();
        
        ref1.RegistroEmpleados(obj1);
        ref1.RegistroEmpleados(obj2);
        ref1.RegistroEmpleados(obj3);
        
        System.out.println(ref1.MostrarInfo());
        
        System.out.println(ref1.MayorSalario());
    }
    
}

