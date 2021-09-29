package writeexceltest;

import org.testng.annotations.Test;

import writeexcel.WriteExcel;

public class WriteExcelTest {
	WriteExcel obj=new WriteExcel();
	@Test
	public void writeexceltest() throws Exception {
		obj.WriteExcel("details", "ram", 0, 2);
	}

	
	@Test
	public void writeexceltest1() throws Exception {
		obj.WriteExcel("details", "raj", 1, 2);
	}

	
	@Test
	public void writeexceltest2() throws Exception {
		obj.WriteExcel("details", "rock", 3, 2);
	}

}
