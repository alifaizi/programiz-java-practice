package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static void launchBrowser(String broweserName, String url) {

		switch (broweserName) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
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

		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.get(url);
			break;

		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			driver.get(url);
			break;

		case "opera":
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			driver.get(url);
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);

		}

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

	}

	public static void testExecutionWait(int timeunit) {

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void closeAllBrowserWindowOpenedBySelenium() {

		driver.close();
		driver.quit();
	}

}
