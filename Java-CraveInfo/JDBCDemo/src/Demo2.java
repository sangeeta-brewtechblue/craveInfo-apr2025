import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 Connection con= DriverManager.getConnection
       		  ("jdbc:mysql://localhost:3306/craveinfo","root","root");
		
		 PreparedStatement pst = con.prepareStatement
				 ("select * from login where id= ?");
		 
		  pst.setInt(1, 3);
		  ResultSet rs = pst.executeQuery();
		  rs.next();
		  System.out.println(rs.getInt(1)+"-"+rs.getString(2)+"-"+rs.getString(3));
		  
		  con.close();
		  
		  
		
	}

}
