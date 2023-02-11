import java.util.Scanner;
class assignment
{
 int num1, num2;
 void set()
 {
 Scanner sc = new Scanner(Syste
 m.in);
 System.out.println("enter first number ");
 num1 =sc.nextInt();
 System.out.println("enter second number ");
 num2 =sc.nextInt();
 }
 void lastDigit()
 {
  int ldigit_1 = num1%10;
  int ldigit_2 = num2%10;
  System.out.println(" last digit of num1 is:"+ldigit_1);
  System.out.println(" last digit of num2 is:"+ldigit_2);

  if(ldigit_1==ldigit_2)
  {
  System.out.println(" last digit of num1 and num2 are same");
  }
  else
  {
  System.out.println(" last digit of num1 and num2 are not same");
  }
 }

}
class Program_17_19
{
public static void main(String[] args)
{
 assignment ob = new assignment();
 ob.set();
 ob.lastDigit();
}
}