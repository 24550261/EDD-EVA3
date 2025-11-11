/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_busqueda_binario;

import java.util.Scanner;

/**
 *
 * @author oujeffu
 */
public class EVA3_4_BUSQUEDA_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap= new Scanner (System.in);
        int [] original= new int[20];
        llenarArreglo(original);
        imprimirArreglo(original);
        insertionSort(original);
        imprimirArreglo(original);
        System.out.println("Valor a Buscar:");
        int valor=cap.nextInt();
        System.out.println("Su valor esta en "+ binarySearch(original, valor));
        
    }
 
    
    
    public static void insertionSort (int [] datos){
        for (int i = 1; i < datos.length; i++) {
            for (int j = i; j > 0; j--) {
                int prev = j-1;
                
                
                if (datos[j]<datos[prev]) {
                    int temp= datos [j];
                    datos[j]=datos [prev];
                    datos[prev]= temp;
                    
                }else{
                    break;
                }
            }
        }
    }
    
    
    
    public static void llenarArreglo(int[] datos){
        for (int i = 0; i < datos.length; i++) {
            datos[i]= (int)(Math.random()*100);
        }
    }
    
    
    public static void imprimirArreglo(int[] datos){
        for (int i = 0; i < datos.length; i++) {
            System.out.println("["+datos[i]+"]");
        }
        System.out.println("");
    }
    
    public static int binarySearch (int[] array, int valor){
        return binarySearchRec(array, valor,0,array.length-1);
    }
    
    public static int binarySearchRec(int [] array, int valor, int ini, int fin){
        int resu= -1;
        if(ini<=fin){
            int mid=ini+((fin-ini)/2);
            if (valor>array[mid]) {
                resu=binarySearchRec(array, valor, mid+1, fin);
            }else if(valor<array[mid]){
                resu= binarySearchRec(array, valor, ini, mid-1);
            }else{
                resu=mid;
            }
        }
        return resu;
    }
        
    
    
}
