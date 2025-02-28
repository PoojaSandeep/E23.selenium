package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDataExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Open the document in java read Format
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		//create a workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//Navigate to sheet
		Sheet sh=wb.getSheet("Products");
		
		//Navigate to Row
		Row rw= sh.getRow(0);
		
		//Navigate to Cell
		Cell cl=rw.getCell(4);
		
		//Capture the data inside the cell
		String value = cl.getStringCellValue();
		System.out.println(value);
	}

}
