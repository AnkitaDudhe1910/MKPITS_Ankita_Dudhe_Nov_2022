/*  Write a Java  program to that takes three numbers(x,y,z) as input and print the output of (x+y).z and x.y + y.z. */

import java.util.Scanner;

class Program_4_1
{
 public static void main(String [] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the value of x,y,z");
   int x = sc.nextInt();
   int y = sc.nextInt();
   int z = sc.nextInt();

   int output_1 = (x+y)*z;

   int output_2 = x*y+y*z;

   System.out.println("Outputs are : "+ output_1 +"  " + output_2);

 }
}