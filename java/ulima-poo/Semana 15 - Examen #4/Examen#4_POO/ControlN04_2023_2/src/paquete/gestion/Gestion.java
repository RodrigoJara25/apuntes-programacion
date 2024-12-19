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
    private Alumnos[] arreglo;
    private int cont;
    
    //constructor
    public Gestion() 
    {
        this.arreglo = new Alumnos[200];
        this.cont = 0;
    }
    
    //Getters and setetrs
    public Alumnos[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Alumnos[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    public void Ingresar(Alumnos ref)
    {
        if (this.cont < this.arreglo.length) 
        {
            if (ref instanceof Mecatrónica) 
            {
                ref.setCode(ref.getCode()+"-IM");
            }
            this.arreglo[cont]=ref;
            cont++;
        }
    }
    
    public void Eliminar(String cod)
    {
        for (int i = 0; i < this.cont; i++) 
        {
            if (cod.equalsIgnoreCase(this.arreglo[i].getCode())) 
            {
                for (int j = i; j < this.cont-1; j++) 
                {
                    this.arreglo[j] = this.arreglo[j+1];
                }
                this.arreglo[this.cont-1]=null;
                this.cont--;
            }
        }
        JOptionPane.showMessageDialog(null, "Alumno eliminado");
    }
    
    public void IngresarPos(Alumnos ref, int pos)
    {
        if (this.cont < this.arreglo.length) 
        {
            if (pos <= this.cont)
            {
                for (int i = this.cont-1; i >= pos; i--) 
                {
                    this.arreglo[i+1] = this.arreglo[i];
                }
                this.arreglo[pos] = ref;
                this.cont++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Posición inválida");
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay espacio");
        }
    }
    
    
    
}
