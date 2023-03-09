/* Print 2D array in Java from user */

import java.util.Scanner;

class Program_2{

  public static void main(String [] args){

     Scanner sc = new Scanner(System.in);

      int [][] arr = new int[2][2];

       System.out.println("enter values of array");

     for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr[0].length;j++){

		 arr[i][j] = sc.nextInt();
		}

       }

     for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr[0].length;j++){

         System.out.print(arr[i][j]+" ");

          }
       System.out.println(" ");
       }
  }

}