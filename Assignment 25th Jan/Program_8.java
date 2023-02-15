/*Write a C program to count even number of elements in a given array of integers.*/
class Program_8
{
  public static void main(String [] args)
  {
	  int [] arr ={2,16,5,3,8,9,10};
	  int count = 0;
	  for(int i =0;i<arr.length;i++)
	  {
		   if(arr[i]%2 == 0)
		   {
			   count ++;
		   }
	  }
	  System.out.println("total even elemts in array are: "+count);
  }

}