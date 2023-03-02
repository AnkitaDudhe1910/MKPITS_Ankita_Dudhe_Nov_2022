/* Print all negative elements in an array. */

import java.util.Scanner;

class Negative
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter size of array");
    int size= sc.nextInt();
    int [] arr = new int [size];
    System.out.println("enter array");

    for(int i=0; i<size;i++)
    {
      arr[i] = sc.nextInt();
    }
    for( int i=0; i<size;i++)
    {
      if(arr[i]<0)
      {
        System.out.println("negative number in array is : "+arr[i]);
      }
    }
  }
}