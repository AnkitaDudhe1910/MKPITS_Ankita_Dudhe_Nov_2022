/* Write a Java program to check if a given array of integers and length 2, contains 15 or 20. */

import java. util.Scanner;

class Program_17
{
   public static void main(String [] args)
   {
      int count = 0;
      Scanner sc = new Scanner(System.in);
      int [] a = new int [2] ;
      System.out.println("enter array");
      for(int i = 0;i<2;i++)
      {
        a[i] = sc.nextInt();
      }
      for(int i = 0; i<2;i++)
      {
        if(a[i]==15 || a[i]==20)
        {
           count++;
        }
      }
      if(count>0)
      {
      System.out.println("array does contains 15 or 20");
      }
      else
      {
      System.out.println("array does not contains 15 or 20");
      }
   }
}