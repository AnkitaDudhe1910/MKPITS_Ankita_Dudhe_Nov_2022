class staticmethod
{
int a;
static int b;
static void set(int c)
{
b=c;
}
void disp()
{
System.out.println(b);
System.out.println(a);
}
}
class statMethod
{
public static void main(String[] args)
{
staticmethod ob1 = new staticmethod();
staticmethod.set(10);
ob1.disp();
}
}