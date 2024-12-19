/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotasInstituciónEducativa;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class NotasInstitucionEducativa 
{
    //Atributos 
    private int[][] matriz;
    private int[] total;
    private float[] promedioXcurso;
    private float[] promedioXalumno;
    private float prom_max;
    private float prom_min;
    
    //Constructor
    public NotasInstitucionEducativa() 
    {
        this.matriz = new int[8][40];
        this.total = new int[8];
        this.promedioXcurso = new float[8];
        this.promedioXalumno = new float[40];
        this.prom_max = 0;
        this.prom_min = 1000;
    }
    
    Random rand = new Random();
    
    public void GenerarNotas()
    {
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 40; j++) 
            {
                this.matriz[i][j] = rand.nextInt(21);
            }
        }
    }
    
    public void CalcularPromedio()
    {
        float suma = 0;
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 40; j++) 
            {
                suma = suma + this.matriz[i][j];
            }
            this.promedioXcurso[i] = (suma/40);
            suma=0;
        }
        
        float suma1=0;
        for (int j = 0; j < 40; j++) 
        {
            for (int i = 0; i < 8; i++) 
            {
                suma1 = suma1 + this.matriz[i][j];
            }
            this.promedioXalumno[j] = (suma1/8);
            suma1=0;
        }
    }
    
    public void PromedioMayorMenor()
    {
        for (int i = 0; i < 8; i++) 
        {
            if (this.promedioXcurso[i]>this.prom_max) 
            {
                this.prom_max = this.promedioXcurso[i];
            }
            if (this.promedioXcurso[i]<this.prom_min) 
            {
                this.prom_min = this.promedioXcurso[i];
            }
        }
    }
    
    public String VerInfo()
    {
        String cad = "\t";
        
        for (int i = 0; i < 40; i++) 
        {
            cad = cad + "A" + (i+1) + "\t";
        }
        cad = cad + "PROM" + "\t";
        cad = cad + "\n";
        
        for (int i = 0; i < 8; i++) 
        {
            cad = cad + "C" + (i+1) + "\t";
            for (int j = 0; j < 40; j++) 
            {
                cad = cad + this.matriz[i][j] + "\t"; 
            }
            cad = cad + this.promedioXcurso[i];
            cad = cad+"\n";
        }
        cad = cad + "PROM" + "\t";
        for (int i = 0; i < 40; i++) 
        {
            cad = cad + this.promedioXalumno[i] + "\t";
        }
        cad = cad + "\n" + "\n";
        
        cad = cad + "El promedio más alto de los cursos es: " + this.prom_max + "\n";
        
        cad = cad + "El promedio más bajo de los cursos es: " + this.prom_min + "\n";
        
        return cad;
    }
    
    
    
    
}
