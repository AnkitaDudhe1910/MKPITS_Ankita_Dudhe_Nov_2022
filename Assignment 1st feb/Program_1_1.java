/* Write a C program to check a given array (length will be atleast 2) of integers and
   return true if there are two values 15, 15 next to each other. */

   import java.util.Scanner;

class Program_1_1
{
  public static void main(String [] args)
  {
    boolean check = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array");
    int size = sc.nextInt();
    int [] arr = new int[size];
    System.out.println("enter array");
    for(int i=0;i<size;i++)
    {
      arr[i] = sc.nextInt();
    }
     for(int i=0;i<size-1;i++)
        {
           if(arr[i]==15 && arr[i+1]==15)
           {
             check = true;
           }

        }
        if(check == true)
        {
          System.out.println(check);
        }
        else
        {
          System.out.println(check);
        }
  }
}