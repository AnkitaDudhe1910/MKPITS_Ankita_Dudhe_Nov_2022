/* Write a Java program that takes a number as input and then displays a rectangle of 3 columns
   wide and 5 rows tall using that digit. */

  import java.util.Scanner;

class Program_6_1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    for(int i=0;i<5;i++)
    {
      if(i==0 || i==4)
      {
         System.out.println(" "+num+" "+num+" "+num);
      }
      else
      {
       System.out.println(" "+num+"   "+num+" ");
      }
    }

  }
}