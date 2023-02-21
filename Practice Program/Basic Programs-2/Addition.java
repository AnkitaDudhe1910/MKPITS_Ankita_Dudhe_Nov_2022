/* Accepts 5 numbers and sum of all odd values between them. */

import java.util.Scanner;

class Addition
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 number ");
		int sum =0;
      for(int i=0; i<5;i++)
	   {
		   int num = sc.nextInt();
		   if(num%2!=0)
		   {
			   sum = sum+num;
		   }
	   }
	   System.out.println("sum of odd number is : "+sum);
	}
}