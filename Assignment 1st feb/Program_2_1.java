/* Write a Java  program that takes a number as input and print its multiplication table. */

import java.util.Scanner;

class Program_2_1
{
public static void main(String [] args)
{
     int multi;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter number");
  int num = sc.nextInt();
  for(int i=1; i<=10; i++)
  {
    multi = num*i;
    System.out.println(multi);
  }

  }
}