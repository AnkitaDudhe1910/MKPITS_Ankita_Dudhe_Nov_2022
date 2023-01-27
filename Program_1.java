import java.util.Scanner;
class assignment
{
 int a, b;
 void setValue()
 {
 Scanner sc = new Scanner(System.in);
    System.out.println("enter value of a");
    a = sc.nextInt();


    System.out.println("enter value of b");
   b = sc.nextInt();
   System.out.println("a="+a+" "+"b="+b );
 }
 void swapNum()
 {
   a= a+b;
   b= a-b;
   a= a-b;
   System.out.println("a:"+a);
   System.out.println("b:"+b);
 }
}
class Program_1
{
public static void main(String[] args)
{
 assignment ob = new assignment();
 ob.setValue();
 ob.swapNum();
}
}