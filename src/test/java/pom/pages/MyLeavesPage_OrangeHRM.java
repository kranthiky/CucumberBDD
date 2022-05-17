package pom.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyLeavesPage_OrangeHRM {

	public WebDriver driver;
	static JavascriptExecutor js;
	
	@FindBy(xpath="//h1[contains(text(),'My Leave List')]")
	WebElement header_MyLeaveList;
	
	@FindBy(id="menu_leave_applyLeave")
	WebElement link_Apply;
	
	public MyLeavesPage_OrangeHRM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void isMyLeavePage() {
		header_MyLeaveList.isDisplayed();
		System.out.println("My leaves page is displayed..!");
	}
	
	public void applyLeave() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", link_Apply);
		//link_Apply.click();
		System.out.println("Apply is clicked..!");
		Thread.sleep(3000);
	}
}
