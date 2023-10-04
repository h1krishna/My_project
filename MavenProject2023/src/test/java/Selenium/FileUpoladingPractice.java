package Selenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpoladingPractice {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scorollBy(0,300)");
		driver.findElement(By.xpath("//div[@class='uploadResumeCont']")).click();
		Robot rb=new Robot();
		rb.delay(3000);
		StringSelection path=new StringSelection("C:\\Users\\Admin\\OneDrive\\Desktop\\HARIKRISHNA D.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}

}
