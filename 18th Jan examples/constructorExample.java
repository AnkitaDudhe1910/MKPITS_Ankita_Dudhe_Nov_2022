class costructordemo
{
costructordemo() //default constructor
   {
   System.out.println("constructor called");
    }
}
class constructorExample
{
  public static void main(String[] args)
  {
    costructordemo demo1 = new costructordemo();
    costructordemo demo2 = new costructordemo();
    costructordemo demo3 = new costructordemo();
  }
}