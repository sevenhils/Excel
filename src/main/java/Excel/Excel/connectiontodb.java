package Excel.Excel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.Date;

public class connectiontodb {
	public static void main(String[] args) throws SQLException {
	
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","venkatesh@789");
	Statement stmt=con.createStatement();
	 //String s="INSERT INTO studentsinfo values('james','24625','rs','2000-02-14','hockey')";
	//String s="delete from studentsinfo where Name='sain'";
	 //String s= "Select *from studentsinfo";
	String s="INSERT INTO studentsinfo values('sand','246266','clm','2002-02-15','cricket')";
	stmt.execute(s);
	con.close();
	System.out.println("done");
	 //ResultSet rs=stmt.executeQuery(s);
		/*
		 * while(rs.next()) { String name=rs.getString("Name"); int studentid=
		 * rs.getInt("studentid"); String adrs=rs.getString("Address"); Date
		 * date=rs.getDate("dateofjoing"); String sport=rs.getString("sport");
		 * System.out.println(name+" "+studentid+" "+adrs+" "+date+" "+sport);
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 */	}
}
