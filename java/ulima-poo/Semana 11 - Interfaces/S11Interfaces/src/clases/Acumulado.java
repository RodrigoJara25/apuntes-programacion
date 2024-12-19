/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class Acumulado implements Modificacion
{
    private int valor;

    @Override
    public void Incremento(int a) 
    {
        valor += a;
        valor = valor + MONTO;
    }   
}
