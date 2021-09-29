package writeexceltest;

import org.testng.annotations.Test;

import writeexcel.excellibrary;


public class readExcel {
	excellibrary obj=new excellibrary();
	@Test
	public void readExcels() throws Exception {
		String data=obj.readdata("details", 0, 2);
		  System.out.println("The data is: "+data);
		
	}

}
