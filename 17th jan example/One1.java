class Adddemo1
{
private int a,b;

 void set(int x, int y)
 {
 a =x;
 b = y;
 }
 Adddemo1 sum(Adddemo1 cob1,Adddemo1 cob2)
 {
 Adddemo1 tempob = new Adddemo1();
  tempob.a = a+ cob1.a+ cob2.a;
  tempob.b = b+ cob1.b+ cob2.
 b;
  return tempob;
 }
 void disp()
 {
 System.out.println(a);
 System.out.println(b);

 }
}
 class One1
 {
 public static void main(String [] args)
 {
 Adddemo1 ob1 = new Adddemo1();
 Adddemo1 ob2 = new Adddemo1();
 Adddemo1 ob3 = new Adddemo1();
 Adddemo1 ob4 = new Adddemo1();
 ob1.set(12,13);
  ob2.set(14,15);
   ob3.set(16,17);
 ob4 = ob1.sum(ob2,ob3);
 ob4.disp();
 }
 }