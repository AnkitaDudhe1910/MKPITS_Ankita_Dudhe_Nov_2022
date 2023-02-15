/* Write a C program to read the age of a candidate and determine whether it is eligible for casting his/her own vote.*/

import java.util.Scanner;

class Program_9_1
{
 public static void main(String [] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter your age");
  int age = sc.nextInt();
  if(age >=18)
  {
   System.out.println("you are eligible for voting");
  }
  else
  {
   System.out.println("you are not eligible for voting");
  }
 }

}