/* Write a C program to accept the height of a person in centimeter and categorize the person according to their height. */

import java.util.Scanner;

class Program_11_1
{
 public static void main(String[] args)
 {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter height in cm");
	  int height = sc.nextInt();
	  if(height < 150)
	  {
		  System.out.println("Short");
	  }
	  else
	  {
		  if(height >=150 && height <=165)
		  {
			  System.out.println("Average");
		  }
		  else
		  {
			  if(height >=166 && height <= 194)
			  {
				  System.out.println("Tall");
			  }
			  else
			  {
				  if(height>195)
				  {
					  System.out.println("Abnormal");
				  }
			  }
		  }
	  }
 }

}