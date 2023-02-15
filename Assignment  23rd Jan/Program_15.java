/* Write a Java program to create new array containing the middle elements from the two given arrays of integers each length 5*/

class Program_15
{
  public static void main(String [] args)
  {
     int [] a = {12,23,26,15,18};
     int [] b = {25,13,28,25,38};
     int [] c = {a[2],b[2]};
     for(int i = 0; i<c.length;i++)
     {
        System.out.print(" "+c[i]);
     }
  }
}