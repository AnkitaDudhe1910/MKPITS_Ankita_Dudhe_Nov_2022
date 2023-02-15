/* Write java program to find the larger from two given integers. However if the two integers
   have the same remainder when divided by 5, then the return the smaller integer. If the two
   integers are the same, return 0 */

import java.util.Scanner;

class Program_9
{
  public static void main(String [] args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter first integer");
	  int num1 = sc.nextInt();
	  System.out.println("enter second integer");
	  int num2 = sc.nextInt();
	  if(num1>num2)
	  {
		  System.out.println("first integer is greater");
		  int grt = num1;
		  int smrt = num2;
	  }
	  else
	  {
		  System.out.println("Second integeris greater");
		  int grt = num2;
		  int smrt = num1;
	  }
	  int rem_1 = num1%5;
	  int rem_2 = num2%5;
	  if(rem_1 == rem_2)
	  {
		  System.out.println("the two integers have the same remainder when divided by 5");
		 //  return smrt;
	  }
	  else
	  {
		  System.out.println("the two integers does not have the same remainder when divided by 5");
	  }
	  if(num1 == num2)
	  {
		  System.out.println("the two integers are the same");
		 // return 0;
	  }
	  else
	  {
		   System.out.println("the two integers are not the same");
	  }
  }
}