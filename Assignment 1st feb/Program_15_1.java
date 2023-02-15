/* Write a C program to read roll no, name and marks of three subjects and calculate
   the total, percentage and division. */

import java.util.Scanner;

class Program_15_1
{
  public static void main(String [] args)
  {
	  int outOf = 300;
	  int total;
	  float percent ;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your roll number");
	int roll_num = sc.nextInt();
	System.out.println("enter your name");
	String name = sc.next();
	System.out.println("enter your marks number out of 100");
	System.out.println("Maths :");
	int marks_math = sc.nextInt();
	System.out.println("Physics :");
	int marks_phy = sc.nextInt();
	System.out.println("Chemestry :");
	int marks_chem = sc.nextInt();

    total = marks_math + marks_phy + marks_chem ;

	percent = (total*100)/outOf;

	System.out.println("Roll No. : "+roll_num +" Name : "+name +"  total pecentage are : "+percent +"%");

  }
}