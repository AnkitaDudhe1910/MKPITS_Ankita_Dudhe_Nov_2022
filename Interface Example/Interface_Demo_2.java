/*
  interface one   interface two
     \             /
      \           /
       \         /
    class three (class three implements one,two)
*/

interface one
{
 void set1();
 void disp1();
}
interface two
{
 void set2();
 void disp2();
}
class three implements one,two
{
@Override
public void set1()
{
 System.out.println(" first method interface one");
}

public void  disp1()
{
System.out.println(" second  method interface one");
}
public void set2()
{
 System.out.println(" first method interface two");
}

public void  disp2()
{
System.out.println(" second  method interface two ");
}
}

class Interface_Demo_2
{
public static void main(String [] args)
{
three ob = new three();
 ob.set1();
 ob.disp1();
 ob.set2();
 ob.disp2();
}
}
