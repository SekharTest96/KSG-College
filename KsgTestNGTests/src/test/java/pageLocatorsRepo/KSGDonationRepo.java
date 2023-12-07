package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.DriversInit;

public class KSGDonationRepo {

	
Actions act = new Actions(DriversInit.driver);
	
	public KSGDonationRepo(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}

	 @FindBy (how = How.XPATH, using = "") WebElement ;
			 @FindBy(xpath= " ") WebElement ;
		 @FindBy (how = How.XPATH, using = "") WebElement ;
			 @FindBy(xpath= " ") WebElement ;
		// @FindBy (how = How.XPATH, using = "") WebElement ;
			// @FindBy(xpath= " ") WebElement ;
	
	
	public void hoverOnContactAndSelectContact() {
		
		act.moveToElement(contact2).build().perform();
		contact2.click();
		act.moveToElement(contact1).build().perform();
		
		contact1.click();

	}
 
	public void checkContactHeading() {
		String actualHeading =contactHeading.getText().trim();
		String expectedHeading = "Contact";
		Assert.assertEquals(actualHeading, expectedHeading);

	}
	
	public void checkContactTitle() {
		String actualTitle = DriversInit.driver.getTitle();
		String expectedTitle = "Contact";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
}
