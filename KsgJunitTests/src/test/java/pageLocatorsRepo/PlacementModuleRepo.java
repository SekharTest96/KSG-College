package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.DriversInit;

public class PlacementModuleRepo {

	Actions act = new Actions(DriversInit.driver);

	public PlacementModuleRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(), \"Placement\")]")
	WebElement Placement;
	@FindBy(xpath = "(//a[@href=\"placements.php\"])[1]")
	WebElement placementCell;
	@FindBy(how = How.XPATH, using = "//a[@href=\"placementoffice.php\"]")
	WebElement placementOffice;
	@FindBy(xpath = "//a[@href=\"PlacementActivities.php\"]")
	WebElement activities;
	@FindBy(how = How.XPATH, using = "//a[@href=\"compaines.php\"]")
	WebElement companies;
	@FindBy(xpath = "//a[@href=\"career.php\"]")
	WebElement career;
	// @FindBy (how = How.XPATH, using = "") WebElement ;
	// @FindBy(xpath= " ") WebElement ;
	// @FindBy (how = How.XPATH, using = "") WebElement ;
	// @FindBy(xpath= " ") WebElement ;

	public void hoverOnPlacementAndSelectPlacementCell() {

		act.moveToElement(Placement).build().perform();
		act.moveToElement(placementCell).build().perform();
		placementCell.click();
	}

	public void hoverOnPlacementAndSelectPlacementOffice() {

		act.moveToElement(Placement).build().perform();
		act.moveToElement(placementOffice).build().perform();
		placementOffice.click();
	}

	public void hoverOnPlacementAndSelectPlacementActivities() {

		act.moveToElement(Placement).build().perform();
		act.moveToElement(activities).build().perform();
		activities.click();
	}

	public void hoverOnPlacementAndSelectPlacementCompanies() {

		act.moveToElement(Placement).build().perform();
		act.moveToElement(companies).build().perform();
		companies.click();
	}

	public void hoverOnPlacementAndSelectPlacementCareers() {

		act.moveToElement(Placement).build().perform();
		act.moveToElement(career).build().perform();
		career.click();
	}

	
}
