
//Write a C program to compute the sum of the two given integers. If the sum is in the range 10..20 inclusive return 30.

import java.util.Scanner;
class assignment
{
	int num1, num2, sum;
	int fun()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter first number");
		 num1 = sc.nextInt();
		 System.out.println("enter seconf number");
		 num2 = sc.nextInt();

		 sum = num1+num2;
		 System.out.println("sum:"+sum);

		 if(sum>10 && sum<20)
		 {
			  System.out.println("30");
			  return 30;
		 }
		 else
		 {
			 System.out.println("not in range");
		}
          return 0;
	}
	}

class Program_1
{
public static void main(String[] args){

assignment ob = new assignment();
ob.fun();

}
}