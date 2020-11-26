package challenge.agave.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import challenge.agave.base.CommonMethods;

public class CompanyFormPage extends CommonMethods {

	public CompanyFormPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css=".mb-0")
	WebElement bestCandidateLabel;
	
	@FindBy(css="#name")
	WebElement nameAndLastNameTextField;
	
	@FindBy(css="#email")
	WebElement emailTextField;
	
	@FindBy(css="#phone")
	WebElement phoneNumberTextField;
	
	@FindBy(css="input[type='file']")
	WebElement descriptionFileInput;
	
	@FindBy(css=".btn")
	WebElement submitButton;

	@FindBy(css=".swal-icon--success__ring")
	WebElement confirmationIcon;
	
	
	public void isBetterCandidateLabelPresent() 
	{
		switchWindow();
		Assert.assertTrue(isElementPresent(bestCandidateLabel), "Best Candidate Label it's not present");
	}
	
	public void isFormFilledCorrectly() 
	{
		Assert.assertTrue(isElementPresent(confirmationIcon), "Form its not correctly filled");
	}
	
	public void fillNameAndLastName(String nameAndLastName) 
	{
		enterText(nameAndLastNameTextField, nameAndLastName);
	}
	
	public void fillEmailTextField(String email) 
	{
		enterText(emailTextField, email);
	}
	
	public void fillPhoneNumberTextField(String phoneNumber) 
	{
		enterText(phoneNumberTextField, phoneNumber);
	}
	
	public void uploadDescriptionFileInput(String filePath) 
	{
		descriptionFileInput.sendKeys(filePath);
	}
	
	public void clickSubmitButton() 
	{
		clickElement(submitButton);
	}
}
