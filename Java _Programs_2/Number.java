/* Java program to check if a number is positive or negative.*/

import java.util.Scanner;

class Number
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    if(num >0)
    {
      System.out.println("number is positive");
    }
    else
    {
     if(num <0)
     {
      System.out.println("number is negative");
     }
     else
     {
     System.out.println("number is zero");
     }
    }
  }
}