package pageLocatorsRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.DriversInit;

public class KSGFacilitiesRepo {


	Actions act = new Actions(DriversInit.driver);
	
	public KSGFacilitiesRepo(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}

	 @FindBy (how = How.XPATH, using = "//a[@href=\"faclities.php\"]") WebElement facilities;
		 @FindBy(xpath= "//h6[contains(text(), \"Transportation\")]") WebElement transportHeading;
	// @FindBy (how = How.XPATH, using = "") WebElement ;
		// @FindBy(xpath= " ") WebElement ;
	// @FindBy (how = How.XPATH, using = "") WebElement ;
		// @FindBy(xpath= " ") WebElement ;
		
	 

		public void hoverOnFacilitiesAndSelectFacilities() {
			
			act.moveToElement(facilities).build().perform();
			facilities.click();
			
		}
		
		public void checkGalleryHeading() {
			String actualHeading = transportHeading.getText().trim();
			System.out.println("Actual Heading is "+actualHeading);
			String expectedHeading = "Gallery";
			Assert.assertEquals(actualHeading, expectedHeading);

		}
	
		
}
