/* Write a Java program to create a TreeMap and get
   the value of a specific key. */

   import java.util.*;

     class Program_22 {
       public static void main(String [] args){

       TreeMap <Integer,String> tm = new TreeMap<>();
       tm.put(5,"cfg");
       tm.put(1,"ugh");
       tm.put(9,"opq");
       System.out.println(tm);
       System.out.println(tm.get(9));
      }
  }