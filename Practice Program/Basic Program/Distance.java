/* Write a java program to calculate distance between the two point.*/

import java.util.Scanner;

class Distance
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter initial distance");
     int initial = sc.nextInt();
     System.out.println("enter final distance");
     int finaldis = sc.nextInt();

     int distance = finaldis - initial;
     System.out.println("distance between two point "+distance);
   }
}
