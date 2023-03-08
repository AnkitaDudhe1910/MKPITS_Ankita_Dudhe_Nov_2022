/* Write a Java program to create a LinkedList and
   iterate over its elements. */

   import java.util.*;

     class Program_19 {
       public static void main(String [] args){

        LinkedList ll = new LinkedList();
        ll.add(12);
        ll.add(19);
        ll.add(21);
        ll.add(9);
       System.out.println(ll);
       System.out.println(ll.contains(12));
       System.out.println(ll.indexOf(21));

      }
  }