package bankingPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import utilities.CommonUtilities;
import utilities.PropertiesFileLoader;
import webElements.InternetBankingLoginPage_WebElements;

public class InternetBankingLoginPage {
	PropertiesFileLoader internetBankingLoginPageElements;
	CommonUtilities commonUtilities;

	InternetBankingLoginPage(WebDriver driver) throws FileNotFoundException, IOException {
		internetBankingLoginPageElements = PropertiesFileLoader.getPropertyFileLoaderObject(this);
		commonUtilities = CommonUtilities.getCommonUtilsObject(driver);
	}

	protected void enterUserName() {
		commonUtilities.clickOnElement(commonUtilities.getWebElement(
				InternetBankingLoginPage_WebElements.USER_NAME_TEXT_FIELD.name(), internetBankingLoginPageElements));
		commonUtilities.enterTextFieldValue(
				commonUtilities.getWebElement(InternetBankingLoginPage_WebElements.USER_NAME_TEXT_FIELD.name(),
						internetBankingLoginPageElements),
				"");

	}
}
