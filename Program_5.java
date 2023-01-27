// Write a java program that accepts a positive integer less than 500 and print out the sum of digits of this number.

import java.util.Scanner;

class assignment
{
   int num;
   void set()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter any number");
      num = sc.nextInt();
  if(num < 500)
      {
       System.out.println("num:"+num);
      }
      else
      {
       System.out.println("number not valid");
      }
    }
   void sum()
   {
	   int n1 = num%10;
	    num = num/10;
	   int n2 = num%10;
	    num = num/10;
	   int n3 = num%10;

	   int sum = n1+n2+n3;


   }
}
class Program_5
{
 public static void main(String [] args)
 {
   assignment ob = new assignment();
   ob.set();
   ob.sum();
 }
}