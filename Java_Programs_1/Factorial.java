// Factorial in java

import java.util.Scanner;

class Factorial
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    for(int i=num;i>1;i--)
    {
      num = num*(i-1);
   //  System.out.println(num);
    }
     System.out.println(num);
  }
}