import java.util.Scanner;
class assignment
{
 int num1, num2;
 void set()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter number 1");
  num1 = sc.nextInt();
  System.out.println("enter number 2");
  num2= sc.nextInt();
  System.out.println("num1 : "+num1);
  System.out.println("num2 : "+num2);
 }
 void fun()
 {
  if((num1 > 20 && num1 <50) || (num2 >20 && num2<50))
  {
   System.out.println("true");
  }
  else
  {
  System.out.println("false");
  }
 }

}
class Program_13_19
{
 public static void main(String[] args)
 {
 assignment ob = new assignment();
 ob.set();
 ob.fun();
 }
}