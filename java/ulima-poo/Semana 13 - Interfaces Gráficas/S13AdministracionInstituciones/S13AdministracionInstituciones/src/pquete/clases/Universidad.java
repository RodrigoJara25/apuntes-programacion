/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pquete.clases;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Universidad extends Institucion
{

    public Universidad(int cod, String nombre, String ubicacion) {
        super(cod, nombre, ubicacion);
    }

    @Override
    public void CalcularCantAlum() 
    {
        Random rand = new Random();
        this.cantAlum = rand.nextInt(700-400+1)+400;
        while (this.cantAlum%10 != 6) 
        {
            this.cantAlum = rand.nextInt(700-400+1)+400;
        }
    }
    
    
}
