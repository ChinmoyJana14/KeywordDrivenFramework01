import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	static Workbook wb;
	static Sheet sheet;
	
	public static void SetExcel(String path, int sheetNum) {
		try {
			File src = new File(path);
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(sheetNum);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());			
		}
	}
	
	public static String getData(int rowNum, int colNum) {
		String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return data;
	}

}

