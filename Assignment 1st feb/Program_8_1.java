/* Write a C program to find whether a given year is a leap year or not. */

import java.util.Scanner;

class Program_8_1
{
 public static void main(String [] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter year");
  int year = sc.nextInt();
  if(year%4 ==0)
  {
    System.out.println("This "+year+" year is leap is year");
  }
  else
  {
    System.out.println("This "+year+" year is not leap is year");
  }
 }
}