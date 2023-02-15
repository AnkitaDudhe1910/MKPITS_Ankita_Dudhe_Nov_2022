import java.util.Scanner;
class ArrayFromUser
{

  	public static void main(String [] args)
  	{
		int sum=0;
  	  Scanner sc  = new Scanner(System.in);
  	  System.out.println("enter size of array");
  	  int size = sc.nextInt();


  	  int[] arr = new int[size];
  	System.out.println("Enter the elements of the array:");

 for(int i=0;i<size;i++)
 {
	  arr[i] = sc.nextInt();
	  sum = sum +arr[i];

 }
 for(int i=0;i<size;i++)
  {
 	  System.out.println(arr[i]+" ");

 }
 System.out.println(sum);
}
}