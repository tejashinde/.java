import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
/*
create or replace
procedure displayDetails(mEmployee_id IN number,mFirst_Name OUT varchar2,mLast_Name OUT varchar2,mEmail OUT varchar2)
as
begin
select first_name,last_name,email into mFirst_Name,mLast_Name,mEmail from employeestest where employee_id = mEmployee_id;
end;
*/

public class OracleProcedure
{
    public static void main(String args[])
    {
        Connection connection = null;
        connection = DBUtil.getConnection();
        String sql = "{call readrecord()}";
        try
        {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.execute();
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
