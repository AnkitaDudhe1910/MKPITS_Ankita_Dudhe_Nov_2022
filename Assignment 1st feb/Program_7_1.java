/* Write a Java program to convert from celsius degrees to Kelvin and Fahrenheit. */

import java.util.Scanner;

class Program_7_1
{
public static void main(String [] args)
{
 double kelvin;
 double fahrenheit;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter temperature in celcius degree");
 float celcius_degree = sc.nextFloat();

     kelvin = celcius_degree + 273.15;

    fahrenheit = (celcius_degree*9/5)+32;

    System.out.println("celsius degrees to Kelvin : "+ kelvin );
    System.out.println("celsius degrees to Fahrenheit : "+fahrenheit);

  }
}