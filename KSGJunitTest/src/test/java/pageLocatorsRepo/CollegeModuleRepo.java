package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.DriversInit;

public class CollegeModuleRepo {

	Actions act = new Actions(DriversInit.driver);

	public CollegeModuleRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(), \"COLLEGE\")]")
	WebElement college;
	 @FindBy (how = How.XPATH, using = "(//a[@href=\"About.php\"])[3]") WebElement aboutKSG3;
	 @FindBy(xpath= "(//a[@href=\"About.php\"])[]") WebElement aboutKSG2;
	@FindBy(how = How.XPATH, using = "(//a[@href=\"About.php\"])[1]")
	WebElement aboutKSG1;
	@FindBy(xpath = "//a[@href=\"Management.php\"]")
	WebElement management;
	@FindBy(how = How.XPATH, using = "//a[@href=\"Achivement.php\"]")
	WebElement achievement;
	@FindBy(xpath = "//a[@href=\"collegecouncil.php\"]")
	WebElement college_council;
	@FindBy(how = How.XPATH, using = "//a[@href=\"collegecommittees.php\"]")
	WebElement college_committee;
	@FindBy(xpath = "//a[@href=\"charity.php\"]")
	WebElement charity;
	@FindBy(xpath = "(//a[@href=\"events.php\"])[1]")
	WebElement event1;
	@FindBy(xpath = "(//a[@href=\"events.php\"])[2]")
	WebElement event2;
	@FindBy(how = How.XPATH, using = "//A[@href=\"Video.php\"]")
	WebElement videos;
	// @FindBy (how = How.XPATH, using = "") WebElement ;
	// @FindBy(xpath= " ") WebElement ;
	

	public void hoverOnCollegeAndSelectaboutKSG1() {
		act.moveToElement(college).build().perform();
		act.moveToElement(aboutKSG2).build().perform();
		aboutKSG2.click();
		act.moveToElement(aboutKSG3).build().perform();
		aboutKSG3.click();
		act.moveToElement(aboutKSG1).build().perform();
		aboutKSG1.click();

	}

	public void selectManagement() {
		act.moveToElement(college).build().perform();
		act.moveToElement(management).build().perform();
		management.click();
	}

	public void selectAchievement() {
		act.moveToElement(college).build().perform();
		act.moveToElement(achievement).build().perform();
		achievement.click();
	}

	public void selectCollegeCouncil() {
		act.moveToElement(college).build().perform();
		act.moveToElement(college_council).build().perform();
		college_council.click();
	}

	public void selectCollegeCommittee() {
		act.moveToElement(college).build().perform();
		act.moveToElement(college_committee).build().perform();
		college_committee.click();
	}

	public void selectCharity() {
		act.moveToElement(college).build().perform();
		act.moveToElement(charity).build().perform();
		charity.click();
	}

	public void selectEvent1() {
		act.moveToElement(college).build().perform();
		act.moveToElement(event2).build().perform();
		event2.click();
		act.moveToElement(event1).build().perform();
		event1.click();

	}

	public void selectVideos() {
		act.moveToElement(college).build().perform();
		act.moveToElement(videos).build().perform();
		videos.click();
	}
}
