/*  Create a class called "Person" with two child classes "Adult" and "Child".
    Each child class should have its own unique method. */

  class Person {
    String age;
    String dependency;
    String rights;
    String decision;
  }
  class Child extends Person{
     void childDetails(){
       age = "less than 18";
       dependency = "dependent on parent";
       rights = "can not vote ,can not drive";
       decision ="can not take serious decision ";
       System.out.println(age);
       System.out.println( dependency );
       System.out.println(rights );
       System.out.println( decision);
       System.out.println(" ");
     }
  }
   class Adult extends Person{
       void adultDetails(){
        age = "more than 18 or equals to 18";
        dependency = "may not dependent dependent ";
        rights = "can vote ,can drive";
        decision ="can take serious decision ";
        System.out.println(age);
	    System.out.println( dependency );
	    System.out.println(rights );
       System.out.println( decision);
       }
  }
  class Program_23{
    public static void main(String [] args){

      Child cobj = new Child();
      cobj.childDetails();

      Adult aobj = new Adult();
      aobj.adultDetails();
    }
  }