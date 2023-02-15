/* Write a C program to check whether a triangle is Equilateral, Isosceles or Scalene. */

import java.util.Scanner;

class Program_14_1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the one side of triangle");
    int x = sc.nextInt();
    System.out.println("enter the second side of triangle");
    int y = sc.nextInt();
    System.out.println("enter the third side of triangle");
    int z = sc.nextInt();
    if(x==y && x==z && y==z)
    {
       System.out.println("the triangle is Equilateral ");
    }
    else
    {
       if(x==y || x==z || y==z)
       {
         System.out.println("the triangle is Isosceles ");
       }
       else
       {
         System.out.println("the triangle is Scalene ");
       }
    }
  }
}