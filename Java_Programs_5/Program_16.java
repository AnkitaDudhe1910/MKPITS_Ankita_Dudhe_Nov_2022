/* Write a Java program to create an ArrayList and 
   remove some elements from it. */

   import java.util.*;

     class Program_16 {
       public static void main(String [] args){
       
       ArrayList al = new ArrayList();
        
        al.add(3);
        al.add(5);
        al.add(6);
        al.add(1);
        
        System.out.println(al);
        
        al.remove(3);
        
        System.out.println(al);
      }
  }