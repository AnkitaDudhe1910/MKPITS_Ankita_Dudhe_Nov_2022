/* Write a Java program to create a HashMap and remove
   some elements from it. */

   import java.util.*;

     class Program_18 {
       public static void main(String [] args){

         HashMap <Integer,String> hm = new HashMap <>();
         hm.put(1,"mno");
         hm.put(6,"fgh");
         hm.put(3,"asr");
         hm.put(5,"pcr");
         System.out.println(hm);
         hm.remove(6);
         hm.remove(3);
         System.out.println(hm);
      }
  }