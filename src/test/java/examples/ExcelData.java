package examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	Workbook workbook;
	Sheet sheet;
	
	public ExcelData(String filePath, String sheetName) throws IOException {
		
		File file = new File(filePath);
        if (!file.exists()) {
            throw new IOException("Excel file not found at: " + filePath);
        }
		FileInputStream fileInputStream = new FileInputStream(file);
		
		workbook = new XSSFWorkbook(fileInputStream);
		sheet = workbook.getSheet(sheetName);
	}
	
	
	
	
	public String getCellData(int rowNumber, int cellNumber) {
		Row row = sheet.getRow(rowNumber);
		DataFormatter formatter = new DataFormatter();
		return formatter.formatCellValue(row.getCell(cellNumber));
	}
	
	public void close() throws IOException {
		workbook.close();
	}
}
