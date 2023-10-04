package Selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		 Set<String> allwindows = driver.getWindowHandles();
		 Iterator<String> it = allwindows.iterator();
		String window1 = it.next();
		//String w1 = it.next();
		String window2 = it.next();
		driver.switchTo().window(window2);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Harikrishna");
		Thread.sleep(4000);
		driver.switchTo().window(window1);
		
		driver.quit();
		
		

	}

}
