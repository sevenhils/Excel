package Excel.Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Databasetoexcel {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
	
		// TODO Auto-generated method stub

		/*
		 * String connectionURL = "jdbc:mysql://localhost:3306/studentsinfo";
		 * Class.forName("com.mysql.jdbc.Driver");
		 * 
		 * System.out.println("connecting to psysical database..."); Connection con =
		 * DriverManager.getConnection(connectionURL, "root", "venkatesh@789");
		 */
		//download jdbc dependencies
		//create connection
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","venkatesh@789");
//	create	query
Statement	stmt=con.createStatement();
//String s="INSERT INTO studentsinfo values('james','24625','rs','2000-02-14','hockey')";
//String s="delete from studentsinfo where Name='sain'";
String s= "Select *from studentsinfo";


/*
 * //execute query stmt.execute(s); //close connection con.close();
 * System.out.println("query executed..");
 */
ResultSet	rs=stmt.executeQuery(s);
	//excel
	
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Studenstinfo");
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("Name");
		row.createCell(1).setCellValue("studentid");
		row.createCell(2).setCellValue("Address");
		row.createCell(3).setCellValue("Dateofjoing");
		row.createCell(4).setCellValue("sport");
		int r=1;
	while(rs.next()) {	
	 String name=rs.getString("Name");
int studentid=	 rs.getInt("studentid");
String adrs=rs.getString("Address");
Date date=rs.getDate("dateofjoing");
String sport=rs.getString("sport");

row=sheet.createRow(r++);
row.createCell(0).setCellValue(name);
row.createCell(1).setCellValue(studentid);
row.createCell(2).setCellValue(adrs);
row.createCell(3).setCellValue(date);
row.createCell(4).setCellValue(sport);
		
	}
FileOutputStream fos=new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Excel\\Testdata\\Studenstinfo.xlsx");
	workbook.write(fos);
	workbook.close();
	fos.close();
	con.close();
	System.out.println("done");
	
	}
	}
