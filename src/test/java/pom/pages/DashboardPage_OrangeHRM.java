package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage_OrangeHRM {

	public WebDriver driver;
	
	@FindBy(id="menu_dashboard_index")
	WebElement menu_dashboard;
	
	@FindBy(xpath="//span[contains(text(),'My Leave')]")
	WebElement link_MyLeave;
	
	public DashboardPage_OrangeHRM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void isDashboardPage() {
		menu_dashboard.isDisplayed();
		System.out.println("Dashboard page is displayed..!");
	}
	public void checkMyLeaves() throws InterruptedException {
		link_MyLeave.click();
		Thread.sleep(3000);
	}
}
