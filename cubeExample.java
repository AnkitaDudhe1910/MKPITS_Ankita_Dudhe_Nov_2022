class cube
{
void cube()
{
for(int i=0;i<20;i++)
{
	int sum =i*i*i;
System.out.print(" "+sum);
}
}
}
class cubeExample
{
public static void main(String [] args)
{
cube c =new cube();
 c.cube();
}
}