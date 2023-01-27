// Write a java program to remove any negative sign in front of a number input  value (negative).

import java.util.Scanner;
import java.lang.Math;

class assignment
{
  int num;

  void negativeValue()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any negative value ");
    num = sc.nextInt();
    if(num < 0)
    {
    System.out.println(" negative input value is:"+num);
    System.out.println("positive value of negative input is : "+Math.abs(num));
    }
    else
    {
		System.out.println("number is not valid");
	}
  }
}
class Program_14
{
 public static void main(String [] args)
 {
   assignment ob = new assignment();
   ob.negativeValue();
 }
}