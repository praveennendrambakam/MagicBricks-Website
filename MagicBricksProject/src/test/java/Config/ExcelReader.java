package Config;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private String FilePath;

	public ExcelReader(String FilePath) {
		this.FilePath = FilePath;
	}

	public String[][] readExcelData() throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\PNENDRAM\\eclipse-workspace\\MagicBricksProject\\src\\test\\java\\resources\\Data.xslx");
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount + " =====");
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(colCount + "===[[[[[[");

		String data[][] = new String[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				Cell cell = row.getCell(j);
				data[i][j] = cell.getStringCellValue();
			}
		}
		workbook.close();
		file.close();
		return data;
	}
}