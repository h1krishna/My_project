package Selenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		// selecting iphone 13 from dynamic dropdown
		List<WebElement> dropdown = driver.findElements(By.xpath("//div[@role='button']//span"));
		System.out.println(dropdown.size());
		for (WebElement list : dropdown) {
			System.out.println(list.getText());

			if (list.getText().contains("13 pro")) {
				list.click();
				break;
			}

		}
//		// selecting watches from Static dropdown
//		WebElement li = driver.findElement(By.id("searchDropdownBox"));
//		Select se = new Select(li);
//		se.selectByVisibleText("Watches");
	}
}
