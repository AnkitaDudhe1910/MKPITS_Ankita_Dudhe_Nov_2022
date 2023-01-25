// method overriding
class one
{
void disp()
{
System.out.println("Hello");
}
}
class two extends one
{

 void disp()
 {
	 super.disp();
 System.out.println("Hellooooooo");
}
}
class Program_3
{
public static void main(String[] args)
{
 two ob = new two();
 ob.disp();
}
}