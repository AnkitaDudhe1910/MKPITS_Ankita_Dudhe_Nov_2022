import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicDemo {
    public static void main(String [] args)
    {
        try {

            // for connecting mysql
            Class.forName("com.mysql.jdbc.Driver");
            //connection to mysql connector
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?characterEncoding=latin1","root","anki");
            System.out.println("driver loaded successfully");
            System.out.println("mysql connected successfully") ;

            //for getting data from database
            Statement stmt = con.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.println("enter id");
            int idin = sc.nextInt();
            System.out.println("enter name");
            String namein =sc.next();
            System.out.println("enter course name");
            String cnamein = sc.next();
            System.out.println("enter id to change");
            int idup = sc.nextInt();

            /* Insert value dynamically in database table new_table*/
          int r = stmt.executeUpdate("INSERT INTO new_table VALUES("+idin+",'"+namein+"','"+cnamein+"')");
            System.out.println(r);

            /* Update value dynamically in database table new_table*/
            int s = stmt.executeUpdate("UPDATE new_table SET id = "+idin+",name = '"+namein+"',course_name = '"+cnamein+"' WHERE id ="+idup+"");
            System.out.println(s);

            /* Delete value dynamically in database table new_table*/
           int d = stmt.executeUpdate("DELETE FROM new_table WHERE id = "+idin+"" );
            System.out.println(d);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


