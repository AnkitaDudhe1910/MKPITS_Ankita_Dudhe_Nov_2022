/* Create a parent class called "Animal" and create three child classes "Dog", "Cat" and "Bird"
   that inherit from it. Each child class should have its own unique method.
*/

import java.util.Scanner;

class Animal
{
  String animalName;
  String animalSound;
  Scanner sc = new Scanner(System.in);
}

class Dog extends Animal
{
   void dogDisplay(){
   System.out.println("enter the type of dog");
   animalName = sc.next();
   System.out.println("enter the sound of dog");
   animalSound = sc.next();
   System.out.println("type of dog is : "+animalName);
   System.out.println("Sound of dog is : "+animalSound);
  }
}
class Cat extends Animal
{
void catDisplay(){
   System.out.println("enter the type of cat");
   animalName = sc.next();
   System.out.println("enter the sound of cat");
   animalSound = sc.next();
   System.out.println("type of cat is : "+animalName);
   System.out.println("Sound of cat is : "+animalSound);
  }
}
class Bird extends Animal
{
void birdDisplay(){
   System.out.println("enter the type of bird");
   animalName = sc.next();
   System.out.println("enter the sound of bird");
   animalSound = sc.next();
   System.out.println("type of bird is : "+animalName);
   System.out.println("Sound of bird is : "+animalSound);
  }

}
class Programs_2{
  public static void main(String [] args){
    Dog dobj = new Dog();
     dobj.dogDisplay();
    Cat cobj = new Cat();
     cobj.catDisplay();
    Bird bobj = new Bird();
     bobj.birdDisplay();
  }
}