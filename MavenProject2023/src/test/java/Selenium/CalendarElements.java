package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String month = "July";
		String date = "7";
		String year = "2025";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		driver.findElement(By.id("first_date_picker")).click();

		while (true) {

			String monthandyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			String[] month_year = monthandyear.split(" ");

			String mnth = month_year[0];

			String yr = month_year[1];

			if (mnth.equalsIgnoreCase(month) && (yr.equals(year))) {

				break;
			}

			else {

				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

			}

		}

		List<WebElement> days = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));

		for (WebElement dates : days) {

			if (dates.getText().equals(date)) {

				dates.click();

			}

		}
	}
}
