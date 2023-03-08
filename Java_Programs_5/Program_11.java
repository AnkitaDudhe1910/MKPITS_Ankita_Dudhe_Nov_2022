/*Write a Java program to create a TreeSet and add 
  some elements to it. */

   import java.util.*;

     class Program_11 {

      public static void main(String [] args){
      
       TreeSet ts = new TreeSet();
       ts.add(27);
       ts.add(26);
       ts.add(23);
       ts.add(26);
       ts.add(30);
       
       System.out.println(ts);
      }
  }