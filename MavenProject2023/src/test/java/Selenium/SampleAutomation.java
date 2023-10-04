package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class SampleAutomation {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//System.setProperty("webdriver.chrome.driver", "D:\\TestingTools\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
//ChromeOptions co=new ChromeOptions();
//co.setBrowserVersion("117");
//WebDriver driver= new ChromeDriver(co);
WebDriver driver=new ChromeDriver();
driver.get("https://www.gmail.com/");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("d.harikrishna216@gmail.com");
driver.findElement(By.xpath("//span[contains(@class,'VfPpkd-vQzf8d']")).click();

	}

}
