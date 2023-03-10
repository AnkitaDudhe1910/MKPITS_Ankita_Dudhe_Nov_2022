/* Write a java program to shift an element in left direction and return in new array. */

class Program_1
{
  public static void main(String [] args)
  {
    int [] arr = {2,3,5,6,4};

    int [] a = new int[arr.length];
       a[arr.length-1]= arr[0];

    for(int i=1;i<arr.length;i++)
    {

       	a[i-1]=arr[i];

	}

   for(int i=0;i<a.length;i++)
   {
     System.out.print(a[i]+" ");
   }
  }
}