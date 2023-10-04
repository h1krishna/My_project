package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.findElement(By.id("alert")).click();
		Alert alerts = wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("Alert is Handled sucessfully");
		
		// Text display
		
		driver.findElement(By.id("populate-text")).click();
		WebElement text = driver.findElement(By.className("target-text"));
		wait.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
		System.out.println(text.isDisplayed());
		
		// Button Display
		
		driver.findElement(By.id("display-other-button")).click();
		WebElement button = driver.findElement(By.id("hidden"));
		wait.until(ExpectedConditions.visibilityOf(button));
		System.out.println(button.isDisplayed());
		
		//Enable button
		driver.findElement(By.id("enable-button")).click();
		WebElement button2 = driver.findElement(By.id("disable"));
		wait.until(ExpectedConditions.visibilityOf(button2));
		System.out.println(button2.isDisplayed());
		
		//checkbox 
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement checkbox = driver.findElement(By.id("ch"));
		wait.until(ExpectedConditions.elementToBeSelected(checkbox));
		System.out.println(checkbox.isSelected());
		
		

	}

}
