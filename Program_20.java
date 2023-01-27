// Write a java programming loooping to produce the tables of input value.

import java.util.Scanner;
class assignment
{
   int num;
   void table()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      num = sc.nextInt();
      for(int i=1;i<=10;i++)
      {
        int tab = num*i;
        System.out .println(tab);
      }
   }
}
class Program_20
{
  public static void main(String [] args)
  {
    assignment ob = new assignment();
    ob.table();
  }
}