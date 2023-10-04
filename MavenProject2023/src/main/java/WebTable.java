import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		int row = driver.findElements(By.xpath("//table[@id='countries']//tbody//tr")).size();
		System.out.println(row);
		int coloumn = driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
		System.out.println(coloumn);                //table[@id='countries']//tr[1]//td=5
		for (int i = 1; i <= row; i++) {          //table[@id='countries']//tr//td=985
			for (int j = 1; j <= coloumn; j++) {
				String value = driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]/td["+j+"]"))
						.getText();          //table[@id='countries']//tr[1]//td[5]
				// System.out.println(value);
				if (value.contains("Indian Rupee")) {
					checkboxes(driver, i);
					break;
				}
			}
		}
	}

	public static void checkboxes(WebDriver driver, int i) {
		driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td[1]//input")).click();

	}

}
