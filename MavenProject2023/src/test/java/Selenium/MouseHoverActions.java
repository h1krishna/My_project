package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationstepbystep.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement hover = driver.findElement(By.xpath("//a[text()='Selenium']"));
         Actions ac=new Actions(driver);
         ac.moveToElement(hover).build().perform();
         
	}

}
