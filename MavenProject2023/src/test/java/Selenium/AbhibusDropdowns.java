package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhibusDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com");
	
 driver.findElement(By.xpath("//div[@class='container form-control  ']//input[@tabindex='1']")).sendKeys("hyderabad");
 
//    for(WebElement dd:dropdown) {
//    	if(dd.getText().contains("Hyderabad")) {
//    		dd.click();
//    	}
//    }
	}

}
