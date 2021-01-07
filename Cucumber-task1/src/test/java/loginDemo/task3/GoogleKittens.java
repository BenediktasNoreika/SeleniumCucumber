package loginDemo.task3;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleKittens {
	private static WebDriver driver;
	private static String URL = "http://thedemosite.co.uk";

	@Before
	public static void init() {
		System.setProperty("webdriver.chrome.driver", 
				"src/test/resources/chromedriver.exe");
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.setHeadless(false);
		driver = new ChromeDriver(cOptions);
		driver.manage().window().maximize();
	}

	@After
	public void cleanUp() {
		driver.quit();
	}

	@Given("^I can open the demo site$")
	public void i_can_open_theDemoSite() {
		driver.get(URL);

		assertEquals("FREE example PHP code "
				+ "and a MySQL database. The example is a username "
				+ "and password protected site example", driver.getTitle());

	}
	

	@When("^I add a new user to the site$")
	public void i_navigate_to_addUser() throws InterruptedException {
		Page page = PageFactory.initElements(driver, Page.class);;
		page.createUser("guest", "password");
		
	}

	@Then("^The site will show my new user created$")
	public void new_created_user() throws InterruptedException {
		String result = driver.findElement(By.xpath("//*[contains(text(), 'guest')]")).getText();
		assertEquals("guest",result);
	}

	@When("^I navigate to the login page$")
	public void i_nav_to_login() throws Throwable {
		Page page = PageFactory.initElements(driver, Page.class);;
		page.loginPage();

	}

	@Then("^I can log in as the created user$")
	public void google_will_return_a_puppies_search() throws Throwable {
		Page page = PageFactory.initElements(driver, Page.class);;
		page.login("guest", "password");
		String result = driver.findElement(By.xpath("//*[contains(text(), '**Succesfull login**')]")).getText();
		assertEquals("**Succesfull login**", result);
		

	}
}