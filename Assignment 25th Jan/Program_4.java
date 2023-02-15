/* Write a C program to create a new array swapping the first
and last elements of a given array of integers and length will be least 1.*/
class Program_4
{
  public static void main(String [] args)
  {
     int [] arr = {14,31,16,42,23,20};
     int a = arr.length;
     int  temp = arr[0];
     arr[0] = arr[5];
     arr[5] = temp;
     for(int i =0;i<a;i++)
     {
     System.out.print(" "+arr[i]);
     }
  }
}