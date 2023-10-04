package Selenium;

import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		// WebDriver driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		// driver.findElement(By.id("name")).sendKeys("harikrishna");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Harikrishna");
		driver.findElement(By.cssSelector("#email")).sendKeys("harikrishnadevatha@gamil.com");
		driver.findElement(By.cssSelector("#phone")).sendKeys("9966804603");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("H.No:133");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		// driver.findElement(By.xpath("//div[@class='form-check
		// form-check-inline'][5]")).click();
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[value*='day']"));

		for (int i = 0; i < 7; i++) {
			checkboxes.get(i).click();
		}

		WebElement country = driver.findElement(By.id("country"));
		Select se = new Select(country);
		// se.selectByVisibleText("India");
		se.selectByIndex(9);
	}
}