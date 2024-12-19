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
public class GestionEmpleado 
{
    //Atributos
    private Empleados[] listaEmpleados;
    private int cant_obj;
    
    //Constructor
    public GestionEmpleado() 
    {
        this.listaEmpleados = new Empleados[10];
        this.cant_obj = 0;
    }
    //Getters and setters
    public Empleados[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Empleados[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public int getCant_obj() {
        return cant_obj;
    }

    public void setCant_obj(int cant_obj) {
        this.cant_obj = cant_obj;
    }
    
    //Métodos
    public void RegistroEmpleados(Empleados obj1)
    {
        if (this.cant_obj<this.listaEmpleados.length) 
        {
            this.listaEmpleados[this.cant_obj]=obj1;
            this.cant_obj = this.cant_obj + 1;
        }
        else
        {
            System.out.println("No hay más espacio disponible");
        }
    }
    
    public String MayorSalario()
    {
        float mayor=0;
        String cad = "";
        for (int i = 0; i < this.cant_obj; i++) 
        {
            if (this.listaEmpleados[i].getSalario()>mayor) 
            {
                mayor = this.listaEmpleados[i].getSalario();
            }
        }
        for (int i = 0; i < this.cant_obj; i++) 
        {
            if (this.listaEmpleados[i].getSalario()==mayor) 
            {
                cad = cad + "El empleado con el mayor salario es: \n" + this.listaEmpleados[i].VerInfo() + "\n";
            }
        }
        return cad;
    }
    
    public String MostrarInfo()
    {
        String cad = "";
        for (int i = 0; i < this.cant_obj; i++) 
        {
            cad = cad + "Empleado "+ (i+1)+"\n" +this.listaEmpleados[i].VerInfo()+ "\n"+"\n";
        }
        return cad;
    }
}
