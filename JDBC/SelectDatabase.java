import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class SelectDatabase
{
    public static void main(String args[])
    {
        Connection connection = null;
        connection = DBUtil.getConnection();
        try
        {
            Statement statement = connection.createStatement();
            String sql = "SELECT first_name,email FROM EMPLOYEESTEST";
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columns = resultSetMetaData.getColumnCount();
            while(resultSet.next())
            {
                for(int iterator = 1 ; iterator <= columns ; iterator ++ )
                {
                    System.out.println(resultSet.getString(iterator) + " ");
                }
            }
        }
        catch(SQLException sqle)
        {
            System.out.println("Could not connect to the database");
        }
    }
}
