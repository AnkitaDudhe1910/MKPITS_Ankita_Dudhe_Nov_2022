/* Print 3D array in Java with declared array */


class Program_3{

  public static void main(String [] args){

      int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

       System.out.println("enter values of array");

     for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr[0].length;j++){

     //   for(int k=0;k<arr[1].length;k++){

             System.out.print(arr[i][j]+" ");

       //     }

        //  System.out.println(" ");

          }
      System.out.println(" ");

       }
  }

}