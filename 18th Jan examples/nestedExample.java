class nestedOne
{
	int b=7;
 void disp_1()
 {
 System.out.println(" nested one called");
 //System.out.println(a);                 //D:\OWNER\Desktop\Java_Programs\nestedExample.java:7: error: cannot find symbol
                                          //System.out.println(a);
                                            //            ^
                                         //symbol:   variable a
 nestedTwo obj = new nestedTwo();
 obj.disp_2();
 }
 class nestedTwo
 {
	 int a =12;
 void disp_2()
 {
 System.out.println(" nested two called" );
 System.out.println(""+b);
 }
 }
}
class nestedExample
{
 public static void main(String [] args)
 {
  nestedOne net = new nestedOne();
  net.disp_1();
 }
}