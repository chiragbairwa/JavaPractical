//Program to show the example of JDBC

import java.sql.*;  

class j69{  
	public static void main(String args[]){  
		String url = "jdbc:mysql://localhost:3306/db";
		String uname = "root";
		String pass = "hello";
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con = DriverManager.getConnection(url, uname, pass);  
			 
			Statement st = con.createStatement();  
			
			//TO store in table form
			ResultSet rs = st.executeQuery("select * from STUDENT ");  
			
			//NEXT() because primary pointing location is before the first
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2) );

			st.close();
			con.close();  
		}
		catch(Exception e){ 
			System.out.println(e);
		}  
	}  
}