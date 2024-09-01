package baselibrary;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Exelutility.ExelUtility;

public class BaseLibrary implements ExelUtility{
	public static WebDriver driver=null;
public void launchurl() {
	String path="C:\\Users\\user\\eclipse-workspace\\Seleniumdemo\\chromedriver.exe";
	System.setProperty("WebDriver.chrome.driver",path);
	
	driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/");
   driver.manage().window().maximize();      
}
@Override
public String readdata(int sheetno,int row,int column) {
	String path="C:\\Users\\user\\eclipse-workspace\\Seleniumdemo\\woekbookXL\\New Microsoft Office Excel Worksheet1.xlsx";
	 String value=null;
	 try {
		 FileInputStream fis= new FileInputStream(path);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
	value=	sheet.getRow(row).getCell(column).getStringCellValue();		 }
	  catch (Exception e) {
		  System.out.println("issue the read data"+ e);
		  
	 }
 
	 return value;
 

	
}
}
