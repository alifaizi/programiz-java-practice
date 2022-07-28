package utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
	// We are declaring the WebDriver interface so that we can use it in all of our
	// methods in Utils class
	// and by extending the Utils class, we can also use it in all of our test
	// classes
	public static WebDriver driver;

	// This method will help us to launch browser and it takes two arguments
	// (browserName and url)
	// we can call this method by using the class name (Utils) and (.) and (the
	// method name)
	public static void getBrowser(String browserName, String url) {
		// we created a switch class so that we can handle and open different browsers
		// as per our need and if browser name
		// is misspelled or browser is not available in any of the cases of our switch
		// statement, then chrome browser will be launched
		switch (browserName) {
		case "chrome":
			// by using webdriver manager, we don't have to worry about the version of our
			// chromedriver is the same as the
			// chrome browser
			WebDriverManager.chromedriver().setup();
			// we are using the reference to WebDriver interface and we create object of
			// ChromeDriver();
			driver = new ChromeDriver();
			// we are using the reference to WebDriver and call the method get(); which will
			// allow us to launch the url
			driver.get(url);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(url);
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
		}
		// by using the following line, we are using the manage() method, followed by
		// window() method and then maximize() method
		// to maximize our current window. this is beneficial when we launch the browser
		// and execute test, so that we can see the
		// browser in full screen
		driver.manage().window().maximize();
		// selenium webdriver is giving us the advantage to use wait times while we are
		// executing our test cases
		// and the reason we have these waits in selenium is because the webdriver will
		// only handle the browser and will not
		// interat with webelements,
		// we we launch the browser and then close the browser, there are many other
		// actions that we will need to perform to
		// execute our tests for example click on a button, send a text to a text box
		// and etc...
		// the waits in selenium will help us to handle the webdriver and make sure it
		// waits for some certain condition before
		// moving to next step
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// delete all browser cookies
		driver.manage().deleteAllCookies();
	}
	// this method will help us to use hard wait during test execution if we need to
	// debugg our test script
	// or if we want to pause our test execution for checking our test

	public static void hardWait(int timeUnit) {
		try {
			Thread.sleep(timeUnit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void tearDown() {
		driver.close();
		driver.quit();

	}

	// Checking the status of radio button

	public static boolean checkStatusOfRadioButton(WebElement element) {

		try {
			if (element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {

				System.out.println("Radio button isDisplayed, isEnabled, and is not Selected");

			} else {

				System.out.println("Checking status of radio button/checkbox failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;

	}

	public static void waitUntilElementVisible(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
