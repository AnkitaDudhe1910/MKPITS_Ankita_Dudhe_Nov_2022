/* Write  a java program to read amout(int) and break the amount into smallest possible number of notes .*/

import java.util.Scanner;

class Amount
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter amount");
    int amount = sc.nextInt();

    int smallestNote = 10;

    int numOfNote = amount/smallestNote;
    System.out.println("smallest possible number of notes "+numOfNote);
  }
}