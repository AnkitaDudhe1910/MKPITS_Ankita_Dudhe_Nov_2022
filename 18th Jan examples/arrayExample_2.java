class arraydemo
{
void fun()
{
 // int ar[]=new int[3]; //array with size
 int d1[][]={           //array with values.
  {1,2,3},{4,5,6}
             };
 int d2[][]= new int[2][3]; //with size declaration

for(int i=0;i<d1.length;i++)
{
  for(int j=0;j<d1.length;j++)
  {
   System.out.println(d1[i][j]);
  }
}
}
}
class arrayExample_2
{
public static void main(String[] args)
{
 arraydemo demo = new arraydemo();
 demo.fun();
}
}