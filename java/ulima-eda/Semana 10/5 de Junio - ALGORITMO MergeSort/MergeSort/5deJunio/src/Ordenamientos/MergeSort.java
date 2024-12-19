/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientos;

import java.util.Scanner;

/**
 *
 * @author L33231
 */
public class MergeSort {
    public static int[] generarAscendente(int n){
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        
        return array;
    }
    
    public static int[] generarDescendente(int n){
        int[] array = new int[n];
        
        for (int i = n; i > 0; i--) {
            array[n-i] = i;
        }
        
        return array;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar tamaño N: ");
        int N = sc.nextInt();
        
        int[] asc = generarAscendente(N);

        
        int[] dsc = generarDescendente(N);
        
        
        /*System.out.println("Before sorting:");
        printArray(dsc_10);*/
        
        long startTime = System.nanoTime();
        mergeSort(asc, 0, asc.length - 1);
        long finishTime = System.nanoTime();
        System.out.println("Total time Ascendente: " + (finishTime - startTime));
        
        long startTime2 = System.nanoTime();
        mergeSort(dsc, 0, dsc.length - 1);
        long finishTime2 = System.nanoTime();
        System.out.println("Total time Descendente: " + (finishTime2 - startTime2));
        
        /*System.out.println("\nAfter sorting:");
        printArray(dsc_10);*/
        

    }
    
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        
        int i = 0, j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
