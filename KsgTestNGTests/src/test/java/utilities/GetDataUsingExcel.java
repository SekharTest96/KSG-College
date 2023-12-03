package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import constants.Constantss;


public class GetDataUsingExcel   {
	
	XSSFWorkbook workbook;


	
		public  String getUrlLink() throws IOException {
			
			FileInputStream fis = new FileInputStream( Constantss.excelPath);
			 workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Row row = sheet.getRow(5);
			Cell cell = row.getCell(5);
			
			XSSFCell value = sheet.getRow(5).getCell(5);
			
			String text = value.toString();
			System.out.println(text);
			return text;
		}
		
			
		public void close() {
			if (workbook != null) {
	            try {
	                workbook.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        
		
		}
}
	

