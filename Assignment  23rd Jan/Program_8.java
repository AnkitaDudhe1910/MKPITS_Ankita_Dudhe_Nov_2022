/* Write a c program to check three given integer and return true if one of them is 20 or more less than one of the others. */

import java.util.Scanner;

class Program_8
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first integer");
    int num1 = sc.nextInt();
    System.out.println("enter second integer");
    int num2 = sc.nextInt();
    System.out.println("enter third integer");
    int num3 = sc.nextInt();
    if(num1 == 20 || num2 == 20 || num3 == 20)
    {
      System.out.println("True, one of the number is equal to 20.");
    }
    else
    {
      System.out.println("False, one of the number is not equal to 20.");
    }
    if(num1 > num2 && num1>num3)
    {
      System.out.println("First integer is greater than others : " +num1);
    }
    else
    {
      if(num2>num3)
      {
          System.out.println("Second integer is greater than others  : "+num2);
      }
      else
      {
         System.out.println("Third integer is greater than others  : "+num3);
      }
    }
  }
}