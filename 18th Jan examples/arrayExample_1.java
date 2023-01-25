class arrayDemo
{
 void fun()
 {
  int [] a = {1,2,3,4,5};
  int [] b ;
  b=a; //copy one array to another array.
  for(int v: b)
  {
  System.out.println("array :"+v);
  }
 }
}
class arrayExample_1
{
 public static void main(String [] args)
 {
  arrayDemo demo = new arrayDemo();
  demo.fun();
 }
}