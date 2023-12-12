package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.DriversInit;

public class SocialMediaLinksRepo {

	Actions act = new Actions(DriversInit.driver);

	public SocialMediaLinksRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//i[@class=\"fa fa-facebook-f\"])[1]")
	WebElement facebook1;
	@FindBy(how = How.XPATH, using = "(//i[@class=\"fa fa-facebook-f\"])[2]")
	WebElement facebook2;
	@FindBy(how = How.XPATH, using = "//i[@class=\"fa fa-youtube\"]")
	WebElement youtube;
	@FindBy(xpath = "(//i[@class=\"fa fa-instagram\"])[1]")
	WebElement instagram1;
	@FindBy(how = How.XPATH, using = "(//i[@class=\"fa fa-instagram\"])[2]")
	WebElement instagram2;

	@FindBy(xpath = "//i[@class=\"fa fa-twitter\"]")
	WebElement twitter;
	@FindBy(how = How.XPATH, using = "//i[@class=\"fa fa-google-plus\"]")
	WebElement googlePlus;

	// @FindBy(xpath= " ") WebElement ;
	// @FindBy (how = How.XPATH, using = "") WebElement ;

	public void checkFacebook1Link() {
		act.moveToElement(facebook1).build().perform();
		facebook1.click();
		DriversInit.driver.navigate().back();
	}

	public void checkFacebook2Link() {
		act.moveToElement(facebook2).build().perform();
		facebook2.click();
		DriversInit.driver.navigate().back();
	}

	public void checkYoutube() {
		act.moveToElement(youtube).build().perform();
		youtube.click();
		DriversInit.driver.navigate().back();
	}

	public void checkInstagram1Link() {
		act.moveToElement(instagram1).build().perform();
		instagram1.click();
		DriversInit.driver.navigate().back();
	}

	public void checkInstagram2Link() {
		act.moveToElement(instagram2).build().perform();
		instagram2.click();
		DriversInit.driver.navigate().back();
	}

	public void checktwitterLink() {
		act.moveToElement(twitter).build().perform();
		twitter.click();
		DriversInit.driver.navigate().back();
	}

	public void checkGooglePlusLink() {
		act.moveToElement(googlePlus).build().perform();
		googlePlus.click();
		DriversInit.driver.navigate().back();
	}

}
