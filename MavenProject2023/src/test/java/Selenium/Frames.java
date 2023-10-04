package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Switching to Frame1
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frm1']"));
		driver.switchTo().frame(frame1);
		WebElement dropdown = driver.findElement(By.id("course"));
		Select se = new Select(dropdown);
		se.selectByIndex(2);
		// Switching to main page
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Tech News']")).click();
		driver.navigate().back();

		// switching to frame 2
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frm2']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.id("firstName")).sendKeys("Harikrishna");
		driver.findElement(By.id("lastName")).sendKeys("Devatha");
		driver.findElement(By.id("malerb")).click();
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@name='language']"));
		for (WebElement ch : checkboxs) {
			if (ch.getText().equalsIgnoreCase("")) {
				ch.click();

			}

		}

		driver.findElement(By.id("email")).sendKeys("d.harikrishna216@gmail.com");
		

	}

}
