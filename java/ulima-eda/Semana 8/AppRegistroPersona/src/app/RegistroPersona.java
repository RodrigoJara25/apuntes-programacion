package app;

import tda.Lista;


public class RegistroPersona {
    private Lista<Persona> lista;
    
    public RegistroPersona(){
        this.lista = new Lista();
    }
    // Agregar Persona
    public void agregar(int dni, String nombres){
        Persona persona = new Persona(dni,nombres);
        lista.agregar(persona);
    }
    public int ubicacion(int dni){
        for (int i = 1; i <= lista.longitud(); i++) {
            if (lista.iesimo(i).getDni()==dni){
                return i;
            }
        }
        return -1;        
    }
    // eliminar del registro a una Persona
    public void eliminar(int dni){
        int pos = ubicacion(dni);
        if (pos>=0){
            lista.eliminar(pos);
        }        
    }
    public int longitud(){
        return lista.longitud();
    }
    public Persona iesimo(int pos){
        return lista.iesimo(pos);
    }
    

    
}
