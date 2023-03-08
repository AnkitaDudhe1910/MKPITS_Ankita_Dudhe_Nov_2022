/* Write a Java program to create a Stack and pop
   some elements from it. */

   import java.util.*;

     class Program_13 {

      public static void main(String [] args){

       Stack <Integer> st = new Stack <>();

       st.push(12);
       st.push(23);
       st.push(15);
       st.push(19);

       System.out.println(st);

       st.pop();

       System.out.println(st);
      }
  }