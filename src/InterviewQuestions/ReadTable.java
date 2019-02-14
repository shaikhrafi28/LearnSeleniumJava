package InterviewQuestions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadTable {

	public static void readTableData() {

		// Driver path should be set before browser
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.cricbuzz.com/profiles/1413/virat-kohli";
		driver.get(url);
		driver.manage().window().maximize();
		// Creating a list of type WebElement to store all the Link elements in to it.
		WebElement table1 = driver.findElement(By.xpath("//*[@id='playerProfile']/div[2]/div[2]/div"));

		List<WebElement> tvalues = table1
				.findElements(By.xpath("//td[@class='text-right']|//td[@class='cb-plyr-tbody text-right']"));

		int count = tvalues.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String runs = tvalues.get(i).getText();

			System.out.println(runs);

		}
	}

	// Main Method
	public static void main(String[] args) {
		readTableData();

	}

}
