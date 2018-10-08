import java.sql.*;
class MysqlCon{
public static void main(String args[]){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/JDBC","root","");
        
        if(!con.isClosed())
            System.out.println("Successfully connected to MySQL server ...");
        Statement stmt = con.createStatement();
        int prn=55;
        String name="Tejas";
        stmt.executeUpdate("insert into student values("+prn+",'"+name+"')");
        
        ResultSet rs = stmt.executeQuery("select * from student");
        
        while(rs.next())
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        
        con.close();
    }
    catch(Exception e)
    {
        System.out.println(e);    
    }
}
}

//Running the program
//java -cp mysql-connector-java-5.1.17-bin.jar;. MysqlCon
