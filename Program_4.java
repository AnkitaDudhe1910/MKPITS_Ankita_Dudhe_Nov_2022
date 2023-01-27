//write a java program that accepts 4 real numbers from the keyboard and print out the difference of the maximum and minimum values of these four numbers.

import java.util.Scanner;

class assignment
{
 int num1, num2, num3, num4, Max, Min;

 void set()
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter first number");
 num1 = sc.nextInt();
 System.out.println("enter second number");
 num2 = sc.nextInt();
 System.out.println("enter third number");
 num3 = sc.nextInt();
 System.out.println("enter fourth number");
 num4 = sc.nextInt();
 }

 void fun()
 {
  if(num1 > num2 && num1 > num3 && num1 > num4)
  {
     Max = num1;
  }
  else
  {
  if(num2 > num3 && num2 > num4)
  {
     Max =num2;
  }
  else
  {
  if(num3 > num4)
  {
   Max = num3;
  }
   else
   {
   Max = num4;
   }
  }
  }
  if(num1 < num2 && num1 < num3 && num1 < num4)
  {
	   Min = num1;
  }
  else
  {
	  if(num2 < num3 && num2 < num4 )
	  {
		  Min = num2;
	  }
	  else
	  {
		  if(num3 < num4)
		  {
			  Min = num3;
		  }
		  else
		  {
			  Min = num4;
		  }
	  }
 }

    int diff = Max - Min;

    System.out.println("Difference of Maximum and minimum number is :"+diff);
 }
}
class Program_4
{
public static void main(String [] args)
{
 assignment ob = new assignment();
 ob.set();
 ob.fun();
}
}