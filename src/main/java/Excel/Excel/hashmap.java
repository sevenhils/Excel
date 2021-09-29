package Excel.Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class hashmap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("employee");
		
		Map<String,String> data=new HashMap<String,String>();
		
		data.put("101", "swetha");
		data.put("102", "Swathi");
		data.put("103", "rakesh");
		data.put("104", "raj");
		data.put("105", "shyam");

		
		int rownum=0;
		for(Map.Entry entry:data.entrySet()) {
		XSSFRow row =	sheet.createRow(rownum++);
		row.createCell(0).setCellValue((String)entry.getKey());
		row.createCell(1).setCellValue((String)entry.getValue());

		
		}
		
		FileOutputStream fos=new FileOutputStream(".\\Testdata\\employee.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("excel written Successfully");
		
	}

}
