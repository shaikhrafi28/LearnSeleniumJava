package learn.selenium.webdriver.methods;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExtractQuestions extends Methods {

	public static void CopyinfosysIQ() {

		// Driver path should be set before browser
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.softwaretestingo.com/infosys-selenium-interview-faq/";
		driver.get(url);
		driver.manage().window().maximize();
		// Creating a list of type WebElement to store all the Link elements in to it.
		List<WebElement> questions = driver.findElements(By.xpath("//*[@id='genesis-content']/article/div/ul/li"));

		int count = questions.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			System.out.println(questions.get(i).getText());

		}
	}
	
	//Main Method
	public static void main(String[] args) {
		CopyinfosysIQ();
		
	}

}
