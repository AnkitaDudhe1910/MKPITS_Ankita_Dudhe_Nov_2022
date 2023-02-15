/* Write a C program to calculate profit and loss on a transaction. */

import java.util.Scanner;

class Program_21_1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter actual price");
    int actualPrice = sc.nextInt();
    System.out.println("enter selling price");
    int sellingPrice = sc.nextInt();
    if( sellingPrice > actualPrice)
    {
      System.out.println(" person has profit on transaction");
    }
    else
    {
      System.out.println(" person has loss on transaction");
    }
  }
}