/* Write a C program to create a new array from a given array of integers shifting all
  zeros to left direction. */

  import java.util.Scanner;

  class Program_10
  {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter length of array");
      int len = sc.nextInt();
      int [] arr1 =new int[len];
      int [] arr2 = new int[arr1.length];
      int count=0;
       System.out.println("enter array");
       for(int i=0;i<len;i++)
       {
		   arr1[i]=sc.nextInt();
	   }
      for(int i=0;i<len;i++)
      {
        if(arr1[i]==0)
        {
          arr2[count] = arr1[i];
          count++;
        }
      }
      for(int i=0;i<len;i++)
        {
          if(arr1[i]!=0)
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