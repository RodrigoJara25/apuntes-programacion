/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pquete.clases;

/**
 *
 * @author Usuario
 */
public class Colegio extends Institucion
{

    public Colegio(int cod, String nombre, String ubicacion) {
        super(cod, nombre, ubicacion);
    }

    private boolean EsPrimo(int num)
    {
        for (int i = 2; i < num; i++) 
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void CalcularCantAlum() 
    {
        int conta = 0;
        int suma = 0;
        for (int i = 500; i <= 800; i++) 
        {
            if (conta<2) 
            {
                if (EsPrimo(i)==true) 
                {
                    suma = suma + i;
                    conta++;
                }
            }
        }
        this.cantAlum = suma;
    }
    
    
    
}
