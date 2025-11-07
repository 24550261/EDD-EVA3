/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_comparator;

import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author oujeffu
 */
public class EVA3_3_COMPARATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<persona> lis= new LinkedList<persona>();
        lis.add(new persona("Juan perez", 18, new Date(2006-1900, 11, 16)));
        lis.add(new persona("Luis Javier", 21, new Date(2006-1900, 9, 16)));
        lis.add(new persona("Alex Ibarra", 20, new Date(2006-1900, 11, 16)));
                System.out.println(lis);
        Comparator nombre = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
              persona per1= (persona)o1;
              persona per2= (persona)o2;
              
              return per1.getNombre().compareTo(per2.getNombre());
              
            }
        };
                lis.sort(nombre);
                System.out.println(lis);
                
          Comparator edad= new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                  persona per1= (persona)o1;
                  persona per2= (persona)o2;
                  
                  
                  return per1.getEdad()-per2.getEdad();
            }
          };
          lis.sort(edad);
          System.out.println(lis);
                  
              Comparator date= new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
              persona per1= (persona)o1;
              persona per2= (persona)o2;
              
              return per1.getFechana().compareTo(per1.getFechana());
              
            }
              };
              
              lis.sort(date);
              
              System.out.println(lis);
    } 
    
    
    
    
}


class persona{
    private String nombre;
    private int edad;
    private Date Fechana;

    public persona(String nombre, int edad, Date Fechana) {
        this.nombre = nombre;
        this.edad = edad;
        this.Fechana = Fechana;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechana() {
        return Fechana;
    }

    public void setFechana(Date Fechana) {
        this.Fechana = Fechana;
    }
    
    
    @Override
    public String toString(){
        return  nombre+ " "+ edad+ " "+ Fechana.toString();
    }
    
}