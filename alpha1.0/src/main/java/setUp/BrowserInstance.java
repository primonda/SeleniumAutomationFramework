package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInstance{
	static WebDriver driver;
	
	public static WebDriver startFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver","F:\\Softwares\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver startChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
}
	