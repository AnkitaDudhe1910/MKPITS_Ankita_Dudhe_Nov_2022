/*Write a Java program to create a TreeMap and remove 
  some elements from it. */

   import java.util.*;

     class Program_17 {
       public static void main(String [] args){
      
         TreeMap <Integer,String> tm = new TreeMap <>();
         tm.put(1,"mno");
         tm.put(6,"fgh");
         tm.put(3,"asr");
         tm.put(5,"pcr");
         System.out.println(tm);
         tm.remove(6);
         System.out.println(tm);
      }
  }