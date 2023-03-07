/* Write a C program to read and print the elements of an array of length 7, before print,
   put the triple of the previous position starting from the second position of the array. */
   
   import java.util.Scanner;
   
   class Triple{
     public static void main(String [] args){
     
       Scanner sc = new Scanner(System.in);
       int multi =0;
       int [] arr = new int[7];
       System.out.println("enter array");
       for(int i=0;i<7;i++){
         arr[i] = sc.nextInt();
       }
       for(int i=0;i<7;i++){
         if(i>=2){
         multi = arr[i-1]*3;
         System.out.println(multi);
         }
         else
         {
           System.out.println(arr[i]);
         }
       }
     }
   }