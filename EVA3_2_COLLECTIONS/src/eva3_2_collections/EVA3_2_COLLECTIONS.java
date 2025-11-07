/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_collections;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author oujeffu
 */
public class EVA3_2_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LinkedList <Integer> lista = new LinkedList<Integer>();
         lista.add(100);
         lista.add(200);
         lista.add(300);
         lista.add(400);
         lista.add(500);
         lista.add(600);
        
         System.out.println(lista);
         
         
         Comparator comparator = new Comparator() {
             @Override
             public int compare(Object o1, Object o2) {
                 Integer val1= (Integer)o1;
                 
                 Integer val2= (Integer)o2;
                 
                 
                 return val1-val2;
         }
               
};
                   lista.sort(comparator);
                   
                   
                   
                   
}
}