/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author o22234
 */
public class Celular 
{
    //Atributos
    protected int code, apps;
    protected String modelo;
    protected float memoria, megapixel;
    
    //Constructor
    public Celular(int code, int apps, String modelo, float memoria, float megapixel) {
        this.code = code;
        this.apps = apps;
        this.modelo = modelo;
        this.memoria = memoria;
        this.megapixel = megapixel;
    }
    
    //Getters and setters

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getApps() {
        return apps;
    }

    public void setApps(int apps) {
        this.apps = apps;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getMemoria() {
        return memoria;
    }

    public void setMemoria(float memoria) {
        this.memoria = memoria;
    }

    public float getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(float megapixel) {
        this.megapixel = megapixel;
    }
    
}
