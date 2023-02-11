import java.util.Scanner;
class assignment
{
  void fun()
  {
   int a, b, sum;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter value of a");
   a = sc.nextInt();
    System.out.println("enter value of b");
   b = sc.nextInt();
   if(a==b)
   {
    sum = (a+b)*3;
    System.out.println(sum);
   }
   else
   { 
   sum=a+b;
   System.out.println(sum);
   }
  }
}
class Program_5_19
{
public static void main(String[] args)
{
assignment ob = new assignment();
ob.fun();
}
}