/* Program to demonstrate the use of 'this' keyword in java. */

public class ThisKey{
  String name;
  String place;
  public ThisKey(String Nam, String Place){

  this.name = Nam;
  this.place = Place;

  }
  public void display(){
  System.out.println("Name : "+name);
  System.out.println("Place : "+place);
  }
  public static void main(String [] args)
  {
    ThisKey obj = new ThisKey("MKPITS","Nagpur" );
    obj.display();
  }
}