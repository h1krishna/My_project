package Selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		// Handling the alert
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		// Handling the Confirmbox 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
		driver.switchTo().alert().accept();
		
		//handling the prompt
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("harikrishna");
		alert.accept();
		
		//double click the button
		Thread.sleep(3000);
        WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		Actions ac = new Actions(driver);
		ac.doubleClick(button).build().perform();
		
		//Drag and Drop webelement
		WebElement sourcefile = driver.findElement(By.id("draggable"));
		WebElement destinationfile = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(sourcefile, destinationfile).build().perform();
		// Rightclick-----contexclick() is a method
		 WebElement rightclick = driver.findElement(By.id("name"));
		 ac.contextClick(rightclick).build().perform();
		 

	}

}
