class triangle
{
	int sum=0;
void tri()
{
for(int i=1;i<30;i++)
{

sum =sum+i;
System.out.println(sum);
}
}
}
class triangleExample
{
public static void main(String[] args)
{
triangle t = new triangle();
t.tri();
}
}