/* Write a java programming that accepts principal amount rate of interest
and days for a loan and calculate the simple interest for the loan, using the following formula. */

import java.util.Scanner;

class assignment
{
 int principal;
 float rate;
 int year ;
 int days;
 double simple_intrest;
 void fun()
 {
   Scanner sc = new Scanner(System.in);

   System.out.println("enter principal amount");
   principal = sc.nextInt();

   System.out.println("enter rate of interest");
   rate = sc.nextFloat();

   System.out.println("enter year for a loan");
   year = sc.nextInt();

   days = year*365;

   simple_intrest = (principal* rate*days)/100;
   System.out.println("simple interest is:"+simple_intrest);

 }
}
class Program_19
{
  public static void main(String [] args)
  {
    assignment ob = new assignment();
     ob.fun();
  }
}