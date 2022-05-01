package DDF;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class jxl {
	WebDriver driver;
	public String URL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	
	@Test()
	public void testcase1() throws BiffException, IOException {
		
WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		File excel=new File("C://Users//user//Desktop//dd.xls");
		Workbook wb= Workbook.getWorkbook(excel);
		Sheet st=null;
		Cell cl=null;
		int sheets=wb.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			st=wb.getSheet(i);
			int rows=st.getRows();
			int col=st.getColumns();
			System.out.println("no of rows="+rows);
			System.out.println("no of column is"+col);
			for(int x=0;x<rows;x++) {
				for(int y=0;y<col;y++) {
					cl = st.getCell(y,x);
					if(cl.getContents().length()>0) {
						System.out.println(cl.getContents());
					}
				}
			}
		}
	}

}
