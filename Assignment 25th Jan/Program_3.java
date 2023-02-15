//Write a C program to create a new array from two give array of integers, each length 3.

class Program_3
{
  public static void main(String[]args){
  int [] a ={4,8,7};

  int [] b = {6,2,3};
   int [] c = {a[0],a[1],a[2],b[0],b[1],b[2]};
   for(int i = 0; i<c.length;i++)
   {
	    System.out.println(c[i]);
   }
  }
}
