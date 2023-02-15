/* Write a java program to check if y is greater than x, and z is greater than y from three given integers x,y,z. */

import java.util.Scanner;

class Program_7
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter x value");
    int x = sc.nextInt();
    System.out.println("enter y value");
    int y = sc.nextInt();
    System.out.println("enter z value");
    int z = sc.nextInt();
    if(y>x && z>y)
    {
       System.out.println("z is greater than x and y");
    }
    else
    {
      if(y>x)
      {
        System.out.println("y is greater than x");
      }
      else
      {
        System.out.println("x is greater than y");
      }
    }

  }
}