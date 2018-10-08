import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
/*
create or replace
procedure swapNumbers(mNumber IN OUT number,nNumber IN OUT number)
as
mTemp number(2);
begin
mTemp := mNumber;
mNumber := nNumber;
nNumber := mTemp;
end;
/
*/
public class SwapNumbersProcedure
{
    public static void main(String args[])
    {
        Connection connection = null;
        connection = DBUtil.getConnection();
        String sql = "{call swapNumbers(?,?)}";
        try
        {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setInt(1,55);
            callableStatement.setInt(2,77);
            callableStatement.registerOutParameter(1 , Types.INTEGER);
            callableStatement.registerOutParameter(2 , Types.INTEGER);
            callableStatement.execute();
            int mNumber = callableStatement.getInt(1);
            int nNumber = callableStatement.getInt(2);
            System.out.println("Swappiing of 55 & 77 : " + mNumber + " & " + nNumber);
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
