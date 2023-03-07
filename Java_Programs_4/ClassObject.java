/* Program to demonstrate the creation of a class and object in Java. */

class ClassObject
{
  int c = 0;
  int sum(int a, int b)
  {
    c = a+b;
    System.out.println(c);
    return c;
  }
  public static void main(String [] args)
  {
    ClassObject co = new ClassObject ();
    co.sum(10,30);

  }
}