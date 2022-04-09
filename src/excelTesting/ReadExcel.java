package excelTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcel() throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\LENOVO\\git\\STS\\LearningCodingWithDefinitions\\src\\excelTesting\\ ExcelTesting.xlsx"));
		Workbook wb = new XSSFWorkbook(fis);
		Iterator<Sheet> allSheet = wb.iterator();
		while(allSheet.hasNext()) {
			allSheet.next();
			System.out.println(allSheet);
		}
	}
}
 