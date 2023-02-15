/* Write a Java  program that takes an age (for example 20) as input and prints something as "You look older than 20". */

import java.util.Scanner;

class Program_5_1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age");
    int age = sc.nextInt();
    System.out.println("You look older than "+age);
  }
}