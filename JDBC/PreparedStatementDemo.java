import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreparedStatementDemo
{
    public static void main(final String args[])
    {
        Connection connection = DBUtil.getConnection();
        String sql = "INSERT into EMPLOYEESTEST values(?,?,?,?,?,?,?,?,?,?,?)";
        System.out.println("Are you sure about the insertion of records into the database? (Y/N)");
        BufferedReader bufferedReader = null;
        try
        {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferedReader.readLine();

            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1 , 207);
            preparedStatement.setString(2 , "Tejas");
            preparedStatement.setString(3 , "Shinde");
            preparedStatement.setString(4 , "stejas44@gmail.com");
            preparedStatement.setString(5 , "7447775100");
            preparedStatement.setString(6 , "15-JUL-18");
            preparedStatement.setString(7 , "SA-REP");
            preparedStatement.setInt(8 , 19500);
            preparedStatement.setDouble(9 , .50);
            preparedStatement.setInt(10 , 206);
            preparedStatement.setInt(11 , 80);

            preparedStatement.executeUpdate();
            if(input.equalsIgnoreCase("y"))
            {
                connection.commit();
                System.out.println("Records inserted successfully");
            }
            else
            {
                connection.rollback();
                System.out.println("Records not inserted");
            }
        }
        catch(SQLException sqle)
        {
            System.out.println("Could not connect to the database");
        }
        catch(IOException ioe)
        {
            System.out.println("Problem with external peripheral devices");
        }
        finally
        {
            try
            {
                connection.close();
            }
            catch(SQLException sqle)
            {
                System.out.println("Could not cclose the database connection");
            }
        }
    }
}
