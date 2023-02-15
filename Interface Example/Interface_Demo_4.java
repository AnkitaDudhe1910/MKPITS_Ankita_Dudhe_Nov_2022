/*
  interface one
      |
      |
      |
  interface two  (interface two extends one)
      |
      |
      |
   class three (class three implements two)
 */

interface one
{
 void set();

}
interface two  extends one
{
 void disp();

}
class three implements two
{

@Override
public void set()
{
 System.out.println(" first method interface one");
}

public void  disp()
{
System.out.println(" second  method interface two");
}

}

class Interface_Demo_4
{
public static void main(String [] args)
{
three ob = new three();
 ob.set();
 ob.disp();

}
}
