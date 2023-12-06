package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.DriversInit;

public class KSGCampusRepo {

	Actions act = new Actions(DriversInit.driver);
	
	public KSGCampusRepo(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}
	
	
	
	
	@FindBy (how = How.XPATH, using = "//h2[contains(text(), \"Campus\")]") WebElement heading;
		@FindBy(xpath= "//a[contains(text(), \"Campus\")]") WebElement Campus;
	 @FindBy (how = How.XPATH, using = "(//a[@href=\"campus.php\"])[1]") WebElement campus1;
			// @FindBy(xpath= " ") WebElement ;
		// @FindBy (how = How.XPATH, using = "") WebElement ;
			// @FindBy(xpath= " ") WebElement ;
}
