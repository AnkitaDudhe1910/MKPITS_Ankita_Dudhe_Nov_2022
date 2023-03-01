/* Get aray imput in java */

import java.util.Scanner;

class ArrayAvg
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int size = sc.nextInt();

    int [] arr = new int [size];
    System.out.println("enter array");
    int sum=0;
    int avg;
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++)
     {
      sum = sum+arr[i];
    }
    avg = sum/size;

    System.out.println("average of array is : "+avg);
  }
}