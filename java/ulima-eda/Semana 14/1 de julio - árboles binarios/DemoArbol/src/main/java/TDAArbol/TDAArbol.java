/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAArbol;

/**
 *
 * @author Usuario
 */
public class TDAArbol {
    //Atributos
    private Nodo raiz;
    
    //Constructor
    public TDAArbol(){
        this.raiz = null;
    }
    
    //Métodos
    public void insertar(int valor){
        Nodo nodoNuevo = new Nodo(valor);
        if (raiz == null) {
            raiz = nodoNuevo;
        }
        else{
            Nodo ptr = raiz;
            while(true){
                if (ptr.getIzquierdo() == null) {
                ptr.setIzquierdo(nodoNuevo);
                break;
                }
                else{  //tiene hijo izquierdo
                    if (ptr.getDerecho()==null){ 
                        ptr.setDerecho(nodoNuevo);
                        break;
                    }
                    else{  //tiene hijo derecho
                        if (ptr.getIzquierdo().getIzquierdo()==null || ptr.getIzquierdo().getDerecho()==null) {
                            ptr = ptr.getIzquierdo();
                        }
                        else{
                            ptr = ptr.getDerecho();
                        }
                    }
                }
            }
        }        
    }
    
    // PREORDER
    //*************************************************
    // Método recursivo
    private void preorder_rec(Nodo actual){
        if (actual != null) {
            System.out.println(actual.getValor() + " - ");  //procesar nodo actual
            preorder_rec(actual.getIzquierdo());
            preorder_rec(actual.getDerecho());
        }
    }
    
    // Método que ve la gente/público
    public void imprimirPreorder(){
        preorder_rec(raiz);
    }
    //***************************************************
    
    
    
}
