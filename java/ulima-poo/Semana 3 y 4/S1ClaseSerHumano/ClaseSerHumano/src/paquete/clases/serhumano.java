/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author Usuario
 */
public class SerHumano 
{
    //Atributos
    private String nombre;
    private String colorOjos;
    private int edad;
    public static int cantObj;
    
    //Método Constructor (no tiene retorno, tiene el mismo nombre que la clase, generalmente es público)
    public SerHumano(String nombre, String colorOjos, int edad) //definimos los parámetros (no es necesario que tengan el mismo nombre)
    {
        //asignamos los valores de los parámetros a los atributos
        this.nombre = nombre;
        this.colorOjos = colorOjos;
        this.edad = edad;
        cantObj++;
    }
    
    public SerHumano(int edad, String nombre)
    {
        this.nombre = nombre;
        this.edad = edad;
        cantObj++;
    }

    public SerHumano() 
    {
        cantObj++;
    }
    
    
    
    //Definimos métodoS con retorno
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getcolorOjos()
    {
        return this.colorOjos;
    }
    
    public int edad()
    {
        return this.edad;
    }
    
    //Cuando es un método que no tiene retorno (retorno vacío) se pone "void"
    public void setNombre(String nombre) //tiene parámetros
    {
        this.nombre = nombre; //como es un set, entonces le asginamos el nuevo valor
    }
    
    public void setcolorOjos(String colorOjos)
    {
        this.colorOjos = colorOjos;
    }
    
    public void setedad(int edad)
    {
        this.edad = edad;
    }        
    
    
    
    
}
