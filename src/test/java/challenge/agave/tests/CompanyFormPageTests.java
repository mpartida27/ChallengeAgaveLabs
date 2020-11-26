package challenge.agave.tests;

import org.testng.annotations.Test;

import challenge.agave.base.BaseTest;
import challenge.agave.base.Data;

public class CompanyFormPageTests extends BaseTest {
	
	@Test(dataProvider="user_data", dataProviderClass = Data.class)
	public void iniciateContractHappyPath(String name, String email, String phone, String file) throws InterruptedException 
	{
		homePage().clickIniciateContractButton();
		companyFormPage().isBetterCandidateLabelPresent();
		companyFormPage().fillNameAndLastName(name);
		companyFormPage().fillEmailTextField(email);
		companyFormPage().fillPhoneNumberTextField(phone);
		companyFormPage().uploadDescriptionFileInput(file);
		companyFormPage().clickSubmitButton();
		companyFormPage().isFormFilledCorrectly();
	}

}
