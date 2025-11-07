/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_ordenamiento;

/**
 *
 * @author oujeffu
 */
public class EVA3_1_ORDENAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] original= new int[10];
        int [] selection;
        int[] insertion;
        int[] bubble;
        int[] quick;
        long ini, fin, tiempo;
        llenarArreglo(original);
        imprimirArreglo(original);
        selection= copiarArreglo(original);
        insertion= copiarArreglo(original);
        quick= copiarArreglo(original);
        bubble= copiarArreglo(original);
       ini= System.nanoTime();
        selectionSort(selection);
        fin= System.nanoTime();
        System.out.println("Selection sort");
        imprimirArreglo(selection);
        tiempo= fin-ini;
        System.out.println("T = "+ tiempo );
        
        ini= System.nanoTime();
        insertionSort(insertion);
        fin=System.nanoTime();
        tiempo= fin-ini;
        System.out.println("Insertion Sort");
        //imprimirArreglo(insertion);
        System.out.println("T= "+tiempo);
        
        ini= System.nanoTime();
        bubbleSort(bubble);
        fin=System.nanoTime();
        tiempo= fin-ini;
        System.out.println("Bubble Sort");
        imprimirArreglo(insertion);
        System.out.println("T= "+tiempo);
        
        ini= System.nanoTime();
        quickSort(quick, 0, (quick.length-1));
        fin=System.nanoTime();
        tiempo= fin-ini;
        System.out.println("Bubble Sort");
        imprimirArreglo(insertion);
        System.out.println("T= "+tiempo);
    }
    
    //O(N^2)
    public static void llenarArreglo(int[] datos){
        for (int i = 0; i < datos.length; i++) {
            datos[i]= (int)(Math.random()*10000);
        }
    }
    
    
    public static void imprimirArreglo(int[] datos){
        for (int i = 0; i < datos.length; i++) {
            System.out.println("["+datos[i]+"]");
        }
        System.out.println("");
    }
    
    public static int [] copiarArreglo (int [] datos){
        int[] nuevo= new int[datos.length];
        for (int i = 0; i < 10; i++) {
            nuevo[i]= datos[i];
        }
        
        return nuevo;
    }
    
    public static void selectionSort(int [] datos){
      
       
        for (int i = 0; i < datos.length; i++) {
            int min=i;
            for (int j = i+1; j < datos.length; j++) {
                if (datos[j]<datos[min]) {
                    
                    min=j;
                    
                }else{
                    
                }
            }
            if (min!=i) {
                int temp= datos[i];
                datos[i]= datos [min];
                datos[min]= temp;
                        
            }
            
        }
        
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
    
    public static void bubbleSort(int [] dato){
        for (int i = 0; i < dato.length; i++) {
            for (int j = 0; j < (dato.length-1); j++) {
                if (dato[j]>dato[j+1]) {//intercambio
                    
                    int temp= dato [j+1];
                    dato[j+1]= dato[j];
                    dato[j]= temp;
                    
                }
            }
        }
    }
    
    public static void quickSort(int[] dato, int ini, int fin){
        int pivot= ini;
        int smallValor= fin;
        int longValor= pivot+1;
        int temp=0;
        
        
      while(smallValor!=longValor){
       
           
            while (dato[smallValor]>=dato[ini]){
                smallValor--;
            }
             
            while(dato[longValor]<=dato[ini]){
                longValor++;
            }
            
          
          if (dato[longValor]<dato[smallValor]) {
              temp= dato[longValor];
              dato [longValor]= dato[smallValor];
              dato[smallValor]= temp;
                      
          }
        
      }
      
      temp= dato[pivot];
      dato[pivot]= dato[smallValor];
      pivot=smallValor;
      dato[pivot]= temp;
      
       
        quickSort(dato, ini, pivot-1);
        quickSort(dato, pivot+1, fin);
      
      
      
      
      
        
        
            
        
        
    }
    
}
