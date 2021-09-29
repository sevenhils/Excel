package writeexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public void WriteExcel(String Sheetname,String Cellvalue,int row,int col) throws Exception {
		String Excelpath="C:\\Users\\ADMIN\\eclipse-workspace\\Excel\\Testdata\\New Microsoft Excel Worksheet.xlsx";
		File file=new File(Excelpath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=	wb.getSheet(Sheetname);
	sheet.getRow(row).createCell(col).setCellValue(Cellvalue);
	FileOutputStream fos=new FileOutputStream(Excelpath);
	
	wb.write(fos);
	wb.close();
	fos.close();
	
	}

}
