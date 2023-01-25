class statvariable
{
 static int a;
 void set()
 {
 a++;
 }
 void disp()
 {
 System.out.println(a);
 }
 }

 class stat
 {
 public static void main(String [] args)
 {
 statvariable ob1 = new statvariable();
 statvariable ob2 = new statvariable();
statvariable ob3 = new statvariable();

ob1.disp();
ob2.disp();
ob3.disp();

statvariable.a = 13;

ob1.disp();
ob2.disp();
ob3.disp();
 }
 }