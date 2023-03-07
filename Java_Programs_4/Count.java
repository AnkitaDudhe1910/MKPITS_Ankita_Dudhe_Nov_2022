/* Write a program in java count total number of vowel or consonant. */

import java.util.Scanner;

class Count{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String str = sc.next();
    int count1=0;
    int count2=0;

    char c [] = str.toCharArray();
    for(int i =0; i<c.length;i++)
    {

      if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'){

                 count1++;
      }
      else
      {
         count2++;
      }
    }
    System.out.println("total number of vowels are : "+count1);
    System.out.println("total number of consonants are : "+count2);
  }
}