package pageLocatorsRepo;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import utilities.DriversInit;

public class KSGFacilitiesRepo {

	
	Actions act = new Actions(DriversInit.driver);
	
	public KSGFacilitiesRepo(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}
	
	
	 @FindBy (how = How.XPATH, using = "//a[@href=\"faclities.php\"]") WebElement facilities;
		// @FindBy(xpath= " ") WebElement ;
	// @FindBy (how = How.XPATH, using = "") WebElement ;
		// @FindBy(xpath= " ") WebElement ;
	// @FindBy (how = How.XPATH, using = "") WebElement ;
		// @FindBy(xpath= " ") WebElement ;
		
	 

		public void hoverOnFacilitiesAndSelectFacilities() {
			
			act.moveToElement(facilities).build().perform();
			facilities.click();
			
		}
		
		public void checkFacilitiesTitle() {
			String actualTitle = DriversInit.driver.getTitle();
			String expectedTitle = "College Facilities";
			Assertions.assertEquals(actualTitle, expectedTitle);
		}
}
