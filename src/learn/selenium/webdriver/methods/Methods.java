package learn.selenium.webdriver.methods;

import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bson.Document;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;




public class Methods {

	// void is return type

	public static void invokebrowser1() {

		// Driver path should be set before browser
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

	public void dropdowntesting1() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		Select a = new Select(driver.findElement(By.id("select-demo")));
		// a.selectByValue("Sunday");
		a.selectByIndex(3);
		// a.selectByVisibleText("Wednesday");

		/*
		 * driver.findElement(By.xpath(
		 * "//div[@class='landing-page-layout']/div[4]/div/a")).click();
		 * //driver.navigate().to("https://grpsuatwapp2.azurewebsites.net/uploadRoster")
		 * ;
		 * 
		 * driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		 * 
		 * driver.findElement(By.xpath("//*[@id='logonIdentifier']")).sendKeys(
		 * "hdc.4@gmail.com");
		 * driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@123");
		 * driver.findElement(By.id("next")).click();
		 */
	}

	public void dropdowntesting2() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		// CREATE OBJECT USING SELECT CLASS
		Select s = new Select(driver.findElement(By.xpath("//select[@name='country']")));

		// FOR SELECTING PARTICULAR OPTION
		/*
		 * 
		 * s.selectByValue("Sunday"); s.selectByIndex(3);
		 * s.selectByVisibleText("Wednesday");
		 * 
		 * 
		 */

		// FOR LISTING ALL THE OPTIONS
		List<WebElement> alloptions = s.getOptions();

		// TOTAL NUMBER OF OPTIONS
		int count = alloptions.size();

		// LOOP TO ITERATE
		for (int i = 0; i < count; i++) {
			String opt = alloptions.get(i).getText();
			System.out.println(opt);
		}

		/*
		 * driver.findElement(By.name("userName")).sendKeys("qshore");
		 * driver.findElement(By.name("password")).sendKeys("md123");
		 * driver.findElement(By.name("login")).click();
		 * 
		 * 
		 * 
		 * //Select a = new Select(driver.findElement(By.id("select-demo")));
		 * //a.selectByValue("Sunday"); //a.selectByIndex(3);
		 * //a.selectByVisibleText("Wednesday");
		 * 
		 * 
		 * 
		 * 
		 * driver.findElement(By.xpath(
		 * "//div[@class='landing-page-layout']/div[4]/div/a")).click();
		 * //driver.navigate().to("https://grpsuatwapp2.azurewebsites.net/uploadRoster")
		 * ;
		 * 
		 * driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		 * 
		 * driver.findElement(By.xpath("//*[@id='logonIdentifier']")).sendKeys(
		 * "hdc.4@gmail.com");
		 * driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@123");
		 * driver.findElement(By.id("next")).click();
		 */
	}

	public void dropdowntesting3() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		Select a = new Select(driver.findElement(By.id("select-demo")));
		// a.selectByValue("Sunday");
		a.selectByIndex(3);
		// a.selectByVisibleText("Wednesday");

		/*
		 * driver.findElement(By.xpath(
		 * "//div[@class='landing-page-layout']/div[4]/div/a")).click();
		 * //driver.navigate().to("https://grpsuatwapp2.azurewebsites.net/uploadRoster")
		 * ;
		 * 
		 * driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		 * 
		 * driver.findElement(By.xpath("//*[@id='logonIdentifier']")).sendKeys(
		 * "hdc.4@gmail.com");
		 * driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@123");
		 * driver.findElement(By.id("next")).click();
		 */
	}

	// ==================================================================================================================================

	public void dropdowntesting4() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// DYNAMIC
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

	// ===============================================================================================================================

	public static void dropdowntesting5(WebDriver driver) {

		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");

		String url = "https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();

		/*
		 * Code – To get the Count of the total elements inside SELECT and to Print the
		 * text value of every element present in the SELECT.
		 */

		/*
		 * Select menu = new
		 * Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
		 * List<WebElement> alloptions = menu.getOptions(); int count =
		 * alloptions.size();
		 * 
		 * for (int i = 0; i < count; i++) { String svalue =
		 * alloptions.get(i).getText();
		 * 
		 * System.out.println(svalue);
		 * 
		 * }
		 */
		// Code – To select the value watches
		Select menu = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
		menu.selectByVisibleText("Watches");

	}

	public static void linkstesting1() {

		// Driver path should be set before browser
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://10.164.28.23:8080/Login?Type=PO";
		driver.get(url);
		driver.manage().window().maximize();
		// Creating a list of type WebElement to store all the Link elements in to it.
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			System.out.println(links.get(i).getText());

		}
	}

	// =========================================================================================================================
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
	public static void linkstesting2() throws InterruptedException {

		// Driver path should be set before browser
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		// Creating a list of type WebElement to store all the Link elements in to it.

		WebElement fdriver = driver.findElement(By.xpath("//*[@id='navFooter']/table/tbody/tr/td[7]"));
		List<WebElement> links = fdriver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			fdriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			Thread.sleep(5000);
		}

		Set<String> alinks = driver.getWindowHandles();
		Iterator<String> it1 = alinks.iterator();

		while (it1.hasNext()) {

			driver.switchTo().window(it1.next());
			System.out.println(driver.getTitle());
		}
	}

	// REQUIREMENTS
	public static void linkstesting3() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.bbc.com/");
		driver.manage().window().maximize();

		// 1.Give me the Count of links on the page?
		List<WebElement> allinks = driver.findElements(By.tagName("a"));
		int allinkscount = allinks.size();
		System.out.println("Total links are " + allinkscount);

		// 2.Give me the Count of links in the footer section?
		WebElement footerdriver = driver.findElement(By.id("orb-footer"));
		List<WebElement> footerlinks = footerdriver.findElements(By.tagName("a"));
		int footerlinkscount = footerlinks.size();
		System.out.println("Footer links are " + footerlinkscount);

		// 3.Give me the Count of links in the sub footer section?
		WebElement sfooterdriver = footerdriver.findElement(By.className("orb-footer-inner"));
		List<WebElement> sfooterlinks = sfooterdriver.findElements(By.tagName("a"));
		int sfooterlinkscount = sfooterlinks.size();
		System.out.println("Sub Footer links are " + sfooterlinkscount);

		// 4.Click on each link in the sub footer sections and check if the pages are
		// opening.

		for (int i = 1; i < sfooterlinkscount; i++) {

			// Opens all the links in separate tabs.
			String clickonlinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			sfooterlinks.get(i).sendKeys(clickonlinks);

			Thread.sleep(6000);
			// Get the title of each and every tab

			Set<String> tbs = driver.getWindowHandles();
			Iterator<String> it = tbs.iterator();

			while (it.hasNext())

			{
				driver.switchTo().window(it.next());
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
			}

		}

	}

	public void linkstesting4() throws IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		List<WebElement> linksize = driver.findElements(By.tagName("a"));

		int linksCount = linksize.size();
		System.out.println(linksCount);

		// IMPORTANAT STEP
		String[] links = new String[linksCount];

		System.out.println("============List of Expected links==========");

		// PRINT ALL THE LINKS FROM WEBPAGE
		for (int i = 0; i < linksCount; i++) {

			links[i] = linksize.get(i).getAttribute("href");
			String expurl = linksize.get(i).getAttribute("href");

			System.out.println(expurl);

		}

		System.out.println("============List of Actual links==========");
		// NAVIGATE TO EACH LINK ON WEBPAGE
		for (int i = 0; i < linksCount; i++) {

			driver.navigate().to(links[i]);
			Thread.sleep(2000);
			String acturl = driver.getCurrentUrl();

			System.out.println(acturl);

		}
		driver.navigate().back();
	}

	public void linkstesting5() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://10.164.28.22/Login/Index?ReturnUrl=%2f");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		List<WebElement> linksizeall = driver.findElements(By.tagName("a"));
		int count = linksizeall.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {

			String linksize = linksizeall.get(i).getText();
			System.out.println(linksize);
		}

	}

	// ===============================================================================================================================

	public void basicmethods2() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Google bing navigation
		/*
		 * // SIT ENV or Google /Bing. Need wait for SIT
		 * driver.get("https://www.google.com/");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * System.out.println(driver.getTitle()); // By LinkText
		 * driver.findElement(By.linkText("Images")).click();
		 * System.out.println(driver.getTitle());
		 * 
		 * 
		 * // TO NAVIGATE TO NEW WEB ADDRESS
		 * driver.navigate().to("https://www.bing.com/");
		 * System.out.println(driver.getTitle()); // TO NAVIGATE BACK
		 * driver.navigate().back(); // TO NAVIGATE FORWARD
		 * 
		 * // driver.navigate().forward();
		 * 
		 * 
		 * driver.navigate().to("https://outlook.live.com/mail");
		 * System.out.println(driver.getTitle());
		 * driver.findElement(By.className("buttonLargeBlue")).click();
		 * 
		 * 
		 * driver.findElement(By.name("loginfmt")).sendKeys("shaikhrafi08@hotmail.com");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
		 * System.out.println(driver.getTitle());
		 * driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Bhalubunny@08");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\'idSIButton9\']")).click();
		 * System.out.println(driver.getTitle());
		 */

		/*
		 * // GROUPS PORTAL USER 523 LOGS IN TO GROUPS PORTAL
		 * driver.get("https://grpsuatwapp2.azurewebsites.net/uploadRoster");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * // XPATH driver.findElement(By.xpath("//*[@id='logonIdentifier']")).sendKeys(
		 * "hdc.4@gmail.com");
		 * 
		 * // CSS selector
		 * driver.findElement(By.cssSelector("#password")).sendKeys("Test@123");
		 * driver.findElement(By.cssSelector("#next")).click(); //
		 * driver.findElement(By.linkText("Sign up now")).click();
		 * 
		 * // TO CLOSE THE DRIVER. CLOSES CURRENT BROWSER // driver.close();
		 * 
		 * // TO QUIT THE DRIVER. CLOSES ALL THE WINDOWS. // driver.quit();
		 */

		// Salesforce
		driver.get("https://login.salesforce.com/?locale=in");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector("#username")).sendKeys("MAHMUD");

		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12345");

		driver.findElement(By.xpath("//*[@id='Login']")).click();
		// GRAB AND PRINT THE ERROR MESSAGE
		System.out.println("ERROR IS ===> " + driver.findElement(By.cssSelector("#error.loginError")).getText());

	}

	public void basicmethods3() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("https://jira.caqh.org/secure/Dashboard.jspa");
		driver.get("https://stackoverflow.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		// XPATH = //tagname[@attribute = 'Value']

		/*
		 * driver.findElement(By.xpath("//input[@name='os_username']")).sendKeys("SRafi"
		 * ); driver.findElement(By.xpath("//input[@name='os_password']")).sendKeys(
		 * "Shillong@11"); driver.findElement(By.xpath("//input[@id='login']")).click();
		 * 
		 */
		// CSS = tagname[attribute = 'Value'] OR tagname#id
		/*
		 * driver.findElement(By.cssSelector("input[name='os_username']")).sendKeys(
		 * "SRafi");
		 * driver.findElement(By.cssSelector("input[name='os_password']")).sendKeys(
		 * "Shillong@11");
		 * driver.findElement(By.cssSelector("input[id='login']")).click();
		 * driver.quit();
		 */
		// CSS = tagname#id OR tagname.classname
		/*
		 * driver.findElement(By.cssSelector("input#login-form-username")).sendKeys(
		 * "SRafi");
		 * driver.findElement(By.cssSelector("input#login-form-password")).sendKeys(
		 * "Shillong@11");
		 * driver.findElement(By.cssSelector("input#login.button")).click();
		 */

		// XPATH= //tagname[contains(@attribute,'value')] ===== Regular Expression
		// Syntax
		// REDIFF

		// CSS= tagname[attribute*='value'] ===== Regular Expression Syntax
		// REDIFF
		driver.findElement(By.cssSelector("a[class*='btn-clear']")).click();
		// driver.findElement(By.cssSelector("input[id*='rollno']")).sendKeys("1213");
		driver.findElement(By.xpath("//div[@class='-container']/ol/li[6]/a[2]")).click();

	}

	public static void containssiblingancestor1() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");

		driver.manage().window().maximize();
		// List <WebElement> dateBox =
		// driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular
		// courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2
		// rt-omega']"));
		List<WebElement> dateBox = driver.findElements(By.xpath(
				"//h2[contains(text(),'Check out our newest courses')]/parent::div//div[//a[text()='SAP MM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
		for (WebElement webElement : dateBox) {
			System.out.println(webElement.getText());
		}
	}

	// ==================================================================================================================================

	public static void windowHandling1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://10.164.28.22/Login/Index?ReturnUrl=%2f");
		driver.manage().window().maximize();

		driver.findElement(By.id("UserName")).sendKeys("uatpo1234");

		driver.findElement(By.id("Password")).sendKeys("Test@123");

		driver.findElement(By.xpath("//div[@class='col-xs-8']/button")).click();
		Thread.sleep(5000);

		// FOR SCROLL . JAVASCRIPT EXECUTOR
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1400)", "");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@class='footer-nav']/ul/li[1]/a")).click();
		String urlname = driver.getTitle();
		System.out.println(urlname);

		// HANDLING WINDOWS

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		String parentid = it.next();
		String childid = it.next();

		// Switching to child window
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());

		// Switching to parent window
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

	}

	// ==================================================================================================================================//

	public static void windowHandling2() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		// switch to frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		// webelement for any webelement insted of string
		WebElement drag = driver.findElement(By.id("draggable"));
		drag.click();

		// DRAG AND DROP
		Actions a = new Actions(driver);
		a.dragAndDropBy(drag, 100, 100);
		// int size = driver.findElements(By.tagName("iframe")).size();
		// System.out.println(size);
	}

	public static void frameHandling1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		// switch to frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		// webelement for any webelement insted of string
		WebElement drag = driver.findElement(By.id("draggable"));
		drag.click();

		// DRAG AND DROP
		Actions a = new Actions(driver);
		a.dragAndDropBy(drag, 100, 100);
		// int size = driver.findElements(By.tagName("iframe")).size();
		// System.out.println(size);
	}

	// ====================================================================================================================================

	public static void frameHandling2() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		// switch to frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		// webelement for any webelement insted of string
		WebElement drag = driver.findElement(By.id("draggable"));
		drag.click();

		// DRAG AND DROP
		Actions a = new Actions(driver);
		a.dragAndDropBy(drag, 100, 100);
		// int size = driver.findElements(By.tagName("iframe")).size();
		// System.out.println(size);
	}

	public static void actionsTesting1() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://www.amazon.com/";
		driver.get(url);
		driver.manage().window().maximize();

		// LECTURE 63
		// Creating object a with action class
		Actions a = new Actions(driver);
		// mouse hovers TO SPECIFIC ELEMENT
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		;
	}

	// ========================================================================================================================
	public static void actionsTesting2() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://www.amazon.com/";
		driver.get(url);
		driver.manage().window().maximize();

		// LECTURE 64
		// Creating object a with action class
		Actions a = new Actions(driver);

		// EXPLICIT WAIT
		WebDriverWait wt = new WebDriverWait(driver, 2);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='twotabsearchtextbox']")));

		// for right click
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

		// for textbox
		WebElement txtbox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

		// mouse hovers TO SPECIFIC ELEMENT
		a.moveToElement(txtbox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

		a.moveToElement(move).build().perform();
		a.moveToElement(move).contextClick().build().perform();

		// tab out
		// a.moveToElement(txtbox).click().keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
	}

	public static void alertsTesting1() {

		// Driver path should be set before browser
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
		driver.get(url);
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button")).click();

		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
	}

	// in progress
	public static void calenderTesting1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/input")).click();
		Thread.sleep(5000);

		// MONTH
		WebElement departmonth = driver.findElement(
				By.xpath("//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/div/div/div[2]/div[1]"));

		WebElement monthdriver = driver.findElement(
				By.xpath("//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/div/div/div[1]/span[1]"));

		while (!departmonth.getText().contains("July")) {

			monthdriver.click();

		}

		// DAY
		WebElement departdate = driver.findElement(
				By.xpath("//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/div/div/div[2]/div[3]"));
		List<WebElement> adates = departdate.findElements(By.className("DayPicker-Day"));
		int adatescount = adates.size();
		System.out.println(adatescount);

		// 28 july--- selecting date

		for (int i = 1; i <= adatescount; i++) {
			String vdate = departdate.findElements(By.className("DayPicker-Day")).get(i).getText();
			if (vdate.equalsIgnoreCase("28")) {
				departdate.findElements(By.className("DayPicker-Day")).get(i).click();
				break;
			}

		}

	}

	public static void calenderTesting2() {

		ChromeOptions options = new ChromeOptions();
		// Add chrome switch to disable notification - "--disable-notifications"
		options.addArguments("--disable-notifications");

		// Driver path should be set before browser
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		String url = "https://www.makemytrip.com/";
		driver.get(url);
		driver.manage().window().maximize();
		// APRIL 14
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();

	}

	// Lecture 51
	public static void webelementvalidation1() {
		// isDisplayed method - for validating hidden elements. only works with hidden
		// elements.

		// To disable the notifications use 'options'

		// Create a instance of ChromeOptions class
		ChromeOptions options = new ChromeOptions();

		//// Add chrome switch to disable notification - "--disable-notifications"
		options.addArguments("--disable-notifications");

		// Driver path should be set before browser. //Set path for driver exe

		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		// Pass ChromeOptions instance to ChromeDriver Constructor
		WebDriver driver = new ChromeDriver(options);

		String url = "https://www.makemytrip.com/";
		driver.get(url);
		driver.manage().window().maximize();

		System.out.println("Before Selecting MultiTrip");
		System.out.println(driver.findElement(By.xpath("//*[@id='js-multiCitySearchFrom_1']")).isDisplayed());

		driver.findElement(By.xpath("//*[@id='js-switch__option']/div[3]/label")).click();

		System.out.println("After Selecting MultiTrip");
		System.out.println(driver.findElement(By.xpath("//*[@id='js-multiCitySearchFrom_1']")).isDisplayed());

	}

	// DOUBT
	public static void webelementvalidation2() {
		// isEnabled method -
		// To disable the notifications use 'options'

		// Create a instance of ChromeOptions class
		ChromeOptions options = new ChromeOptions();

		//// Add chrome switch to disable notification - "--disable-notifications"
		options.addArguments("--disable-notifications");

		// Driver path should be set before browser. //Set path for driver exe

		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		// Pass ChromeOptions instance to ChromeDriver Constructor
		WebDriver driver = new ChromeDriver(options);

		String url = "https://www.makemytrip.com/";
		driver.get(url);
		driver.manage().window().maximize();

		System.out.println("Before Selecting RoundTrip");

		// IMPORTANT Readonly vs enabled
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).getAttribute("readonly"));

		driver.findElement(By.xpath("//*[@id='js-switch__option']/div[2]/label")).click();

		System.out.println("After Selecting RoundTrip");
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());

	}

	// LEC 144
	public static void readexcel1() throws IOException {

		FileInputStream fis = new FileInputStream(
		"C:\\Users\\shaikh.mohammad.rafi\\Documents\\Regression\\100AUT\\CAQH_ML4000P100_V1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Providers");

		for (int i = 0; i < 20; i++) {
			XSSFRow rw = sh.getRow(i);
			XSSFCell ce = rw.getCell(1);

			String Value = ce.getStringCellValue();
			System.out.println(Value);
		}
	}

	public static void readexcel2() throws IOException {
		/*
		 * WORKBOOK SHEET ROW CELL grab value / set value
		 */
		FileInputStream fis = new FileInputStream("C:\\Users\\shaikh.mohammad.rafi\\Videos\\worktrackerveeraj.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//Row row = sh.getRow(2);
		//Cell cell = row.getCell(3);
		XSSFRow rw = sh.getRow(27);
		XSSFCell ce = rw.getCell(4);
		
		System.out.println(ce);

	}
	
	
	
	
	public void readexcel3(String filePath, String fileName, String sheetName) throws IOException {

		// Create an object of File class to open xlsx file
		File file = new File(filePath + "\\" + fileName);
		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb = null;

		// Find the file extension by splitting file name in substring and getting only
		// extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		// Check condition if the file is xlsx file
		if (fileExtensionName.equals(".xlsx")) {

			// If it is xlsx file then create object of XSSFWorkbook class
			wb = new XSSFWorkbook(inputStream);
		}

		// Check condition if the file is xls file
		else if (fileExtensionName.equals(".xls")) {

			// If it is xls file then create object of XSSFWorkbook class
			wb = new HSSFWorkbook(inputStream);
		}

		// Read sheet inside the workbook by its name
		Sheet sh = wb.getSheet("sheetName");

		// Find number of rows in excel file
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();

		// Create a loop over all the rows of excel file to read it

		for (int i = 0; i < rowCount + 1; i++) {
			Row row = sh.getRow(i);

			// Create a loop to print cell values in a row
			for (int j = 0; j < row.getLastCellNum(); j++) {

				// Print Excel data in console
				System.out.print(row.getCell(j).getStringCellValue() + "|| ");
			}
			System.out.println();
		}
	}

	

	public static void AutoSuggestion1() throws InterruptedException {
		// Enter the letters BENG.
		// Verify if airport option is displayed in the suggestive box.

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath(".//*[@id='fromPlaceName']")).click();
		driver.findElement(By.xpath(".//*[@id='fromPlaceName']")).sendKeys("SRI");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		

		/*
		 * javascript DOM can extract hidden elements. selenium can not identify hidden
		 * elements (ajax implementation) investigate the properties of object if it
		 * have any hidden text
		 */

		// JAVASCRIPT EXECUTOR
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		while (!text.equalsIgnoreCase("SRIRANGAPATNA")) {

			i++;
			driver.findElement(By.xpath(".//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			Thread.sleep(2000);

			if (i > 10) {
				break;
			}

		}

		if (i > 10) {
			System.out.println("Element not found");
			
		} else {
			System.out.println("Element mil gaya hai");
			driver.findElement(By.xpath(".//*[@id='fromPlaceName']")).sendKeys(Keys.TAB);
		}
	}

	
	public static void fetchmongodb1() {
		
		/*
		 * connect to mongodb using new MongoClient(“localhost”,27017); connect to
		 * database using client.getDatabase(“employee_db”); Get collection using
		 * database.getCollection(“employees”);
		 * 
		 */
		
		//MongoClientURI uri = new MongoClientURI("mongodb://user1:pwd1@host1/?authSource=db1");
		MongoClientURI uri = new MongoClientURI("mongodb://sitmdb1usr1:5d69uttju<q9v@10.0.0.6:27017/?authSource=grpssitmdb1");
		MongoClient client = new MongoClient(uri); //with default server and port adress
		MongoDatabase database = client.getDatabase( "grpssitmdb1" );
		

		
		
	MongoCollection<Document> collection = database.getCollection("Groups");
	FindIterable<Document> iterDoc = collection.find(); 
    int i = 1; 

    // Getting the iterator 
    Iterator it = iterDoc.iterator(); 
  
    while (it.hasNext()) {  
       System.out.println(it.next());  
    i++; 
    }
		
		/*List<Document> documents = (List<Document>) collection.find().into(
				new List<Document>());
 
               for(Document document : documents){
                   System.out.println(document);
                  
               }	
		*/	
	}
	
	
	
	
	
public static void tableHandling1() throws InterruptedException {
		
		int sum = 0;
		//To disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver(options);
	
		driver.get("https://www.cricbuzz.com/cricket-scores/18877/eng-vs-ind-1st-t20i-india-tour-of-england-2018");
		
	//	driver.get("http://www.cricbuzz.com/");
		driver.manage().window().maximize();
	
	//	driver.findElement(By.xpath("//div[@id='hm-scag-mtch-blk']/div/div/div[2]")).click();
		driver.findElement(By.xpath("//nav[@class='cb-nav-bar']/a[2]")).click();
		Thread.sleep(2000);
		
		//REDUCE THE FOCUS TO THE SCORETABLE
		WebElement scoretable = driver.findElement(By.xpath("//div[@id='strip_wrapper']/following-sibling::div/div[2]"));
		
		/*using css selector
		int players = scoretable.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count = scoretable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();*/
		
		
		for(int i=0;i<=9;i++) {
			
		//nth-child for table
		//String scores=scoretable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		String scores=scoretable.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
		//System.out.println(scores);
		
		int allscores = Integer.parseInt(scores);
		sum = (sum + allscores);
		}
		//System.out.println(scoretable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(2)")).get(11).getText());
		
		
		
		
		//using text()
		//System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		
		String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extravalue = Integer.parseInt(extras);
        int ctotalscorevalue = sum +extravalue;
        System.out.println(ctotalscorevalue);
      
        
        String total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int totalvalue = Integer.parseInt(total);
		System.out.println(totalvalue);
		
		
		if(ctotalscorevalue==totalvalue) {
			System.out.println("Sahi hai");
		}
        
		else {
			System.out.println("galat hai");
		}
	
		
		
	}
	
}




