package challenge.agave.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import challenge.agave.base.CommonMethods;

public class HomePage extends CommonMethods {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css=".navbar-btn")
	WebElement iniciateContractButton;
	
	public void clickIniciateContractButton() 
	{
		clickElement(iniciateContractButton);
	}
	

}
