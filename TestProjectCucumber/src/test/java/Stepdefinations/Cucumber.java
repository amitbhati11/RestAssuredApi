package Stepdefinations;

import io.cucumber.java.en.*;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cucumber {
	
	WebDriver driver=null;

	@Given("open the browser")
	public void open_the_browser() {
		
		String path="C:/Users/Admin_SRV/eclipse-workspace/TestProjectCucumber/drivers/chromedriver.exe";
	 
		System.setProperty("webdriver.chrome.driver", path);
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
	}

	@And("enter the url")
	public void enter_the_url() {
		
		driver.get("https://www.facebook.com/home.php");

		driver.manage().window().maximize();

	}

	@When("Enter username and password")
	public void enter_username_and_password() {
		
		driver.findElement(By.name("email")).sendKeys("9821416708");
		driver.findElement(By.name("pass")).sendKeys("9313421910");
	 
		
	}

	@And("Submit buttont")
	public void submit() {
		
		driver.findElement(By.id("loginbutton")).click();
	 
		
	}

	@Then("click on button")
	public void click_on_button() {
	  
		System.out.println("Sucessfully");
		driver.close();
		driver.quit();
	}
}
