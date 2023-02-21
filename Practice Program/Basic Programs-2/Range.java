/* Write a program to ccepts an integer and check specified range where it belongs
   print error msg if the number -ve and greater than 80.*/

import java.util.Scanner;

class Range
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter an integer");
    int num = sc.nextInt();
    if(num>0 && num<80)
    {
      System.out.println("integer is in range");
    }
    else
    {
      System.out.println("Error");
    }
  }
}