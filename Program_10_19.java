import java.util.Scanner;
class assignment
{
 float temp1, temp2;

 void set()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter first temperature");
  temp1 = sc.nextFloat();
  System.out.println("temperature 1:"+temp1);

  System.out.println("enter second temperature");
  temp2 = sc.nextFloat();
  System.out.println("temperature 2:"+temp2);

 }
 void fun()
 {
  if(temp1 <0)
  {
  System.out.println("temperature 1 is less than 0");
 }
 else
 {
 System.out.println("temperature 1 is greater than 0");
 }
 if(temp2>100)
   {
   System.out.println("temperature 2 is greater than 100");
  }
  else
  {
  System.out.println("temperature 2 is less than 100");
 }
}
}
class Program_10_19
{
public static void main(String [] args)
{
assignment ob = new assignment();
ob.set();
ob.fun();
}
}