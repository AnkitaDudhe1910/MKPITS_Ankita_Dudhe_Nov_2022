/* Write a java programming that accepts one seven digit number and seperates the number into its individual digits
 and print  the digits seperated from one another by two spaces each. */

import java.util.Scanner;

class assignment
{
 int num;
 boolean check = false;
 void fun()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter seven digit number");
  num = sc.nextInt();
  if(num < 9999999 && num > 999999)
  {
       int n1 = num%10;
	     num = num/10;
	     int n2 = num%10;
	     num = num/10;
	     int n3 = num%10;
	     num = num/10;
	     int n4 = num%10;
	     num = num/10;
	     int n5 = num%10;
	     num = num/10;
	     int n6 = num%10;
	     num = num/10;
	     int n7 = num%10;
	     num = num/10;

	     System.out.println( n7+"  "+n6+"  "+n5+"  "+n4+"  "+n3+"  "+n2+"  "+n1);

  }
  else
  {
   System.out.println("number not valid");
  }


 }
}
class Program_17
{
public static void main(String [] args)
{
  assignment ob = new assignment();
  ob.fun();
}
}