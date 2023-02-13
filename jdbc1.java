import java.sql.*;

public class jdbc1 {
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
          ResultSet rs = stmt.executeQuery("select * from login"); //sql query

          while(rs.next()) {
              //getting data
              System.out.println(("id : ")+rs.getString("id")+(" uname : ")+rs.getString("uname")+(" pass : ")+rs.getString("pass"));
          }


      }
      catch(Exception e){
          System.out.println(e);
      }
      }
    }

