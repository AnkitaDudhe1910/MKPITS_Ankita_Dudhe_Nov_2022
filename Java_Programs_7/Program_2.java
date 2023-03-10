/* Write a java program to create new aray after replacingall the values 5 with 0 shifting all zeros to rigth direction. */

class Program_2
{
  public static void main(String [] args)
  {
    int [] arr = {5,2,3,5,6,5,4};
    int [] a = new int[arr.length];
    int count=0;

   for(int i=0;i<arr.length;i++)
   {
     if(arr[i]==5)
     {
       arr[i] = 0;
     }
   }
   for(int i=0;i<arr.length;i++)
   {
	   if(arr[i]!=0)
	   {
		   a[count] =arr[i];
		   count++;
	   }
   }
   for(int i=0;i<arr.length;i++)
   {
	   if(arr[i]==0)
	   {
		   a[count] =arr[i];
		   count++;
	   }
   }
   for(int i=0;i<arr.length;i++)
   {
      System.out.print(arr[i]+" ");
   }
   System.out.println(" ");
   for(int i=0;i<count;i++)
   {
      System.out.print(a[i]+" ");
   }
  }
}