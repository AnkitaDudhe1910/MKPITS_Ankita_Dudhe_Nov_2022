/* Write a Java program to check a given array of integers and return true if  every 5
  that appears in the array is next to another 5. */

  import java.util.Scanner;

  class Program_5{
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int count=0;
      System.out.println("enter length of array");
      int len = sc.nextInt();
      int [] arr = new int[len];
       System.out.println("enter array");
      for(int i=0;i<len;i++)
      {
        arr[i] = sc.nextInt();
      }
      try{
     for(int i=0;i<len;i++)
      {
       if(arr[i]==5 && arr[i+1]==5){

	       count++;
         }
      }
  }
  catch(Exception e){}

      if(count > 0)
      {
		  System.out.println("true");
	  }
	  else
	  {
		  System.out.println("false");
	  }
    }
  }