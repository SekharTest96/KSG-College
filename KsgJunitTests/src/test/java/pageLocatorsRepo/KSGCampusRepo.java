package pageLocatorsRepo;

import org.junit.Assert;
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
	
	
	
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(), \"Campus\")])[1]")
	WebElement campus1;
	@FindBy(xpath = "(//a[contains(text(), \"Campus\")])[2]")
	WebElement campus2;
	@FindBy(how = How.XPATH, using = "//a[@href=\"Ncc.php\"]")
	WebElement nss;
	@FindBy(xpath = "//h2[contains(text(), \"Campus\")]")
	WebElement campusHeading;
	@FindBy(how = How.XPATH, using = "//center[contains(text(), \"NSS PROGRAMME OFFICER\")]")
	WebElement nssHeading;
	// @FindBy(xpath= " ") WebElement ;

	public void hoverOnCampusAndSelectCampus() {
		act.moveToElement(campus1).build().perform();
		act.moveToElement(campus2).build().perform();
		campus2.click();

	}

	public void checkCampusHeading() {
		String actualHeading = campusHeading.getText().trim();
		String expectedHeading = "Campus";
		Assert.assertEquals(actualHeading, expectedHeading);

	}
	
	
	public void checkCampusTitle() {
		String actualTitle = DriversInit.driver.getTitle();
		String expectedTitle = "Campus";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	public void hoverOnCampusAndSelectNSS() {
		act.moveToElement(campus1).build().perform();
		act.moveToElement(nss).build().perform();
		nss.click();

	}

	public void checkNssHeading() {
		String actualHeading = nssHeading.getText().trim();
		String expectedHeading = "NSS PROGRAMME OFFICER";
		Assert.assertEquals(actualHeading, expectedHeading);
	}
	
	public void checkNssTitle() {
		String actualTitle = DriversInit.driver.getTitle();
		String expectedTitle = "NSS PROGRAMME OFFICER";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
