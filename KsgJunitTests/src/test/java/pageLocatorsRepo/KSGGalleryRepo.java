package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import utilities.DriversInit;

public class KSGGalleryRepo {


	Actions act = new Actions(DriversInit.driver);
	
	public KSGGalleryRepo(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}
	
	// @FindBy (how = How.XPATH, using = "") WebElement ;
		// @FindBy(xpath= " ") WebElement ;
	// @FindBy (how = How.XPATH, using = "") WebElement ;
		// @FindBy(xpath= " ") WebElement ;
	// @FindBy (how = How.XPATH, using = "") WebElement ;
		// @FindBy(xpath= " ") WebElement ;
		
}
