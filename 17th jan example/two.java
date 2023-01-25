class adddemo
{
static int b;

void set()
{
b++;
}
void disp()
{
System.out.println(b);
}
}
class two
{
public static void main(String[] args)
{
adddemo ob1 = new adddemo();
adddemo ob2 = new adddemo();
adddemo ob3= new adddemo();
ob1.disp();
ob2.disp();
ob3.disp();

adddemo.b=12;
ob1.disp();
ob2.disp();
ob3.disp();

}
}