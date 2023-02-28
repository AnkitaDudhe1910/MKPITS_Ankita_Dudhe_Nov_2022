//Missing number in array

class ArrayDemo_1
{
  public static void main(String [] args)
  {
    int sum1 = 55;
    int [] a = {1,2,3,4,5,6,8,9,10};
    int sum2=0;
    for(int i=0;i<a.length;i++)
    {
      sum2 = sum2+a[i];
    }
    int sum3 = sum1-sum2;

    System.out.println("Missing number in the array is: "+sum3);
  }
}