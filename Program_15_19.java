import java.util.Scanner;
class assignment
{
 int num1,  num2;
 void set()
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter number 1");
   num1 = sc.nextInt();
   System.out.println("num1:"+num1);
   System.out.println("enter number 2");
      num2 = sc.nextInt();
   System.out.println("num2:"+num2);

  }
  void fun()
   {
    if(num1 >40 && num1<50  )
    {
    System.out.println("number 1 is in the range of 40 to 50");
    }
    else
    {
       if(num2>40 && num2<50)
       {
       System.out.println("number 2 is in the range of 40 to 50");
       }
       else
       {
         if(num1>50 && num1<60)
         {
         System.out.println("number 1 is in the range of 50 to 60");
         }
         else
         {
          if(num2>50 && num2<40)
          {
          System.out.println("number 2 is in the range of 50 to 60");
          }
          else
          {
           System.out.println("none of the number is in the range of 40 to 50 or 50 to 60");
          }
         }
       }

}
 }

}
class Program_15_19
{
public static void main(String [] args)
{
assignment ob = new assignment();
ob.set();
ob.fun();

}
}