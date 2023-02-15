/* Write a c program to rotate the elements of a given array of integers (length 4) in left direction and return the new array.*/

class Program_13
{
  public static void main(String [] args)
  {
     int [] a = {12,15,36,21};
     for(int i=0; i<a.length;i++)
        {
           System.out.println(a[i]);
        }
     int [] b = {a[1], a[2],a[3],a[0]};
     for(int i=0; i<b.length;i++)
     {
        System.out.print(b[i]+" ");
     }
  }
}