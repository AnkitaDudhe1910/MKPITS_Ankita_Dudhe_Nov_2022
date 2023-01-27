// Write a java programming that reads in two integers and check whether the first integer is a multiple of the second integer.

import java.util.Scanner;

class assignment
{
  int num1, num2;
  void fun()
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter number");
    num1 = sc.nextInt();
    
    System.out.println("enter number");
    num2 = sc.nextInt();
    
    if(num1%num2==0)
    {  
      System.out.println("first integer is a multiple of the second integer");
    }
    else
    {
     System.out.println("first integer is not a multiple of the second integer");
    }
    
  }
}
class Program_15
{
public static void main(String [] args)
{
  assignment ob = new assignment();
  ob.fun();
}
}