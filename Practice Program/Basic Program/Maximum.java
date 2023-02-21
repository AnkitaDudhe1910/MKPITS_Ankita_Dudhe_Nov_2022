/* Writes a java program that accepts 3 integers and find the maximum of three. */

import java.util.Scanner;

class Maximum 
{
 public static void main(String [] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter first number");
   int a = sc.nextInt();
   System.out.println("enter seconnd number");
   int b = sc.nextInt();
   System.out.println("enter third number");
   int c = sc.nextInt();
   if(a>b && a>c)
   {
     System.out.println("Maximum number is : "+a);
   }
   else
   {
     if(b>c)
       {
         System.out.println("Maximum number is : "+b);
       }
       else
       {
          System.out.println("Maximum number is : "+c);
       }
   }
 }
}