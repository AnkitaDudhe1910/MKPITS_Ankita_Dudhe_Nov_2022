/* Java program to find sum of naturals numbers*/

import java.util.Scanner;

class SumNaturals
{
  public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter sum of natural number");
     int n = sc.nextInt();

     int sum = n*(n+1);
     int sum_1 = sum/2 ;
     System.out.println("sum of naturals is : "+sum_1);
  }
}