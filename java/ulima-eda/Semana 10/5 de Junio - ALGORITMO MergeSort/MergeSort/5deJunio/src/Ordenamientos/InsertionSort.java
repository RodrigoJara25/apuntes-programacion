/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenamientos;

import java.util.Scanner;

/**
 *
 * @author L33231
 */
public class InsertionSort {

    public static void llenarArrayOrdenado(int array[], int N){
        for (int i = 0; i < N; i++) {
            array[i] = i;
        }
    }
    
    public static void llenarArrayInverso(int array[], int N){
        for (int i = 0; i < N; i++) {
            array[i] = N-1-i;
        }
    }
    
    public static void insertionSort(int[] A, int n){
        for(int i = 0; i < n; i++){
            int current = A[i];
            int position = i;
            while(position > 0 && A[position - 1] > current){
                A[position] = A[position - 1];
                position--;
            }
            A[position] = current;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño N de la lista: ");
        int MAX_SIZE = sc.nextInt();
        int arrayOrdenado[] = new int[MAX_SIZE];
        int arrayInverso[] = new int[MAX_SIZE];
        
        llenarArrayOrdenado(arrayOrdenado, MAX_SIZE);
        llenarArrayInverso(arrayInverso, MAX_SIZE);
        
        /*for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print(arrayInverso[i]+"-");
        }
        System.out.println("");
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print(arrayOrdenado[i]+"-");
        }
        System.out.println("");*/
                
        long ini1 = System.nanoTime(); //System.currentTimeMillis();
        insertionSort(arrayOrdenado, MAX_SIZE);   // T(n) = 2
        long fin1 = System.nanoTime();
        System.out.println("Tiempo en ms Ordenamiento Sort Array Ordenado: " + (fin1 - ini1));
        
        long ini2 = System.nanoTime(); //System.currentTimeMillis();
        insertionSort(arrayInverso, MAX_SIZE);   // T(n) = 2
        long fin2 = System.nanoTime();
        System.out.println("Tiempo en ms Ordenamiento Sort Array Inverso: " + (fin2 - ini2));
    }
    
}
