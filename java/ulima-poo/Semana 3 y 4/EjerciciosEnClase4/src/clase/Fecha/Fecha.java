/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.Fecha;

/**
 *
 * @author Usuario
 */
public class Fecha 
{
    //Atributos
    private int dia, mes, año;
    
    //Métodos Constructores

    public Fecha() 
    {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }

    public Fecha(int pDia, int pMes, int pAño) 
    {
        if (esFechaValida(pDia, pMes, pAño))
        {
            this.dia = pDia;
            this.mes = pMes;
            this.año = pAño;
        }
        else
        {
            System.out.println("No es una fecha válida");
        }
    }
    
    //creamos una función para esFechaValida (solo para esta clase)
    private boolean esFechaValida(int pDia, int pMes, int pAño)
    {
        if (pAño > 0) 
        {
            if (pMes>=1 && pMes<=12)
            {
                if (pDia>=1 && pDia <= nroDias(pMes, pAño)) 
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        } 
    }
    
    //creamos una función para nroDias (solo para esta clase)
    private int nroDias(int pMes, int pAño)
    {
        if (pMes==2) 
        {
            if (pAño%4==0) 
            {
                return 29;
            }
            else
            {
                return 28;
            }
        }
        else if (pMes==4 || pMes==6 || pMes==9 || pMes==11) 
        {
            return 30;
        }
        else
        {
            return 31;
        }
    }
    
    //Getters and Setters
    public int getDia() {
        return dia;
    }
    
    public void setDia(int pDia){
        if (pDia >= 1 && pDia <= nroDias(mes, año)) {
            this.dia = pDia;
        }
        else{
            System.out.println("Dia no válido, ingrese nuevamente");
        }
    }

    public int getMes() {
        return mes;
    }
    
    public void setMes(int pMes){
        if (pMes>=1 && pMes<=12 && dia<=nroDias(pMes, año)) {
            this.mes = pMes;
        }
        else{
            System.out.println("Mes inválido, ingrese nuevamente");
        }
    }

    public int getAño() {
        return año;
    }
    
    public void setAño(int pAño){
        if (esFechaValida(dia, mes, pAño)) {
            this.año = pAño;
        }
        else{
            System.out.println("Año inválido, ingrese nuevamente");
        }
    }
    
    
    
    
    
    
}
