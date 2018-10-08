import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertDatabase
{
    public static void main(String args[])
    {
        Connection connection = null;
        connection = DBUtil.getConnection();
        try
        {
            Statement statement = connection.createStatement();
            String insertQuery = "INSERT into EMPLOYEESTEST values(207,'Tejas','Shinde','stejas44@gmail.com','7447775100','15-JUL-18','SA_REP',19500,.35,206,80)";
            int record = statement.executeUpdate(insertQuery);
            if(record > 0)
            {
                System.out.println("Record Inserted");
            }
        }
        catch(SQLException sqle)
        {
            System.out.println("Could not connect to the database");
        }
    }
}
