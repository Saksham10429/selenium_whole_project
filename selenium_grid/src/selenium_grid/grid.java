package selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid {

	public static String URL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.0.105:4444/wd/hub"),dc);
        driver.get(URL);
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}

}
