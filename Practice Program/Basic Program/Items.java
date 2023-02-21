/* Write a java program that accepts two items weight (floting values) and number of purchase(floating point values)
   and calculate the averae value of the items. */

   import java.util.Scanner;

   class Items
   {
     public static void main(String [] args)
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first item weight");
       float weight1 = sc.nextFloat();
       System.out.println("Enter second item weight");
       float weight2 = sc.nextFloat();
       System.out.println("Enter first item purchase");
       float pur1 = sc.nextFloat();
       System.out.println("Enter second item purchase");
       float pur2 = sc.nextFloat();

       float avg1 = (weight1+weight2)/2;

       float avg2 = (pur1+pur1)/2;

       float avg3 = (avg1+avg2)/2;

       System.out.println("Average value of weight is : "+avg1);
       System.out.println("Average value of purchase is : "+avg2);
       System.out.println("Average value of weight and purchase is : "+avg3);
     }
   }