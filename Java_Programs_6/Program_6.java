/* Write a program to create new array from a given integers shifting all even numbers before all odd numbers.*/

import java.util.Scanner;

class Program_6{

  public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter length of array");
     int len = sc.nextInt();

     int [] arr1 = new int[len];//{1,2,3,4,5,6,7,8,9,10};

     int [] arr2 = new int[arr1.length];
      System.out.println("enter length of array");
       int count=0;
       for(int i=0;i<len;i++)
       {
		   arr1[i] = sc.nextInt();
	   }
       for(int i=0;i<arr1.length;i++)
       {
		   if(arr1[i]%2==0)
		   {
			   arr2[count] = arr1[i];
			   count++;
		   }
	   }
	   for(int i=0;i<arr1.length;i++)
	         {
	  		   if(arr1[i]%2!=0)
	  		   {
	  			   arr2[count] = arr1[i];
	  			   count++;
	  		   }
	   }
		for(int i=0;i<count;i++)
		{
			System.out.print(arr2[i]+" ");
		}
  }
}