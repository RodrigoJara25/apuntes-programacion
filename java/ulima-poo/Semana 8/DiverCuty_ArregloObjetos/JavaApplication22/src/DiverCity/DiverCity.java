/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiverCity;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class DiverCity 
{
    //Atributos
    private String pais;
    private Ciudadano[] listaCiudadanos;
    private int cont_ciudadanos;
    
    //Constructor
    public DiverCity(String pais) 
    {
        this.pais = pais;
        this.listaCiudadanos = new Ciudadano[10];
        this.cont_ciudadanos = 0;
    }
    
    //Getters and setters
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Ciudadano[] getListaCiudadanos() {
        return listaCiudadanos;
    }

    public void setListaCiudadanos(Ciudadano[] listaCiudadanos) {
        this.listaCiudadanos = listaCiudadanos;
    }

    public int getCont_ciudadanos() {
        return cont_ciudadanos;
    }

    public void setCont_ciudadanos(int cont_ciudadanos) {
        this.cont_ciudadanos = cont_ciudadanos;
    }
    
    //Método
    public void IngresarCiudadano(Ciudadano ref)
    {
        if (this.cont_ciudadanos<this.listaCiudadanos.length) 
        {
            if (BuscaCiu(ref.getCui())==false) 
            {
                this.listaCiudadanos[this.cont_ciudadanos]=ref;
                this.cont_ciudadanos=this.cont_ciudadanos+1;
            }
            else
            {
                System.out.println("Ya existe el ciudadano");
            }
        }
        else
        {
            System.out.println("No hay más espacio");
        }
    }
    
    private boolean BuscaCiu(int cui)
    {
        for (int i = 0; i < this.cont_ciudadanos; i++) 
        {
            if (this.listaCiudadanos[i].getCui()==cui) 
            {
                return true;
            }
        }
        return false;
    }
    
    public void Sorteo()
    {
        Random rand = new Random();
        int numSorteo = rand.nextInt((this.cont_ciudadanos-1)-0+1)+0;
        System.out.println("El ciudadano sorteado es \n"+this.listaCiudadanos[numSorteo].getDetalleC());
        
    }
    
    public String getDetalleTC()
    {
        String cad=this.pais+"\n"+"\n";
        for (int i = 0; i < this.cont_ciudadanos; i++) 
        {
            cad = cad + this.listaCiudadanos[i].getDetalleC()+"\n";
        }
        return cad;
    }
    
    
    
    
}
