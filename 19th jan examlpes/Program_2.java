class one
{
 int a;
 void set1()
 {
   a=12;
 }
 void disp1()
 {
  System.out.println(a);
 }
}
class two extends one
{
 int b;
  void set2()
  {
    b=14;
  }
  void disp2()
  {
   System.out.println(b);
 }
}
class three extends two  //multilevel inheritance
{
 int c;
  void set3()
  {
    c=15;
  }
  void disp3()
  {
   System.out.println(c);
 }
}
class Program_2
{
public static void main(String [] args)
{
 three ob = new three();
 ob.set1();
 ob.set2();
 ob.set3();
 ob.disp1();
 ob.disp2();
 ob.disp3();
}
}