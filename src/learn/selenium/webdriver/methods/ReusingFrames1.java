package learn.selenium.webdriver.methods;
//ADVANCED 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusingFrames1 {
	// GLOBAL LEVEL
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		startbrowser("https://socialblade.com/register");

		int fnum = findframenumber(driver, By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(fnum);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
	}

	// REUSABLE METHOD 1

	public static void startbrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);

	}

	// REUSABLE METHOD 2. Pass the driver argument

	public static int findframenumber(WebDriver driver, By by) {

		int i; // both FOR loop and RETURN
		int framecount = driver.findElements(By.tagName("iframe")).size();//1

		for (i = 0; i < framecount; i++) {

			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if (count > 0) {

				break;

			} else {
				System.out.println("Continue Looping");
			}

		}
		// MANDATORY STEP TO SWITCH BACK TO DEFAULT WINDOW
		driver.switchTo().defaultContent();
		return i;
	}

}