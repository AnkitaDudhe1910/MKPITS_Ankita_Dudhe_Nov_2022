/* Write a Java program to check whether an alphabet is a vowel or consonant. */

import java.util.Scanner;

class Program_20_1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any alphabet ");
    char c = sc.next().charAt(0);

    if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u')
    {
      System.out.println(c+" is vowel");
    }
    else
    {
      System.out.println(c+" is consonant");
    }
  }
}