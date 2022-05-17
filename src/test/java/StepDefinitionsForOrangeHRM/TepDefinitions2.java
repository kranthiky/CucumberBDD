package StepDefinitionsForOrangeHRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.pages.DashboardPage_OrangeHRM;
import pom.pages.LoginPage_OrangeHRM;
import pom.pages.MyLeavesPage_OrangeHRM;

public class TepDefinitions2 {

//	public static WebDriver driver;
//	static LoginPage_OrangeHRM loginPage;
//	static DashboardPage_OrangeHRM dashboardPage;
//	static MyLeavesPage_OrangeHRM myLeavesPage;
//	
//	@Given("^the browser is launched$")
//	public void the_browser_is_launched() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
//
//	@When("^the user browsed (.*)$")
//	public void the_user_entered_url(String url) throws InterruptedException {
//	driver.get(url);
//	Thread.sleep(3000);	
//	}
//		
//	@Then("^Orange HRM application is launched$")
//	public void orange_hrm_application_is_launched() {
//		loginPage = new LoginPage_OrangeHRM(driver);
//		loginPage.isLoginPage();
//	}
//	
//	//===============Login page=================
//	
//	@Given("^user is on login page$")
//	public void user_is_on_login_page() {
//	}
//
//	@When("^user entered (.*) and (.*) and click LOGIN button$")
//	public void user_entered_username_and_password(String username, String password) throws InterruptedException {
//		loginPage.loginToApp(username, password);
//	}
//
//	@Then("^user is navigated to Dashboard page$")
//	public void user_is_navigated_to_dashboard_page() {
//		dashboardPage = new DashboardPage_OrangeHRM(driver);
//		dashboardPage.isDashboardPage();
//	}
//	//===============My Leaves=================
//	@Given("user is on Dashboard page")
//	public void user_is_on_dashboard_page() {
//		dashboardPage.isDashboardPage();
//	}
//
//	@When("user clicks My Leave link")
//	public void user_clicks_my_leave_link() throws InterruptedException {
//		dashboardPage.checkMyLeaves();
//	}
//
//	@Then("user is navigated to My Leave page")
//	public void user_is_navigated_to_my_leave() {
//		myLeavesPage = new MyLeavesPage_OrangeHRM(driver);
//		myLeavesPage.isMyLeavePage();
//	}
//	//===============Apply Leave=================
//		@Given("user is on My Leave page")
//		public void user_is_on_MyLeave_page() {
//			myLeavesPage.isMyLeavePage();
//		}
//
//		@When("user clicks Apply link")
//		public void user_clicks_Apply_link() throws InterruptedException {
//			myLeavesPage.applyLeave();
//		}
//
//		@Then("user is navigated to Apply Leave page")
//		public void user_is_navigated_to_Apply_leave() {
//			
//		}
}
