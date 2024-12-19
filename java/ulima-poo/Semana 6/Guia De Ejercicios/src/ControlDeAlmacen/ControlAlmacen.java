/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlDeAlmacen;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ControlAlmacen 
{
    //Variables de Instancia (no tienen Static)
    private int[][] matriz;
    
    private int[] totalxAlm;
    private int[] totalxProd;
    
    private int numAlm;   //número de alamcenes
    private int numProd;   //número de tipo de productos
    
    //Constructor
    public ControlAlmacen() //no hay parámetros xq todo lo hace la clase
    {
        this.matriz = new int[20][15]; //matriz de 20x15
        this.totalxAlm = new int[20];  //vector
        this.totalxProd = new int[15]; //vector
        this.numAlm = 0;              //variables
        this.numProd = 0;             //variables   
    }
    
    //Métodos públicos
    Scanner sc = new Scanner(System.in);
    public void NumAlmacenesProductos()
    {
        do
        {
            System.out.println("Escriba el número de almacenes (maximo 20): ");
            this.numAlm = sc.nextInt();
        }while(this.numAlm>20);
        
        do{
            System.out.println("Escriba el número de tipos de productos(maximo 15): ");
            this.numProd = sc.nextInt();
        }while(this.numAlm>15);
    }
    
    public void CantProductosXAlm()
    {
        for (int i = 0; i < this.numAlm; i++) 
        {
            for (int j = 0; j < this.numProd; j++) 
            {
                System.out.println("Ingrese la cantidad de productos existentes del producto "+(j+1)+" en el almacén "+(i+1)+":");
                this.matriz[i][j] = sc.nextInt();
            }
        }
    }
    
    public void CalcularTotalxAlmProd()
    {        
        int total1=0;
        int total2=0;
        
        for (int i = 0; i < this.numAlm; i++) 
        {
            for (int j = 0; j < this.numProd; j++) 
            {
                total1 = total1 + matriz[i][j];
            }
            totalxAlm[i] = total1;
            total1=0;
        }
        
        for (int j = 0; j < this.numProd; j++) 
        {
            for (int i = 0; i < this.numAlm; i++) 
            {
                total2 = total2 + matriz[i][j];
            }
            totalxProd[j] = total2;
            total2=0;
        }
    }
    
    public String  VerInfo()
    {
        String cad = "\t";
        
        for (int i = 0; i < this.numProd; i++) 
        {
            cad = cad + "P" + (i+1) + "\t";
        }
        
        //cad = cad + "TOTAL";
        cad = cad + "\n";
        
        for (int i = 0; i < this.numAlm; i++) 
        {
            cad = cad + "A"+(i+1)+"\t";
            for (int j = 0; j < this.numProd; j++) 
            {
                cad = cad + matriz[i][j] + "\t";
            }
            cad = cad + totalxAlm[i];
            cad = cad + "\n";
        }
        
        cad = cad +"\t";
        
        for (int i = 0; i < this.numProd; i++) 
        {
            cad = cad + totalxProd[i] + "\t";
        }
        
        return cad;
    }
    
    
    
    
    
    
            
            
    
    
    
}
