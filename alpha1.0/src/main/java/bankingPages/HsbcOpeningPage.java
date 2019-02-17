package bankingPages;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

import utilities.CommonUtilities;
import utilities.PropertiesFileLoader;
import webElements.HsbcOpeningPage_WebElements;;

public class HsbcOpeningPage {
	
	PropertiesFileLoader hsbcOpeningPageElements;
	CommonUtilities commonUtilities;
	
	HsbcOpeningPage(WebDriver driver) throws FileNotFoundException, IOException{
		hsbcOpeningPageElements = PropertiesFileLoader.getPropertyFileLoaderObject(this);
		commonUtilities = CommonUtilities.getCommonUtilsObject(driver);
	}
	
	protected void clickOnLoginButton() {
		commonUtilities.getWebElement(HsbcOpeningPage_WebElements.LOGIN_BUTTON.name(),hsbcOpeningPageElements).click();
	}
}
