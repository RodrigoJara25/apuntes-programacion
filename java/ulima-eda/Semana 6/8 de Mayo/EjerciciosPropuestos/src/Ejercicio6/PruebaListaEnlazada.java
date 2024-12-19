/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author Usuario
 */
public class PruebaListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada lista1 = new ListaEnlazada();
        lista1.insertar(20224280, 255, 19);
        lista1.insertar(20220999, 275, 18);
        lista1.insertar(20224280, 150, 15);
        lista1.insertar(20223015, 146, 11);
        lista1.mostrar();
        System.out.println("Promedio de estudiante 20224280: " + lista1.promedioEstudiante(20224280));
        lista1.insertar(20224280, 294, 10);
        lista1.mostrar();
        System.out.println("Promedio de estudiante 20224280: " + lista1.promedioEstudiante(20224280));
        lista1.insertar(20224280, 255, 16);
    }
}
