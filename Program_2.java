import java.util.Scanner;
class assignment
{
int a , value;
void bitSift()
{
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the value of a");
  a = sc.nextInt();
  value = a << 2;
  System.out.println("the data is shift two bits to the left : "+value);
}
}
class Program_2
{
public static void main(String [] args){
 assignment ob = new assignment();
 ob.bitSift();
}
}