package StepDefinitionsForOrangeHRM;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.pages.DashboardPage_OrangeHRM;
import pom.pages.LoginPage_OrangeHRM;
import pom.pages.MyLeavesPage_OrangeHRM;

public class OrangeHRmStepDefinitions {

	public static WebDriver driver;
	public static Properties prop;
	static LoginPage_OrangeHRM loginPage;
	static DashboardPage_OrangeHRM dashboardPage;
	static MyLeavesPage_OrangeHRM myLeavesPage;
		

	@Before(order=1)
	public void the_browser_is_launched() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/configurations/config.properties");
			prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		driver.get(prop.getProperty("url"));
		Thread.sleep(5000);	

	}
	
	@After
	public void teardown() throws InterruptedException {
		driver.quit();
		Thread.sleep(3000);
	}

	//===============Background - Login=================

	@Given("^user browsed URL and on login page$")
	public void user_is_on_login_page() throws InterruptedException {
		loginPage = new LoginPage_OrangeHRM(driver);
		loginPage.isLoginPage();
	}

	@When("^user entered username and password and click LOGIN button$")
	public void user_entered_username_and_password() throws InterruptedException {
		loginPage.loginToApp(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Login to Orange HRM is successful");
	}

	@Then("^user is navigated to Dashboard page$")
	public void user_is_navigated_to_dashboard_page() throws InterruptedException {
		dashboardPage = new DashboardPage_OrangeHRM(driver);
		dashboardPage.isDashboardPage();
		Thread.sleep(3000);
	}
	//===============My Leaves=================
	@Given("user is on Dashboard page")
	public void user_is_on_dashboard_page() throws InterruptedException {
		dashboardPage.isDashboardPage();
	}

	@When("user clicks My Leave link")
	public void user_clicks_my_leave_link() throws InterruptedException {
		dashboardPage.checkMyLeaves();
	}

	@Then("user is navigated to My Leave page")
	public void user_is_navigated_to_my_leave() {
		myLeavesPage = new MyLeavesPage_OrangeHRM(driver);
		myLeavesPage.isMyLeavePage();
	}
	//===============Apply Leave=================
	@Given("user is on My Leave page")
	public void user_is_on_MyLeave_page() throws InterruptedException {

		dashboardPage.isDashboardPage();
		dashboardPage.checkMyLeaves();
		myLeavesPage = new MyLeavesPage_OrangeHRM(driver);
		myLeavesPage.isMyLeavePage();
	}

	@When("user clicks Apply link")
	public void user_clicks_Apply_link() throws InterruptedException {
		myLeavesPage.applyLeave();
	}

	@Then("user is navigated to Apply Leave page")
	public void user_is_navigated_to_Apply_leave() {

	}
	//========= LoginToOrangeHRM steps=========
	@Given("^the browser is launched$")
	public void the_browser_launched() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@When("^the user browsed (.*)$")
	public void the_user_entered_url(String url) throws InterruptedException {
	driver.get(url);
	Thread.sleep(3000);	
	}
		
	@Then("^Orange HRM application launched$")
	public void orange_hrm_application_is_launched() {
		loginPage = new LoginPage_OrangeHRM(driver);
		loginPage.isLoginPage();
	}
	
	//===============Login page=================
	
	@Given("^user is on login page$")
	public void user_on_login_page() {
		loginPage.isLoginPage();
	}

	@When("^user enter (.*) and (.*) and click LOGIN button$")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
		loginPage.loginToApp(username, password);
	}

	@Then("^user navigated to Dashboard page$")
	public void user_navigated_to_dashboard_page() {
		dashboardPage = new DashboardPage_OrangeHRM(driver);
		dashboardPage.isDashboardPage();
	}
}
