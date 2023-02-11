import java.util.Scanner;

class assignment{
int num1, num2, num3;

void set()
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter number 1");
 num1 = sc.nextInt();
 System.out.println("num1 : "+num1);

 System.out.println("enter number 2");
  num2 = sc.nextInt();
 System.out.println("num2 : "+num2);

 System.out.println("enter number 3");
  num3 = sc.nextInt();
 System.out.println("num3 : "+num3);
}

void valid()
{


 if((num1>20 && num1<50)||(num2>20 && num2<50)||(num3>20 && num3<50))
 {
   System.out.println("true");
 }
 else
 {
  System.out.println("false");
 }


}
}
class Program_12_19
{
public static void main(String [] args)
{
 assignment ob = new assignment();
 ob.set();
 ob.valid();
}
}