package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader
{
     static FileInputStream fis  = null;
     public Object[][] getExcelData() throws IOException
     {
    	 String filepath =System.getProperty("user.dir")+"//TestData//Book1.xlsx";
    	 File scrFile = new File(filepath);
    	 fis = new FileInputStream(scrFile);
    	 
    	 XSSFWorkbook wb = new XSSFWorkbook(fis);
    	 XSSFSheet sheet = wb.getSheetAt(0);
    	 int TotalRows = sheet.getLastRowNum()+1;
    	 int TotalColms = 11;
    	 String [][] arrExcel = new String[TotalRows][TotalColms];
    	 for (int row=1;row<TotalRows;row++)
    	 {
    		 for(int col=0;col<TotalColms;col++)
    		 {	 
    			 XSSFRow rowsh = sheet.getRow(1);
    			 arrExcel[row][col]=rowsh.getCell(col).toString();
    		 }
    	 }
    		 wb.close();
    		 return arrExcel ;
    		 
     }
     
}   

