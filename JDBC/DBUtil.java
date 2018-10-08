import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

class DBUtil
{

    public static final String driver = "oracle.jdbc.driver.OracleDriver";
    public static final String url = "jdbc:oracle:thin:@localhost:1521:M4J0RD1RTY";//mainprotocol : subprotocol : type : @host : port number : service name
    public static final String username = "hr";
    public static final String password = "hr";

    public static Connection getConnection()
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
        }
        catch(SQLException sqle)
        {
            System.out.println("Could not connect to the database.");
        }
        return connection;
    }
}
