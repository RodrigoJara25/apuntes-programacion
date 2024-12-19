/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import javax.swing.JOptionPane;
import paquete.clases.*;

/**
 *
 * @author Usuario
 */
public class Gestion 
{
    //Atributos
    private Producto[] arreglo;
    private  int contador;

    //Constructor
    public Gestion() 
    {
        this.arreglo = new Producto[20];
        this.contador = 0;
    }
    
    //Getters and setters
    public Producto[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Producto[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void Ingresar(Producto ref)
    {
        if (this.contador < this.arreglo.length) 
        {
            if (ref instanceof Bono) 
            {
                ref.setCode("B"+ref.getCode());
            }
            else if (ref instanceof Seguro) 
            {
                ref.setCode(ref.getCode()+"SI");
            }
            else if (ref instanceof Bolsa) 
            {
                ref.setCode("I"+ref.getCode()+"B");
            }
            this.arreglo[contador] = ref;
            this.contador++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay espacio");
        }
    }
    
    public void Eliminar(String code)
    {
        for (int i = 0; i < this.contador; i++) 
        {
            if (code.equalsIgnoreCase(this.arreglo[i].getCode())) 
            {
                for (int j = i; j < this.contador-1; j++) //contador-1, ya no considera el último valor
                {
                    this.arreglo[j] = this.arreglo[j+1];
                }
                this.arreglo[this.contador-1]=null;
                this.contador--;
            }
        }
        JOptionPane.showMessageDialog(null, "Producto eliminado");
    }
    
    public void Modificar(String descBus, String descMod)
    {
        for (int i = 0; i < this.contador; i++) 
        {
            if (arreglo[i].getCode().equalsIgnoreCase(descBus) || arreglo[i].getDescripcion().equalsIgnoreCase(descBus)) 
            {
                arreglo[i].setDescripcion(descMod);
            }
        }
    }
    
    public void IngresarPos(Producto ref, int pos)
    {
        if (this.contador<this.arreglo.length) 
        {
            if (pos <= contador) //si la posicion es igual al contador, entonces se estaría ingresando en la último posicion, como un ingreso normal
            {
                for (int i = contador-1; i >= pos; i--) 
                {
                    this.arreglo[i+1] = this.arreglo[i]; //voy moviendo todo hacia la derecha
                }
                this.arreglo[pos] = ref;
                contador++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se puede ingresar en posición mayor a las ya ingresadas");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay espacio");
        }
    }
 
}
