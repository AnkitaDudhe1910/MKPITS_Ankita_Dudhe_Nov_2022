/* Write a java program to compute the sum of the two given arrays of integers,
   length 3 and find the array which has the largest sum. */

class assignment
{
  int [] ar1 = {15,18,20};
  int [] ar2 = {23,26,12};
  int sum1, sum2, sum3;
  void fun()
  {
    sum1 = ar1[0]+ar1[1]+ar2[2];
    sum2 = ar2[0]+ar2[1]+ar2[2];


    System.out.println("sum of ar1 is: " +sum1);
    System.out.println("sum of  ar2 is: " +sum2);


    if(sum1 > sum2 )
    {
      System.out.println("largest sum is : "+sum1);
    }
    else
    {
       System.out.println("largest sum is : "+sum2);
    }
  }
}
class Program_1
{
  public static void main(String [] args)
  {
     assignment ob  = new assignment();
     ob.fun();
  }
}