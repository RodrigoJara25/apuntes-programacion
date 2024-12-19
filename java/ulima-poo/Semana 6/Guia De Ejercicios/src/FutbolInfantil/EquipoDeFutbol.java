/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FutbolInfantil;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EquipoDeFutbol 
{
    //Atributos
    private String nomEquipo;
    private String[] nombres;
    private int[] pesos;
    
    //Método Constructor
    public EquipoDeFutbol(String nomEquipo) 
    {
        this.nomEquipo = nomEquipo;
        nombres = new String[11];
        pesos = new int [11];
    }
    
    //Método
    public void LlenarDatos()
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        for (int i = 0; i < 11; i++) 
        {
            System.out.println("Ingrese el nombre" + (i+1) + ": ");
            this.nombres[i] = sc.nextLine();
            this.pesos[i] = 30 + rand.nextInt(21);   
        }
    }
    
    public String Rango()
    {   
        int cont1=0;
        int cont2=0;
        int cont3=0;
        for (int i = 0; i < 11; i++) 
        {
            if (this.pesos[i]<=35) 
            {
                cont1 = cont1 + 1;
            }
            else if (this.pesos[i]<=40)
            {
                cont2 = cont2 + 1;
            }
            else
            {
                cont3 = cont3 + 1;
            }
        }
        return "Entre 30kg y 35kg: " + cont1 + "\n" + 
                "Entre 36kg y 40kg: " + cont2 + "\n" +
                "Mayor a 40kg: " + cont3 + "\n";
    }
    
    public void MayorMenorPeso()
    {
        int mayor = this.pesos[0];
        int menor = this.pesos[0];
        
        //int posMayor[] = new int [11];  //crear una lista por si hay más de un mayor
        //int posMenor[] = new int [11];
        
        for (int i = 0; i < 11; i++) 
        {
            if (this.pesos[i]>mayor) 
            {
                mayor = this.pesos[i];
                //posMayor[i]=i;
            }
            if (this.pesos[i]<menor) 
            {
                menor = this.pesos[i];
                //posMenor[i]=i;
            }
        }
        
        for (int i = 0; i < 11; i++) 
        {
            if (this.pesos[i]==mayor) 
            {
                System.out.println("Peso mayor: " + this.nombres[i] + " de peso " + this.pesos[i]);
            } 
            if (this.pesos[i]==menor) 
            {
                System.out.println("Peso menor: " + this.nombres[i] + " de peso " + this.pesos[i]);
            }
        }
    }
    
    public String VerInfo()
    {
        String cad="";
        cad = this.nomEquipo + "\n";
        
        for (int i = 0; i < 11; i++) 
        {
            cad = cad + nombres[i] + " con peso: " + pesos[i] + "\n";
        }
        return cad;
        
    }
    
    
    
    
    
    
}
