package PracticeWebAutomation.FileHandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filepage extends Basepage{

	WebDriver driver;
	File file = new File("C:\\Users\\R9224560\\Downloads\\download.xlsx");

	public Filepage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="downloadButton")
	WebElement donwloadbtn;
	
	@FindBy(css="input[type='file']")
	WebElement uploadbtn;
	
	@FindBy(xpath="//div[contains(text(),'Updated Excel Data Successfully.')]")
	WebElement successmsg;
	
	
	
	public void downloadFile()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(donwloadbtn);
		visibilityOf(donwloadbtn).click();
	}
	
	public String uploadFile()
	{
		visibilityOf(uploadbtn).sendKeys("C:\\Users\\R9224560\\Downloads\\download.xlsx");
		String actualmsg = visibilityOf(successmsg).getText();
		return actualmsg;
	}
	
	public String checkPrice()
	{
		String pricecolumn = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		WebElement price= driver.findElement(By.xpath("//div[text()='Apple']/parent::div/parent::div/div[@id='cell-"+pricecolumn+"-undefined']"));
		
		String actualprice = price.getText();
		return actualprice;
	}
	
	public int getColumnNumber() throws IOException {
		FileInputStream fis = new FileInputStream(file);
		try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			Iterator<Row> rows = sheet.iterator();
			Row firstrow = rows.next();
			Iterator<Cell> cells = firstrow.cellIterator();
			int columns = 0;
			int k = 1;
			while (cells.hasNext()) {
				Cell ce = cells.next();
				if (ce.getStringCellValue().equalsIgnoreCase("Price")) {
					columns = k;
				}
				k++;
			}
			System.out.println(columns);
			return columns;
		}
	}
	
	public int getRowNumber() throws IOException
	{
		FileInputStream fis = new FileInputStream(file);
		try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			Iterator<Row> rows = sheet.iterator();
			int rowindex = 0;
			while(rows.hasNext())
			{
				Row row = rows.next();
				Iterator<Cell> cells = row.cellIterator();
				
				int k = 1;
				while(cells.hasNext())
				{
					Cell ce= cells.next();
					if (ce.getStringCellValue().equalsIgnoreCase("Apple")) {
						rowindex = k;
					}
				}
				k++;
			}
			return rowindex;
		}
	}
	
	
}
