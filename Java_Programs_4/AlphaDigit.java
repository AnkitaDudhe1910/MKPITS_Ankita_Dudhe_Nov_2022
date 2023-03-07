/* Write a program in java to count total number of alphabets, digits and special characters in a string. */

import java.util.Scanner;

class AlphaDigit{
   public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter string");
     String str = sc.next();
     int count1=0;
     int count2=0;
     int count3=0;

     char [] c = str.toCharArray();

     for(int i=0;i<c.length;i++)
     {
       if(c[i]>='a' && c[i]<='z' || c[i]>='A' && c[i]<='Z')
       {
          count1++;
       }
       else
       {
         if(c[i]>='0' && c[i]<='9')
         {
           count2++;
         }
         else
         {
           count3++;
         }
       }
     }
     System.out.println("total number of alphabets are : "+count1);
     System.out.println("total number of digits are : "+count2);
     System.out.println("total number of special character are : "+count3);
   }
}