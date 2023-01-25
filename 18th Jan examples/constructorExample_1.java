import java.util.Scanner;
class constructordemo
{
    int a;

 constructordemo() // non argument constructor
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter number");
     a = sc.nextInt();
    }
    void disp()
    {
     System.out.println(" a= "+a);
    }
}
class constructorExample_1
{
public static void main(String [] args)
    {
     constructordemo demo1 = new constructordemo();
     constructordemo demo2 = new constructordemo();
     constructordemo demo3 = new constructordemo();
     demo1.disp();
     demo2.disp();
     demo3.disp();
    }
}