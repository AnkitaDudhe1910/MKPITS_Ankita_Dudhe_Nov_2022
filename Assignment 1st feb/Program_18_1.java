/* Write a Java program to check whether a triangle can be formed by the given value for the angles. */

import java.util.Scanner;

class Program_18_1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first angle");
    int angle_1 = sc.nextInt();
    System.out.println("enter the second angle");
    int angle_2 = sc.nextInt();
    System.out.println("enter the third angle");
    int angle_3 = sc.nextInt();

    int total_angle = angle_1+angle_2+angle_3;

    if(total_angle == 180)
    {
      System.out.println("the triangle can be formed ");
    }
    else
    {
     System.out.println("the triangle can not be formed ");
    }

   }
}