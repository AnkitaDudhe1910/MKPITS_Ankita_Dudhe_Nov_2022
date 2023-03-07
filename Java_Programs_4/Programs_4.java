/* Create a parent class called "Person" with two child classes "Student" and "Teacher".
   Each child class should have its own unique method.
*/
import java.util.Scanner;

 class Person
{
  Scanner sc  = new Scanner(System.in);
  String name;
  String subject;
  int grade;
  char div;

}

 class Student extends Person
  {
    void StudentDisplay(){
	 System.out.println("enter name of student");
	 name = sc.next();
	 System.out.println("enter name of subject student studies");
	 subject = sc.next();
	 System.out.println("enter the grade of student");
     grade = sc.nextInt();
	 System.out.println("enter the division of student");
     div = sc.next().charAt(0);
     System.out.println("name of student is: "+name);
     System.out.println("name of subject student studies: "+subject);
     System.out.println("grade of student : "+grade);
     System.out.println("division of student : "+div);
	}



}
 class Teacher extends Person
{
   void TeacherDisplay(){
      System.out.println("enter name of teacher");
	  name = sc.next();
	  System.out.println("enter name of subject teacher teaches");
	  subject = sc.next();
      System.out.println("enter the grade of class teacher teaches");
      grade = sc.nextInt();
      System.out.println("enter the division of class teacher teaches");
      div = sc.next().charAt(0);
      System.out.println("name of teacher is: "+name);
      System.out.println("name of subject teacher teaches: "+subject);
      System.out.println("grade of class teacher teaches : "+grade);
      System.out.println("division of class teacher teaches : "+div);
	}

}

class Programs_4 {
  public static void main(String [] args){
     Student st = new Student();
     st.StudentDisplay();
     Teacher tc = new Teacher();
     tc.TeacherDisplay();
  }
}