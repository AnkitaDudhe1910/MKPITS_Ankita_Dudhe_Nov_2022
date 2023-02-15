/* Write a java program to find the largest value from first, last, and middle elements of a
given array of integers of odd length (atleast 1). */

class Program_7
{
  public static void main(String[] args)
  {
     int [] arr = { 12,45,25,65,36};
     if(arr[0]>arr[2] && arr[0]> arr[4])
     {
        System.out.println("largest value from first, last, and middle elements is : "+ arr[0]);
     }
     else
     {

       if(arr[2] > arr[4])
       {
         System.out.println("largest value from first, last, and middle elements is : "+ arr[2]);
       }
       else
       {
         System.out.println("largest value from first, last, and middle elements is : "+ arr[4]);
       }
     }
  }
}
