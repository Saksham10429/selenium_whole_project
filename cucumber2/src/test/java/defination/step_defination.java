package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_defination {
	WebDriver driver;
	public String URL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	
	@Given("I should go to the login page")
	public void i_should_go_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);	
		
	}
	@When("Enter the username {string}")
	public void enter_the_username(String string) {
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(string);
		
	}
	@When("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(string);
		
	}
	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
		Assert.assertEquals(driver.getTitle(), string);
	   
	}


}
