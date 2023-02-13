import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dmlDemo {
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

            /* hard code data for Inserting the data into database table new_table*/
            int r = stmt.executeUpdate("INSERT INTO new_table VALUES(4,'mahi','java')");
           System.out.println(r);

            /* hard code data for Updating the data into database table new_table*/
           int s = stmt.executeUpdate("UPDATE new_table SET name='shital',course_name ='mysql' WHERE id = 5");
           System.out.println(s);

            /* hard code data for Delete the data into database table new_table*/
           int d = stmt.executeUpdate("DELETE FROM new_table WHERE id = 2");
            System.out.println(d);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}



