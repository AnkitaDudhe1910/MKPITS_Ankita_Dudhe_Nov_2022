class Adddemo
{
int a, b, res1,res2;

 void set(int x,int y)
 {
  a=x;
  b=y;

 }
 void sum(Adddemo cob2,Adddemo cob3)
 {
 res1 = a+cob2.a+cob2.a;
 res2 = b+cob3.b+cob3.b;
 }
 void disp()
 {
 System.out.println(res1);
 System.out.println(res2);
 }

 }
  class One
 {
 public static void main(String [] args)
 {
  Adddemo ob1 = new Adddemo();
  Adddemo ob2 = new Adddemo();
  Adddemo ob3 = new Adddemo();

  ob1.set(12,13);
  ob2.set(15,15);
  ob3.set(20,25);

  ob1.sum(ob2,ob3);
  ob1.disp();
 }
 }