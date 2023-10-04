package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"))
				.sendKeys("shirts");
		
		//List<WebElement> dropdowns = driver.findElements(By.xpath("//div[@class='sc-cOxWqc bLdIZq']/p"));
		//div[@class='sc-cOxWqc bLdIZq']/p
		List<WebElement> dropdowns = driver.findElements(By.xpath("//div//div[@class='sc-cOxWqc bLdIZq']//p"));
		System.out.println(dropdowns.size());
		Thread.sleep(3000);
		for (WebElement list : dropdowns) {
			System.out.println(list.getText());
			if (list.getText().equals("for men")) {
				list.click();
				break;
			}
		}
}
}






















