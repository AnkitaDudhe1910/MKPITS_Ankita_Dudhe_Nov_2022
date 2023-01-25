class one
{
 one()
 {
 }
 one(int x, int y)
 {
 System.out.println(x+" "+y);
 }
}
class two extends one
{
 two()
 {
  new one(4,7); //constructor calling without super keyword. for this default constructor is mandetory.
 }
}
class Program_4
{
public static void main(String[] args)
{
 two ob = new two();
}
}