/* Write a Java  program to print on screen the output of adding, subtracting,
 multiplying and dividing of two numbers which will be entered by the user.*/

 import java.util.Scanner;
 import java.lang.Math;

 class assignment
 {
   int num1, num2;
   int sum, diff, multi;
   double div;

  void set()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number ");
    num1 = sc.nextInt();
    System.out.println("enter first number ");
    num2 = sc.nextInt();
  }
  void add()
  {
    sum = num1+num2;
    System.out.println("Addition : "+sum);
  }
  void sub()
    {
    diff = Math.abs(num1-num2);
     System.out.println("Substraction : "+diff);
  }
  void mul()
  {
   multi = num1*num2;
   System.out.println("Multiplication: "+multi);
  }
  void divi()
    {
     if(num1>num2)
     {
       div = num1/num2;
       System.out.println("Division is: "+div);
     }
     else
     {
      div = num2/num1;
      System.out.println("Division is: "+div);
     }
  }
 }
 class Program_6
 {
   public static void main(String [] args)
   {
     assignment ob = new assignment();
     ob.set();
     ob.add();
     ob.sub();
     ob.mul();
     ob.divi();
   }
 }