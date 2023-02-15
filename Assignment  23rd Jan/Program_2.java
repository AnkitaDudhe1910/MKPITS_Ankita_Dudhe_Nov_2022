//Write a C program that accept two integers and return true if either one is 5 or their sum or difference is 5.

import java.util.Scanner;
import java.lang.Math;
class assignment
{
 int num1,num2,sum,diff;
  boolean flag = false;
 void fun()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter first number");
  num1 = sc.nextInt();
  System.out.println("enter second number");
  num2 = sc.nextInt();
  
 sum = num1+num2;
diff = Math.abs(num1 -num2);
System.out.println("sum:"+sum);
System.out.println("diff:"+diff);

if((num1 ==5) || (num2==5) || (sum==5) || (diff==5)){
 flag = true;
 System.out.println(flag);
}

 }
}
class Program_2{
public static void main(String[] args){
 
 assignment ob = new assignment();
 ob.fun();
}
}