/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcursoDeBelleza;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class ConcursoBelleza 
{
    //Atributos
    private int[][] matriz;
    private int[] total;
    
    Random rand = new Random();
    
    //Método Constructor
    public ConcursoBelleza() 
    {
        this.matriz = new int[12][4];
        this.total = new int[12];
    }
    
    //Métodos públicos
    public void GenerarPuntaje()
    {
        for (int i = 0; i < 12; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                this.matriz[i][j] = rand.nextInt(10)+1;
            }
        }   
    }
    
    public void CalcularTotal()
    {
        int total=0;
        for (int i = 0; i < 12; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                total = total + this.matriz[i][j];
            }
            this.total[i] = total;
            total = 0;
        }
    }
    
    public String Ganadoras()
    {
        int mayor=-1;
        for (int i = 0; i < 12; i++) 
        {
            if (this.total[i]>mayor) 
            {
                mayor = this.total[i];
            }
        }
        int ganadoras=0;
        for (int i = 0; i < 12; i++) 
        {
            if (this.total[i]==mayor) 
            {
                ganadoras = ganadoras + 1;
            }
        }
        return "La cantidad de ganadoras es: " + ganadoras;
    }
    
    public String Resultados()
    {
        String cad="\t";
        
        for (int i = 0; i < 4; i++) 
        {
            cad = cad + "P" + (i+1) + "\t";
        }
        
        cad = cad + "TOTAL";
        
        cad = cad + "\n";
        
        for (int i = 0; i < 12; i++) 
        {
            cad = cad + "C" + (i+1) + "\t";
            for (int j = 0; j < 4; j++) 
            {
                cad = cad + matriz[i][j] + "\t";
            }
            cad = cad + this.total[i];
            
            cad = cad + "\n";
        }        
        return cad;
    }
    
    
    
}
