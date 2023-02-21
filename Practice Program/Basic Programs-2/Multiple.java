/* Read two integer and check they are multiplied or not.*/

import java.util.Scanner;

class Multiple
{
  public static void main(String [] args)
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter two integers");
	 int num1 = sc.nextInt();
	 int num2 = sc.nextInt();

	 int count1 = 0;
	 int count2 = 0;

	 for(int i=2;i<num1;i++)
	 {
		 if(num1%i==0)
		 {
			 count1++;
		 }
	 }
	 if(count1>0)
	 {
		 System.out.println(num1+" is multilied number");
	 }
	 else
	 {
		 System.out.println(num1+" is not multilied number");
	 }
	 for(int i=2;i<num2;i++)
	 	 {
	 		 if(num2%i==0)
	 		 {
	 			 count2++;
	 		 }
	   }
	    if(count2>0)
	   	 {
	   		 System.out.println(num2+" is multilied number");
	   	 }
	   	 else
	   	 {
	   		 System.out.println(num2+" is not multilied number");
	      }
  }
}