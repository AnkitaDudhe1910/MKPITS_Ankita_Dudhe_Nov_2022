import java.util.Scanner;
class assignment
{
int num1 , num2;
void set()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter first number");
num1 = sc.nextInt();
System.out.println("num1 :" +num1);
System.out.println("enter second number");
num2 = sc.nextInt();
System.out.println("num2 :" +num2);
}
void fun()
{
 if(num1==30 || num2==30)
 {
  System.out.println("true");
 }
 else
 {

System.out.println("sum of two number is:"+sum);

   if(sum==30)
   {
   System.out.println("true");
   }

 }
}
}
class Program_7_19
{
public static void main(String[]args)
{
 assignment ob = new assignment();
 ob.set();
 ob.fun();
}
}