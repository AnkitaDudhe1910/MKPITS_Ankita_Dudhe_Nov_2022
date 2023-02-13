import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class SwitchDemoSql {
    public static void main(String [] args){
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
         System.out.println("enter operation:");
         System.out.println("for 1 : INSERT "+" 2 : UPDATE "+" 3 : DELETE");
         int operation = sc.nextInt();
         switch(operation) {
             case 1 :
                 System.out.println("enter id for insert");
                 int id1 = sc.nextInt();
                 System.out.println("enter name for insert");
                 String name1 =sc.next();
                 System.out.println("enter course name for insert");
                 String cname1 = sc.next();
                 int r = stmt.executeUpdate("INSERT INTO new_table VALUES("+id1+",'"+name1+"','"+cname1+"')");
                 System.out.println("Data has been Inserted");
                 break;

             case 2 :
                 System.out.println("enter id for update");
                 int idin = sc.nextInt();
                 System.out.println("enter updated for update");
                 String namein =sc.next();
                 System.out.println("enter updated for update ");
                 String cnamein = sc.next();
                 System.out.println("enter id to update");
                 int idup = sc.nextInt();

                 int s = stmt.executeUpdate("UPDATE new_table SET id = "+idin+",name = '"+namein+"',course_name = '"+cnamein+"' WHERE id ="+idup+"");
                 System.out.println("Data has been Updated");
                 break;
             case 3 :
                 System.out.println("enter id to delete");
                 int id_del = sc.nextInt();
                 int d = stmt.executeUpdate("DELETE FROM new_table WHERE id = "+id_del+"" );
                 System.out.println("Data has been Deleted");
                 break;
             default:
                 System.out.println("Exit");
         }

    }
        catch(Exception e){
        System.out.println(e);
    }
}
}




