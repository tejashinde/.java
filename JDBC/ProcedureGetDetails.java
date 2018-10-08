/*
create or replace
procedure displayDetails(mEmployee_id IN number,mFirst_Name OUT varchar2,mLast_Name OUT varchar2,mEmail OUT varchar2)
as
begin
select first_name,last_name,email into mFirst_Name,mLast_Name,mEmail from employeestest where employee_id = mEmployee_id;
end;
/
*/
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
public class ProcedureGetDetails
{
    public static void main(String args[])
    {
        Connection connection = null;
        connection = DBUtil.getConnection();
        String sql = "{call displayDetails(?,?,?,?)}";
        try
        {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setInt(1,207);
            callableStatement.registerOutParameter(2 , Types.VARCHAR);
            callableStatement.registerOutParameter(3 , Types.VARCHAR);
            callableStatement.registerOutParameter(4 , Types.VARCHAR);
            callableStatement.execute();
            String first_name = callableStatement.getString(2);
            String last_name = callableStatement.getString(3);
            String email = callableStatement.getString(4);
            System.out.println("Details of Employee ID 207");
            System.out.println("First Name : " + first_name);
            System.out.println("Last Name : " + last_name);
            System.out.println("Email : " + email);

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
