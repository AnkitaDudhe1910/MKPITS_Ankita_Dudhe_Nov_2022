/* Print 3D array in Java from user */

import java.util.Scanner;

class Program_4{

  public static void main(String [] args){

     Scanner sc = new Scanner(System.in);

      int [][][] arr = new int[3][3][3];

       System.out.println("enter values of array");

     for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr[0].length;j++){

          for(int k=0;k<arr[1].length;k++){

               arr[i][j][k] = sc.nextInt();

                  }

		}

       }

     for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr[0].length;j++){

        for(int k=0;k<arr[1].length;k++){

       System.out.print(arr[i][j][k]+" ");

            }

          System.out.println(" ");

          }
      System.out.println(" ");

       }
  }

}