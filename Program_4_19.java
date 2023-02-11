import java.util.Scanner;
class assignment
{
   int num, rev, temp;
   void set()
   {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter five digit number");
   num = sc.nextInt();
   System.out.println("num:"+num); 
   }
   void fun()
   {
    temp = num;
    int n1 = num%10;
    num = num/10;
    int n2 = num%10;
    num = num/10;
    int n3 = num%10;
    num = num/10;
    int n4 = num%10;
    num = num/10;
    int n5 = num%10;
    
    rev = n1*10000+n2*1000+n3*100+n4*10+n5;
    System.out.println("rev : "+rev);
   }
    void disp()
    {
     if(rev == temp)
     {
       System.out.println(" number is palindrome");
     }
     else
     {
     System.out.println("number is not palindrome");
     }
    }
   
}
class Program_4_19
{
 public static void main(String [] args)
 {
 assignment ob = new assignment();
 ob.set();
 ob.fun();
 ob.disp();
 }
}