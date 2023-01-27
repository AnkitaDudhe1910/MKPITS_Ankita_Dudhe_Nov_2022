// Write a java programming to display the integer equvallents of letters(a-z, A-Z).

class assignment
{
  char ch_1, ch_2;
  void fun()
  {
    for (ch_1 ='A'; ch_1<='Z';ch_1++)
    {
        int a = (int)ch_1;
        System.out.println(a+"="+ch_1);
    }
    System.out.println(" ");
    for(ch_2 = 'a'; ch_2 <='z';ch_2++)
    {
       int b =(int)ch_2;
       System.out.println(b+"="+ch_2);
    }

  }

}
class Program_16
{
  public static void main(String [] args)
  {
    assignment ob = new assignment();
    ob.fun();
  }
}
