/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author o22234
 */
public class GestionCelulares 
{
    //Atributos
    private Celular[] arreglo;
    private int contador;
    
    //Constructor
    public GestionCelulares() 
    {
        this.arreglo = new Celular[250];
        this.contador = 0;
    }
    
    //Método
    public void IngresarCelular(Celular ref)
    {
        if (this.contador<this.arreglo.length) 
        {
            if (ref.getMemoria()>30) 
            {
                System.out.println("Cuidado, poca memoria");
                this.arreglo[contador]=ref;
                contador++;
            }
            else
            {
                this.arreglo[contador]=ref;
                contador++;
            }
        }
    }
    
    public String CalcularPomedioAplicaciones()
    {
        float promedio;
        int suma = 0;
        for (int i = 0; i < this.contador; i++) 
        {
            suma = suma + this.arreglo[i].getApps();
        }
        promedio = suma / this.contador;
        
        int arriba=0;
        int abajo=0;
        for (int i = 0; i < this.contador; i++) 
        {
            if (this.arreglo[i].getApps()>promedio) 
            {
                arriba++;
            }
            else
            {
                abajo++;
            }
        }
        return "Celulares arriba del promedio: " + arriba+
                "\nCelulares abajo del promedio: " + abajo;
    }
}
