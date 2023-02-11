import java.util.Scanner;
class assignment
{
	int n,sub;
void set()
{

 Scanner sc =new Scanner(System.in);
 System.out.println("enter the value of n");
 n=sc.nextInt();
 }
 void fun()
 {
  sub = n-51;
  if(n>51)
  {
   sub= sub*3;
   System.out.println(sub);
  }
  else
  {
  System.out.println(sub);
  }
 }
}
class Program_6_19
{
public static void main(String[]args)
{
assignment ob = new assignment();
ob.set();
ob.fun();
}
}