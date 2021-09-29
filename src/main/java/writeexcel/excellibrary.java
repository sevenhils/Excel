package writeexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellibrary {
	 XSSFWorkbook wb;
	 XSSFSheet sheet;

	public void excel() throws Exception {
		String Excelpath="C:\\Users\\ADMIN\\eclipse-workspace\\Excel\\Testdata\\New Microsoft Excel Worksheet.xlsx";
		File file=new File(Excelpath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	}

public String readdata(String Sheetname,int row,int col) throws Exception {
	sheet=wb.getSheet(Sheetname);
	String data=sheet.getRow(row).getCell(col).getStringCellValue();
	return data;
}

}
