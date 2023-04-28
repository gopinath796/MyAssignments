package marathon;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] question(String fileName) throws IOException {
		int rowCount = 0;
		short columnCount = 0;
		// ExcelAccess
		XSSFWorkbook wb = new XSSFWorkbook("./TestData/"+fileName+".xlsx");
		XSSFSheet sh = wb.getSheetAt(0);
		rowCount = sh.getLastRowNum();
		columnCount = sh.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][columnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sh.getRow(i);
			for (int j = 0; j <columnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;

			}
		}
		wb.close();
		return data;
	}
}
