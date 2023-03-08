/* Write a Java program to create a PriorityQueue and
   remove some elements from it. */

   import java.util.*;

     class Program_21 {
       public static void main(String [] args){

       PriorityQueue pq = new PriorityQueue();
       pq.add(20);
       pq.add(12);
       pq.add(23);
       pq.add(11);

       System.out.println(pq);
       pq.remove(12);
        System.out.println(pq);

      }
  }