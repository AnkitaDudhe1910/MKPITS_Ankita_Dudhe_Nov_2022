/* Write a program in java to accept a grade and declare the equivalent description.
Grade Description E Excellent V Very Good G Good A Average F Fail */

import java.util.Scanner;

class Program_23_1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Grade between E,V,G,A,F");
    char grade = sc.next().charAt(0);
    switch(grade)
    {
      case 'E':
          System.out.println(grade+" Excellent");
          break;
      case 'V':
          System.out.println(grade+" Very Good");
          break;
      case 'G':
          System.out.println(grade+" Good");
          break;
      case 'A':
          System.out.println(grade+" Average");
          break;
      case 'F':
          System.out.println(grade+" Fail");
          break;
      default:
          System.out.println("There are only five grades");
          break;
    }
  }
}