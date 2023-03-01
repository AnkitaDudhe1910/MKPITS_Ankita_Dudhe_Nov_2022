/* Java program to display even numbers from 1 to 100. */

class EvenNum
{
  public static void main(String [] args)
  {
    for(int num=1;num<=100;num++)
    {
      if(num%2==0)
      {
        System.out.println(num);
      }
    }
  }
}