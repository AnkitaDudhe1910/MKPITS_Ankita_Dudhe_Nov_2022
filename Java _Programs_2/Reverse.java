/* Reverse in number in java.*/

import java.util.Scanner;

class Reverse
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    int a=0;
    while(num >0)
    {
      int b = num%10;

      a = (a*10)+b;

      num=num/10;

    }
    System.out.println("Reverse number is:"+a);
  }
}