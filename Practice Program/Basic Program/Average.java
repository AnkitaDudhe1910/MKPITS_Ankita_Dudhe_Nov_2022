/* Write a java program to calculate bikes average consumption from the given total distance (int value)
   travelled in km and spend fuel(in lits, float number - 2 decimal points) */

 import java.util.Scanner;

 class Average
 {
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter total distance in km");
     int dist = sc.nextInt();
     System.out.println("enter spend fuel in liters");
     float fuel = sc.nextFloat();

     float avg = dist/fuel;
     System.out.println("bikes average consumption from the given total distance is:"+avg);
   }
 }
