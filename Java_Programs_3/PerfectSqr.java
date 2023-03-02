/* Java program to check if given number is perfect square. */

import java.util.Scanner;

class PerfectSqr
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();

   int squ = num%10;

   if(squ==2 || squ == 3 || squ == 7 || squ == 8)
   {
	   System.out.println("number is not perfect square");
   }
   else
   {
	   System.out.println("number is  perfect square");
   }

  }
}