/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComposicionClases;

/**
 *
 * @author Usuario
 */
public class Fecha 
{
    //Atributos
    private int dd, mm, aa;
    
    //Constructor
    public Fecha(int dd, int mm, int aa) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }
    
    //Getters and Setters
    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }
    
    //Métodos
    public String VerInfo()
    {
        return "Dias: " + dd + "\nMes: " + mm + "\nAño: " + aa;
    }
    
    
    
}
