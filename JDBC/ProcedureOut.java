import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureOut
{
    public static void main(String args[])
    {
        Connection connection = null;
        connection = DBUtil.getConnection();
        String sql = "{call getsal(?,?)}";
        try
        {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setInt(1,207);
            callableStatement.registerOutParameter(2 , Types.INTEGER);
            callableStatement.execute();
            int salary = callableStatement.getInt(2);
            System.out.println("Salary of employee_id 207 is : " + salary);
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
                System.out.println("Connection not closed.");
            }
        }
    }
}
