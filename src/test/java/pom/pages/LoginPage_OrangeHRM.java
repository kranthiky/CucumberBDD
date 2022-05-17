package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_OrangeHRM {

	public WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement txt_username;
	
	@FindBy(id="txtPassword")
	WebElement txt_password;
	
	@FindBy(id="btnLogin")
	WebElement btn_login;
	
	public LoginPage_OrangeHRM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void isLoginPage() {
		txt_username.isDisplayed();
		System.out.println("OrangeHRM login page is displayed..!");
	}

	public void loginToApp(String userName, String password) throws InterruptedException {
		txt_username.sendKeys(userName);
		txt_password.sendKeys(password);
		Thread.sleep(3000);
		btn_login.click();
	}
}
