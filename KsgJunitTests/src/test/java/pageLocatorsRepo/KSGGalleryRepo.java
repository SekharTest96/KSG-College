package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KSGGalleryRepo {

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
