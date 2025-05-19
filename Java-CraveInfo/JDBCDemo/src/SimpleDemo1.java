import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleDemo1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		  
          Connection con= DriverManager.getConnection
        		  ("jdbc:mysql://localhost:3306/craveinfo","root","root");
	      Statement st = con.createStatement() ; 
	         int rows = st.executeUpdate("insert into login values (10,'ccc','ccc')");
	      if(rows==1)
	      System.out.println("row inserted");
	      
	      
	      
	      Statement st1 = con.createStatement();
	      
	      
		  ResultSet loginUsers= st1.executeQuery("select * from login");
		  
		  ResultSetMetaData rsmd= loginUsers.getMetaData();
		   String t1= rsmd.getColumnName(1);
		   String t2= rsmd.getColumnName(2);
		   String t3= rsmd.getColumnName(3);
		   
		   System.out.println(t1+""+"-"+t2+"-"+t3);
		  
		  while(loginUsers.next()) {
		  
		  System.out.println(loginUsers.getInt(1)+"---"+loginUsers.getString(2)
		  +"---"+loginUsers.getString(2)); }
		 
		  con.close();
	     
	
	
	}


}
