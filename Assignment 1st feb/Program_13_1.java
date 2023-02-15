/* Write a Java program to find the eligibility of admission for a professional course based on the following criteria:
   Marks in Maths >=65
   Marks in Phy >=55
   Marks in Chem>=50
  Total in all three subject >=180
  or
  Total in Math and Subjects >=140 */

  import java.util.Scanner;

  class Program_13_1
  {
    public static void main(String [] args)
    {

      Scanner sc = new Scanner(System.in);
      System.out.println("enter the marks of Math");
      int math = sc.nextInt();
      System.out.println("enter the marks of Physics");
      int Phy = sc.nextInt();
      System.out.println("enter the marks of Chemestry");
      int Chem = sc.nextInt();

      int total_marks = math+Phy+Chem;

      int sum1 = math+Phy;
      int sum2 = math+Chem;

      if(math>=65 && Phy>=55 && Chem>=50)
      {
        System.out.println("Srudent is eleigible to admission");
      }
      else
      {
        if(total_marks>=180)
        {
          System.out.println("Srudent is eleigible to admission");
        }
        else
        {
          if(sum1>=140 || sum2>=140)
          {
            System.out.println("Srudent is eleigible to admission");
          }
          else
          {
            System.out.println("Srudent is not eleigible to admission");
          }
        }
      }
    }
  }