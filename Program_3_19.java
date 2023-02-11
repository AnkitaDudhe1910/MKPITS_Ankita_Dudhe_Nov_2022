import java.util.Scanner;
class assignment
{
 void fun()
 {
 int a,b,c,mul;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter first value:");
 a =sc.nextInt();

 System.out.println("enter second value:");
 b =sc.nextInt();

 System.out.println("enter third value:");
 c =sc.nextInt();

 mul = a*b*c;

 System.out.println("multiplication of three number is: "+mul);

 }
}
class Program_3_19
{
  public static void main(String [] args)
  {
  assignment ob= new assignment();
  ob.fun();
  }
}