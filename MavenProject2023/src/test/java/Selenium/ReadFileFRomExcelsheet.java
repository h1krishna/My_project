package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFileFRomExcelsheet {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File f = new File("./target/workbook1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet1 = wb.getSheetAt(1);
		int rows = sheet1.getPhysicalNumberOfRows();
		int cells = sheet1.getRow(0).getLastCellNum();

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				DataFormatter df = new DataFormatter();
				System.out.println(df.formatCellValue(sheet1.getRow(i).getCell(j)));

			}
		}
		fi.close();
		wb.close();

	}

}
