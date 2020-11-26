package challenge.agave.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import challenge.agave.pages.CompanyFormPage;
import challenge.agave.pages.HomePage;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUpTestCase() {
		System.setProperty("webdriver.chrome.driver", "/Users/drivers/chromedriver");
		driver = new ChromeDriver();
		goToLandingPage();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quiteDriver() {
		driver.quit();
	}
	
	public void goToLandingPage() {
		driver.get("https://qualifinds.com/");
	}
	
	public HomePage homePage() 
	{
		HomePage homePage = new HomePage(driver);
		return homePage;
	}
	
	public CompanyFormPage companyFormPage() 
	{
		CompanyFormPage companyFormPage = new CompanyFormPage(driver);
		return companyFormPage;
	}
	
}
