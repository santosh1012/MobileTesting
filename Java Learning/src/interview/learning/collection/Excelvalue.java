package interview.learning.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.thoughtworks.selenium.webdriven.commands.GetValue;

public class Excelvalue {

	
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		
		
		
		
		File f=new File("C:\\Mobile Setup\\Projects\\Java Learning\\src\\data\\dataEngine.xlsx");
		FileInputStream fis=new FileInputStream(f);
		workbook=new XSSFWorkbook(fis);
	 sheet = workbook.getSheet("Sheet1");
	System.out.println( getValue("obj3").toString());
	
	}
	
	public static  HashMap<String, XSSFCell> getValue(String object)
	{
		
		HashMap<String,XSSFCell> hmap=new LinkedHashMap<String,XSSFCell>();
		for(int row=0;row<9;row++)
		{
			XSSFCell cell0 = sheet.getRow(row).getCell(0);
			String value = cell0.getStringCellValue();
			if (value.equalsIgnoreCase(object)) {
				
				XSSFRow row2 = cell0.getRow();
				int rowNum = row2.getRowNum();
				XSSFCell cell1 = sheet.getRow(rowNum).getCell(1);
				XSSFCell cell2 = sheet.getRow(rowNum).getCell(2);
				XSSFCell cell3 = sheet.getRow(rowNum).getCell(3);
				XSSFCell cell4 = sheet.getRow(rowNum).getCell(4);
				hmap.put("Name", cell1);
				hmap.put("Id", cell2);
				hmap.put("Xpath", cell3);
				hmap.put("Css", cell4);
			}
						
		}
	
		
		return hmap;
		
		
	}
			
}
