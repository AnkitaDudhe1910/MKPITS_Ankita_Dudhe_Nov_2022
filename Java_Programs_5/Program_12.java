/* Write a Java program to create a LinkedHashMap and 
   add some elements to it. */

   import java.util.*;

     class Program_12 {

      public static void main(String [] args){
      
      LinkedHashMap <Integer,Character> lhm = new LinkedHashMap();
      
      lhm.put(1,'d');
      lhm.put(6,'p');
      lhm.put(3,'m');
      
       System.out.println(lhm);
      }
  }