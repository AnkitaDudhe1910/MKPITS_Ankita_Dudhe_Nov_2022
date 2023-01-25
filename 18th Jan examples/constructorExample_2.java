class constructordemo
{
    int a ;
  constructordemo(int x) //parameterized constructur.
   {
      a=x;
   }
  void disp()
   {
   System.out.println("a:"+a);
   }
}
class constructorExample_2
{
 public static void main(String[]args)
 {
   constructordemo demo1 = new constructordemo(5);
   constructordemo demo2 = new constructordemo(10);
   constructordemo demo3 = new constructordemo(15);
   demo1.disp();
   demo2.disp();
   demo3.disp();
 }
}