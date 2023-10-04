package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Demo {
	WebDriver driver;
	@BeforeMethod
	public void BrowserSetup (){
		driver=new ChromeDriver();
		driver.get("http://poojastore.marolix.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@Test
	public void login(){
		driver.findElement(By.xpath("//a[text()='Links']")).click();
		driver.findElement(By.xpath("//input[@title='Enter email / mobile number']")).sendKeys("pooja132@gamil.com");
		driver.findElement(By.xpath("//input[@title='Please enter your password']")).sendKeys("1234");
		
	}
	@Test
	public void test2() {
		
	}

}
