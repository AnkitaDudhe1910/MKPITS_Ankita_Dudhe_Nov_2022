import java.util.Scanner;
class assignment
{
 int num1, num2;
 void set()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter first number");
  num1 = sc.nextInt();
  System.out.println("num1:"+num1);
  System.out.println("enter second number");
  num2 = sc.nextInt();
  System.out.println("num2:"+num2);
 }
 void largeValue()
 {
  if(num1>num2)
  {
   System.out.println("num1 is greater:"+num1);
  }
  else
  {
  System.out.println("num2 is greater:"+num2);
  }

 }
void inRange()
 {
  if((num1 >20 && num1<30) || (num2 >20 && num2<30))
  {
   System.out.println(" one of the number is in the range of 20 to 30");
  }

  else
  {
   System.out.println(" 0");
   }

 }
}
class Program_16_19
{
public static void main(String[] args)
{
 assignment ob = new assignment();
 ob.set();
 ob.largeValue();
 ob.inRange();
}
}