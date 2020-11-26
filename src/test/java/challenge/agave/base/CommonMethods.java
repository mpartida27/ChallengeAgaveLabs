package challenge.agave.base;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseTest {

	protected WebDriver driver;
	WebDriverWait wait;

	public CommonMethods(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	public void clickElement(WebElement element) {
		waitForElementToBeClickable(element);
		element.click();
	}

	public void enterText(WebElement element, String text) {
		waitForElementToBeVisible(element);
		clickElement(element);
		element.clear();
		element.sendKeys(text);
	}

	public void waitForElementToBeVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public boolean isElementPresent(WebElement element) {
		WebElement elementPresent = wait.until(ExpectedConditions.visibilityOf(element));
		if (elementPresent != null) {
			return true;
		} else {
			return false;
		}
	}

	public void switchWindow() {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.close();
		driver.switchTo().window(tabs2.get(1));
	}
	
}
