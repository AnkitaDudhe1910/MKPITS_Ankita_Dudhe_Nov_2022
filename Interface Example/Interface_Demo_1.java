/*
  interface one
       |
       |
       |
    class two  (class two implements one)
*/

interface one
{
 void set();
 void disp();
}
class two implements one
{
@Override
public void set()
{
 System.out.println(" first method");
}

public void  disp()
{
System.out.println(" second  method ");
}
}

class Interface_Demo_1
{
public static void main(String [] args)
{
 two ob = new two();
 ob.set();
 ob.disp();
}
}
