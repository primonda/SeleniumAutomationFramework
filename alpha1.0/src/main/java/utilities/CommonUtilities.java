package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtilities {
    WebDriver driver;
    private static CommonUtilities commonUtils;
	private CommonUtilities(WebDriver driver) {
		this.driver = driver;
	}
	public void clickOnElement(WebElement elem) {
		elem.click();
	}
	
	public void enterTextFieldValue(WebElement elem , String keysToSend) {
		elem.sendKeys(keysToSend);
	}
	
	public WebElement getWebElement(String webElementXpath,PropertiesFileLoader properties) {
		return driver.findElement(By.xpath(properties.pageElementsProperties.getProperty(webElementXpath)));
	}
	
	public static CommonUtilities getCommonUtilsObject(WebDriver driver){
		if(commonUtils == null) {
			commonUtils = new CommonUtilities(driver);
		}
		return commonUtils;
	}
}
