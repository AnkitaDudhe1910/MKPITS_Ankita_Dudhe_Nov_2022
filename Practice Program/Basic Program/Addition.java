/* Write a java program that accepts two integer from the user and calculate the sum of two integers.*/

import java.util.Scanner;

class Addition
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first integer");
    int a = sc.nextInt();
    System.out.println("enter second integer");
    int b = sc.nextInt();
    
    int sum = a+b;
    System.out.println("Sum of two integers is : "+sum);
    
  }
}