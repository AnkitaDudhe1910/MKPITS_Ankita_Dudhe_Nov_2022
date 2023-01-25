class arithmetic
{
int sum=1;

/*void sum ()
{
 System.out.println(sum);
for(int i=0;i<20;i++)
{
 sum = sum+3;
 System.out.println(sum);
}

}*/
void sum ()
{

for(int i=1;i<20;i=i+3)
{

 System.out.println(i);
}

}
}
class arithmeticExample
{
public static void main(String[]args)
{
arithmetic ar1 = new arithmetic();
ar1.sum();
}
}