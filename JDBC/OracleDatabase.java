import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDatabase
{
    public static final String driver = "oracle.jdbc.driver.OracleDriver";
    public static final String url = "jdbc:oracle:thin:@localhost:1521:M4J0RD1RTY";//mainprotocol : subprotocol : type : @host : port number : service name
    public static final String username = "hr";
    public static final String password = "hr";

    public static void main(String args[])
    {
        try
        {
            Class.forName(driver);
        }
        catch(ClassNotFoundException cnfe)
        {
            System.out.println("Driver not found");
        }
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection(url,username,password);
            if(connection != null)
            {
                System.out.println("Connection Successfull.");
            }
            Statement statement = connection.createStatement();
            String query = "SELECT LAST_NAME FROM EMPLOYEES where salary > 15000";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                String employeeLastName = resultSet.getString(1);
                System.out.println("Last Name : " + employeeLastName);
            }
        }
        catch(SQLException sqle)
        {
            System.out.println("Could not connect to the database");
        }
        finally
        {
            try
            {
                connection.close();
            }
            catch(SQLException sqle)
            {
                System.out.println("Could not connect to the database");
            }
        }
    }
}
