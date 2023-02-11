import java.util.Scanner;
class assignment
{
 int num;
 void set()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter a number");
  num = sc.nextInt();
  System.out.println("num:"+num);
 }
 void fun()
 {
  if(num%3==0)
  {
   System.out.println("num is multiple of 3");
  }
  else
  {
   if(num%7==0)
   {
   System.out.println("num is multiple of 7");
   }
   else
   {
   System.out.println("num is not multiple of 3 or 7");
   }

  }
 }
}
class Program_9_19
{
public static void main(String [] args)
{
assignment ob = new assignment();
ob.set();
ob.fun();
}
}