class one
{
 one(int x, int y)
 {
  System.out.println(x+" " +y);
 }
}
class two extends one
{
 two()
 {
	 //  int a = 14;   // error: call to super must be first statement in constructor

  super(5,7);  //constructor calling using super keyword.

  int a = 14;
  System.out.println(a);
 }
}
class Program_5
{
public static void main(String [] args)
{
 two ob = new two();
}
}