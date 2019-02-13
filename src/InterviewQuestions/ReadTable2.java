package InterviewQuestions;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadTable2 {

	public static void readTableData() throws ParseException {

		// Driver path should be set before browser
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.cricbuzz.com/profiles/1413/virat-kohli";
		driver.get(url);
		driver.manage().window().maximize();
		// Creating a list of type WebElement to store all the Link elements in to it.
		WebElement table1 = driver.findElement(By.xpath("//*[@id='playerProfile']/div[2]/div[2]/div"));
		List<WebElement> rws = table1.findElements(By.tagName("tr"));
		int rcount = rws.size();
		for (int r = 0; r < rcount; r++) {
			List<WebElement> clm = rws.get(r).findElements(By.tagName("td"));

			int c_count = clm.size();
			for (int c = 0; c < c_count; c++) {
				String c_value = clm.get(c).getText();
				for (int j = 0; j < c_value.length(); j++) {

					if (c_value.charAt(j) == '8') {
						System.out.println(c_value);
						continue;//VERY IMPORTANT
					}

				}

				//
			}

		}

	}

	// Main Method
	public static void main(String[] args) throws ParseException {
		readTableData();

	}

}
