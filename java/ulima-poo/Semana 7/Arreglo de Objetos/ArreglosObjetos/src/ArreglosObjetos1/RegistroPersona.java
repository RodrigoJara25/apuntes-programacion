/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosObjetos1;

/**
 *
 * @author Usuario
 */
public class RegistroPersona 
{
    //Atributos
    private Persona[] lista; //arreglo de objetos de tipo Persona
    private int nroPersonas;
    
    
    //Constructor
    public RegistroPersona() 
    {
        this.lista = new Persona[20]; //lista de tamaño máximo 20
        this.nroPersonas = 0;
    }
    
    //Método
    public void IngresarPersona(Persona ref)  //Verifica que haya espacio y luego agrega a la lista
    {
        if (this.nroPersonas<lista.length)  //si el nroPersonas no supera 20 
        {
            this.lista[this.nroPersonas]=ref;
            this.nroPersonas = this.nroPersonas+1;
        }
        else
        {
            System.out.println("No hay espacio");
        }
    }
    
    public String VerInfo() //mostrar todos los objetos del arreglo
    {
        String cad="";
        for (int i = 0; i < this.nroPersonas; i++) 
        {
            cad = cad + "Datos de Persona " +(i+1)+"\n" +this.lista[i].VerInfo() + "\n\n";
        }
        return cad;
    }
    
    public void Ubicar(int dni)
    {
        boolean encontro =false;
        for (int i = 0; i < this.nroPersonas; i++) 
        {
            if (lista[i].getDni()==dni) 
            {              
                encontro=true;
                break;
            }
        }
        if (encontro==false) 
        {
            System.out.println("No se encontró a niguna persona con ese DNI");
        }
        else
        {
            System.out.println("Se encontró a una persona con ese dni");
        }
    }
}
