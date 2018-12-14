package ExcelReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class excelreadwrite {
	public static void main(String[] args) throws IOException {
		excelreadwrite obj = new excelreadwrite();
		obj.readexcel5();
	}

	public static void readexcel5() throws IOException {
		/*
		 * WORKBOOK SHEET ROW CELL grab value / set value
		 */
		FileInputStream fis = new FileInputStream("C:\\Users\\shaikh.mohammad.rafi\\Videos\\caqh.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");

		Row row = sh.getRow(2);
		Cell cell = row.getCell(2);
		// XSSFRow rw = sh.getRow(3);
		// XSSFCell ce = rw.getCell(4);

		System.out.println(cell);

	}

	public static void readexcel4() throws IOException {
		/*
		 * WORKBOOK SHEET ROW CELL grab value / set value
		 */
		FileInputStream fis = new FileInputStream("C:\\Users\\shaikh.mohammad.rafi\\Videos\\countries.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sh = wb.getSheet("Sheet1");

		// HSSFRow rw = sh.getRow(3);
		// HSSFCell ce = rw.getCell(4);

		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();

		for (int i = 0; i < rowCount + 1; i++) {
			HSSFRow rw = sh.getRow(i);

			// Create a loop to print cell values in a row
			for (int j = 0; j < rw.getLastCellNum(); j++) {

				System.out.print(rw.getCell(j).getStringCellValue());

			}
			// For printing in different line
			System.out.println();

		}

	}

}