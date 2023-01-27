import java.util.Scanner;
class  assignment
{
 int num, rev=0;
 void revNum()
 {
 Scanner sc =new Scanner(System.in);
 System.out.println("enter the number");
 num= sc.nextInt();
 while(num>0)
 {
  int n = num%10;
  rev = rev*10+n;
  num=num/10;
 }
 System.out.println("reverse of number is : "+rev);
 }
}
class Program_3
{
public static void main(String [] args)
{
 assignment ob = new assignment();
 ob.revNum();
}
}