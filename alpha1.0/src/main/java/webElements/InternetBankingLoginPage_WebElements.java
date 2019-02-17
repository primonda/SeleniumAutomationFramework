package webElements;

public enum InternetBankingLoginPage_WebElements {
	
	USER_NAME_TEXT_FIELD("userNameTextField"),LOGIN_WITH_PASSWORD_BUTTON("loginWithPasswordsButton"),PRIMARY_PASSWORD_FIELD("primaryPassword"),SECONDARY_PASSWORD_FIELD("secondaryPassword") ,CONTINUE_BUTTON("continueButton");

	private final String value ;
	private InternetBankingLoginPage_WebElements(String value) {
		this.value = value;
	}
}
