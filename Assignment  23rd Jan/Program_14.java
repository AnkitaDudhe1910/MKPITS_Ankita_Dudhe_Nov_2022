/* Write a java program to reverse a given array of integers are length 5*/

import java.util.Scanner;

class Program_14
{
 public static void main(String[] args)
 {

   Scanner sc = new Scanner(System.in);
   int [] a = new int [5];
   System.out.println("enter array");
   for(int i = 0; i<5;i++)
   {
     a[i] = sc.nextInt();
   }
   try
   {
   for(int i = 4; i<=5;i--)
   {
      System.out.print( " "+a[i]);
   }

  } catch(Exception e){}

 }
}