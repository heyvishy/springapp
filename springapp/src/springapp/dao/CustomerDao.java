package springapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDao {
		
	
		public CustomerDao() {
			
		}
		
		public String getCustomerName()
		{
			String name="";
			try {

				String dbtime;
				String dbUrl = "jdbc:mysql://127.0.0.1:3306/AccountPro";
				String dbClass = "com.mysql.jdbc.Driver";
				String query = "Select * FROM customer";
				
								
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(dbUrl, "root", "");
				//Connection con = DriverManager.getConnection (dbUrl);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);

				while (rs.next()) {
				dbtime = rs.getString(1);
				name = rs.getString(2);
				System.out.println(dbtime);
				System.out.println(name);
				} //end while
				
				
				con.close();
				
				
				
			} //end try

			catch(ClassNotFoundException e1) {
				e1.printStackTrace();
			}

			catch(SQLException e1) {
				e1.printStackTrace();
			}
			return name;
		}	
}
