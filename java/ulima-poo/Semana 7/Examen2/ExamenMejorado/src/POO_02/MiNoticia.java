/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MiNoticia 
{
    //Atributos
    private int nroLibros;
    private int[][] matriz;
    
    private String code;
    private int empleados;
    private String ciudad;
    private Administrador admin;
    
    private int[] totalxPV;
    
    //Constructor
    public MiNoticia(String code, int empleados, String ciudad, Administrador admin) 
    {
        this.code = code;
        this.empleados = empleados;
        this.ciudad = ciudad;
        this.admin = admin;
        
        this.nroLibros=0;
        this.matriz = new int[8][25];
        
        this.totalxPV = new int[25];
    }
    
    //Métodos
    Scanner sc = new Scanner(System.in);
    public void nroTipoLibros()
    {
        do 
        {
            System.out.println("Ingrese el número de tipos de libros: ");
            this.nroLibros = sc.nextInt();
        } while (this.nroLibros<0 || this.nroLibros>8);
    }
    
    Random rand = new Random();
    public void LlenarMatriz()
    {
        for (int i = 0; i < this.nroLibros; i++) 
        {
            for (int j = 0; j < 25; j++) 
            {
                do {
                    this.matriz[i][j] = rand.nextInt(61)+25;
                } while (EsPrimo(this.matriz[i][j])==false);
            }
        }
    }
    
    public void MayorPuntoVenta()
    {
        int suma=0;
        for (int j = 0; j < 25; j++) 
        {
            for (int i = 0; i < this.nroLibros; i++) 
            {
                suma = suma + this.matriz[i][j];
            }
            this.totalxPV[j]=suma;
            suma=0;
        }
    }
    
    public String MostrarInfo()
    {
        String cad = "\t";
        
        for (int i = 0; i < 25; i++) 
        {
            cad = cad + "PV" + (i+1) + "\t";
        }
        cad = cad + "\n";
        
        for (int i = 0; i < this.nroLibros; i++) 
        {
            cad = cad + "L" + (i+1) + "\t";
            for (int j = 0; j < 25; j++) 
            {
                cad = cad + this.matriz[i][j] + "\t";
            }
            cad = cad + "\n";
        }
        return cad;
    } 
    
    //Función EsPrimo
    private boolean EsPrimo(int num)
    {
        boolean primo=false;
        int cont=0;
        for (int i = 1; i <= num; i++) 
        {
            if (num%i==0) 
            {
                cont = cont + 1;
            }
        }
        if (cont==2) 
        {
            primo=true;
        }
        return primo;
    }
    
    
}
