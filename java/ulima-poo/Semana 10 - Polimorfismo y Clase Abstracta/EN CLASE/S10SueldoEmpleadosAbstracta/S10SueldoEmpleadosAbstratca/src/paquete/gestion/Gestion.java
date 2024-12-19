/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import paquete.clases.*;

/**
 *
 * @author Usuario
 */
public class Gestion 
{
    //Atibutos
    private Empleado[] arregloEmpleados; //arreglo de todos los tipos de empleados
    private int contador;
    
    //Constructor
    public Gestion() 
    {
        this.arregloEmpleados = new Empleado[100];
        this.contador = 0;
    }
    
    //Getters and setters
    public Empleado[] getArregloEmpleados() {
        return arregloEmpleados;
    }

    public void setArregloEmpleados(Empleado[] arregloEmpleados) {
        this.arregloEmpleados = arregloEmpleados;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    //Métodos
    public void Ingresar(Empleado ref)
    {
         if (this.contador<this.arregloEmpleados.length) 
         {
             this.arregloEmpleados[this.contador] = ref;
             this.contador++;
         }
    }
    
    public String VerInfo()
    {
        //Si comparo valores en igualdad utilizo ==
        //Si comparo cadenas o caracteres en igualdad utilizo EqualsIgnoreCase
        //Si comparo objetos o instancias utilizo instanceof
        
        String cad = "";
        for (int i = 0; i < this.contador; i++) 
        {
            if (this.arregloEmpleados[i] instanceof Director) 
            {
                cad = cad + "Es Director \n";
            }
            else if (this.arregloEmpleados[i] instanceof Ejecutivo) 
            {
                cad = cad + "Es Ejecutivo \n";
            }
            else if (this.arregloEmpleados[i] instanceof Gerente) 
            {
                cad = cad + "Es Gerente \n";
            }
            
            cad = cad + this.arregloEmpleados[i].VerInfo() + "\n\n";
        }
        return cad;
    }
    
    //quiero saber cuál es el Ejecutivo con mayor cantidad de entradas
    public void EjecutivoMayorEntradaCine()
    {
        int mayor=0;
        for (int i = 0; i < this.contador; i++) 
        {
            if (this.arregloEmpleados[i] instanceof Ejecutivo) 
            {
                Ejecutivo aux = (Ejecutivo)this.arregloEmpleados[i];
                if (aux.getEntradasCinemar() > mayor) 
                {
                    mayor = aux.getEntradasCinemar();
                }
            }
        }
        for (int i = 0; i < this.contador; i++) 
        {
            if (this.arregloEmpleados[i] instanceof Ejecutivo) 
            {
                Ejecutivo aux = (Ejecutivo) this.arregloEmpleados[i];
                if (aux.getEntradasCinemar()==mayor) 
                {
                    System.out.println("Ejecutivo mayor entrada\n"+ aux.getNombre());
                }
            }
        }
    }
    
    public void EmpleadoSueldoTotalMayor()
    {
        float mayor=0;
        for (int i = 0; i < this.contador; i++) 
        {
            if (this.arregloEmpleados[i].getSueldoT()>mayor) 
            {
                mayor = this.arregloEmpleados[i].getSueldoT();
            }
        }
        for (int i = 0; i < this.contador; i++) 
        {
            if (this.arregloEmpleados[i].getSueldoT()==mayor) 
            {
                System.out.println("Empleado mayor sueldo total\n" + 
                        this.arregloEmpleados[i].VerInfo());
            }
        }
    }
}
