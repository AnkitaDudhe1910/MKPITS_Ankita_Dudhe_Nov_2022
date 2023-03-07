/* Write a C program to read and print the elements of an array of length 7, before print replace
   every negative number, zero with 100. */

   import java.util.Scanner;

   class Element{
     public static void main(String [] args){

       Scanner sc = new Scanner(System.in);

       int [] arr = new int[7];

        System.out.println("enter array");

       for(int i=0;i<7;i++){

       arr[i] = sc.nextInt();

       }
       for(int i=0;i<7;i++){

         if(arr[i] <0 || arr[i]==0){

           arr[i]=100;

           System.out.println( arr[i]);

            }
            else
            {
			 System.out.println( arr[i]);
			}
       }
     }
   }