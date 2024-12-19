/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import javax.swing.JOptionPane;
import pquete.clases.Institucion;

/**
 *
 * @author Usuario
 */
public class Gestion 
{
    private Institucion[] arreglo;
    private int conta;

    public Gestion() 
    {
        arreglo = new Institucion[10];
        conta = 0;
    }

    public Institucion[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Institucion[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    public void Ingresar(Institucion ref)
    {
        if (conta<arreglo.length) 
        {
            this.arreglo[conta] = ref;
            conta++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay espacio");
        }
    }
    
    public void GenerarArreglos()
    {
        Institucion[] arregloMayor300 = new Institucion[10]; 
        int contaMayor = 0;
        
        Institucion[] arregloMenor300 = new Institucion[10]; 
        int contaMenor = 0;
        
        for (int i = 0; i < this.conta; i++) 
        {
            if (this.arreglo[i].getCantAlum()>=300) 
            {
                arregloMayor300[contaMayor]=this.arreglo[i];
                contaMayor++;
            }
            else
            {
                arregloMenor300[contaMenor] = this.arreglo[i];
                contaMenor++;
            }
        }
    }
    
    public void Eliminar(int cod)
    {
        for (int i = 0; i < this.conta; i++) 
        {
            if (this.arreglo[i].getCod()==cod) 
            {
                for (int j = i; j < this.conta-1; j++) //recorre desde donde encontró el codigo hasta la última posicion
                {
                    this.arreglo[j] = this.arreglo[j+1];
                }
                this.arreglo[conta-1]=null;
                conta--;
            }
        }
    }
    
    public void IngresarPos(Institucion ref, int pos)
    {
        if (conta<this.arreglo.length) 
        {
            if (pos<=conta) 
            {
                for (int i=conta-1; i >= pos; i--) 
                {
                    this.arreglo[i+1] = this.arreglo[i];
                }
                this.arreglo[pos]=ref;
                conta++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se puede ingresar en una posición mayor a los ya ingresados");
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay espacio");
            
        }
        
    }
    
}
