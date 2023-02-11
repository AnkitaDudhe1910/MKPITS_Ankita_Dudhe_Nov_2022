import java.util.Scanner;
class assignment
{
int num1, num2;
void set()
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter number 1");
 num1 = sc.nextInt();
 System.out.println(" num1: "+num1);

 System.out.println("enter number 2");
  num2 = sc.nextInt();
 System.out.println(" num2: "+num2);
}
void fun()
{

  if(num1>100 && num1<200)
  {
  System.out.println(" number 1 is within the range of 100 to 200");
  }
  else
  {
   System.out.println("  number 1 is not within the range of 100 to 200");
  }
if(num2>100 && num2<200)
     {
     System.out.println(" number 2 is within the range of 100 to 200");
     }
     else
     {
     System.out.println(" number 2 is not within the range of 100 to 200");
     }
}
}
class Program_11_19
{
public static void main(String[] args)
{
assignment ob = new assignment();
ob.set();
ob.fun();
}
}