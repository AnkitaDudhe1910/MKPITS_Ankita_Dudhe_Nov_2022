/* Write a Java program to create a HashSet and check 
   if an element exists in it. */

   import java.util.*;

     class Program_20 {
       public static void main(String [] args){

        HashSet hs = new HashSet();
        hs.add(5);
        hs.add(2);
        hs.add(9);
        System.out.println(hs);
        System.out.println(hs.contains(9));
        System.out.println(hs.contains(3));
      }
  }