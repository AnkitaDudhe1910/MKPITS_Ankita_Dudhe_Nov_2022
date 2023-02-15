/*
  interface one  class two
     \             /
      \           /
       \         /
    class three (class three extends two implements one)
*/

interface one
{
 void set1();
 void disp1();
}
class two
{
 void set2()
 {
	  System.out.println("hello");
 }
 void disp2()
 {
	 System.out.println("Bye");
 }
}
class three extends two implements one
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
@Override
 void set2()
{
 System.out.println(" first method class two");
}

 void  disp2()
{
System.out.println(" second  method class two ");
}
}

class Interface_Demo_3
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
