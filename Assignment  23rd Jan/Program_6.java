/* Write a java program to check if it is possible to add two integers to get the third integer from
   three given integers. */

   import java.util.Scanner;

class Program_6
{
  public static void main(String [] args)
  {
	  int num1 = 25, num2 = 35, num3 = 60;
	  int sum = num1+num2;
	  if(sum == num3)
	  {
		  System.out.println("Yes, it is possible");
	  }
	  else
	  {
		  System.out.println("No, it is not possible");
	  }
  }
}