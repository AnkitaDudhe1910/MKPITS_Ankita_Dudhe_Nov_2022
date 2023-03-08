/* Write a Java program to create a HashSet and remove 
   some elements from it. */

   import java.util.*;

     class Program_15 {
       public static void main(String [] args){
       
        HashSet hs = new HashSet();
        
        hs.add(3);
        hs.add(5);
        hs.add(6);
        hs.add(1);
        
        System.out.println(hs);
        
        hs.remove(6);
        
        System.out.println(hs);
      }
  }