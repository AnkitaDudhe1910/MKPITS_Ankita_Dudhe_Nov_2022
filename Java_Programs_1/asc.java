//How to print ASCII value in java.

import java.util.Scanner;

class asc
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);

    int as = c;

    System.out.println("ASCII value of "+c+" is "+as);
  }
}