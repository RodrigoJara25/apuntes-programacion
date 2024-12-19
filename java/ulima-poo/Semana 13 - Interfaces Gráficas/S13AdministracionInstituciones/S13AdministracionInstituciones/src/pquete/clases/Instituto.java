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
public class Instituto extends Institucion
{

    public Instituto(int cod, String nombre, String ubicacion) {
        super(cod, nombre, ubicacion);
    }

    @Override
    public void CalcularCantAlum() 
    {
        int conta = 0;
        int suma = 0;
        for (int i = 500; i <= 700; i++) 
        {
            if (conta<2) 
            {
                if (i%7==0) 
                {
                    suma = suma + i;
                    conta++;
                }
            }
        }
        this.cantAlum = suma;
    }
    
    
}
