//Write a C program to create an array taking two middle elements from a given array of integers of length even.

class assignment
{
  int [] arr = {1,5,9,8,4};

  void fun()
  {
  for(int i = 1; i< arr.length;i++)
  {
     System.out.println(arr[i]);
     if(arr[i]%2==0)
     {
      System.out.println(arr[i]);
     }
  }
 }
}
class Program_2
{
  public static void main(String [] args)
  {
     assignment ob = new assignment();
     ob.fun();
  }
}
