/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.SuperClase;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public abstract class Producto 
{
    //Atributos
    protected String nomCom;
    protected int cantMili;
    protected String fechaFab;
    protected float costoTotal;
    protected String code;
    
    //Constructor
    public Producto(String nomCom, int cantMili, String fechaFab) 
    {
        this.nomCom = nomCom;
        this.cantMili = cantMili;
        this.fechaFab = fechaFab;
    }
    
    //Getters and setters
    public String getNomCom() {
        return nomCom;
    }

    public void setNomCom(String nomCom) {
        this.nomCom = nomCom;
    }

    public int getCantMili() {
        return cantMili;
    }

    public void setCantMili(int cantMili) {
        this.cantMili = cantMili;
    }

    public String getFechaFab() {
        return fechaFab;
    }

    public void setFechaFab(String fechaFab) {
        this.fechaFab = fechaFab;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    //Métodos
    public void CalcularCode()
    {
        Random rand = new Random();
        
        int num = rand.nextInt(199-100+1)+100;
        this.code = "FU"+num;
    }
    
    //Método abstracto
    public abstract void CalcularCostoTotal();
    
    
    
}
