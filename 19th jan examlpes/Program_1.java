class one
{
 int a;
}
class two extends one  //single level inheritance
{
 void disp()
 {
  a = 12;
  System.out.println(a);
 }
}
class Program_1
{
public static void main(String [] args)
{
 two ob = new two();
 ob.disp();
}
}