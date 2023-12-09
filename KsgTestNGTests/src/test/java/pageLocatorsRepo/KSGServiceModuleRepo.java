package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.DriversInit;

public class KSGServiceModuleRepo {
	
	Actions act = new Actions(DriversInit.driver);

	public KSGServiceModuleRepo (WebDriver driver) {
		PageFactory.initElements( driver, this);
		
	}
	
	@FindBy(xpath = "//a[contains(text(), \"Service\")]") WebElement service ;
	@FindBy(how = How.XPATH, using="(//a[@href=\"scholarships.php\"])[1]" ) WebElement scholarship1;
	@FindBy(xpath = "(//a[@href=\"Prof.Subbiah Yoga Centre.php\"])[1]") WebElement yoga1;
	@FindBy(how = How.XPATH, using="//a[@href=\"groupinsurance.php\"]" ) WebElement groupInsurance;
	@FindBy(xpath = "(//a[@href=\"research programme.php\"])[1]") WebElement researchProgramme;
	@FindBy(how = How.XPATH, using="(//a[@href=\"uow.php\"])[1]" ) WebElement UOW;
	@FindBy(xpath = "//u[contains(text(), \"Scholarships\")]") WebElement scholarshipHeading;
	@FindBy(how = How.XPATH, using="//h2[contains(text(), \"Subbiah Yoga Center\")]" ) WebElement yogaHeading;
	@FindBy(xpath = "//h2[contains(text(), \"Group Insurance\")]") WebElement groupInsuranceHeading;
	@FindBy(how = How.XPATH, using="//h2[contains(text(), \"RESEARCH PROGRAMME\")]" ) WebElement researchProgrammHeading;
	@FindBy(xpath = "//h3[contains(text(), \"UNIVERSITY OF WOLVERHAMPTON, UK\")]") WebElement uowHeading;
	//@FindBy(xpath = "") WebElement ;
	//@FindBy(how = How.XPATH, using="" ) WebElement ;
	
	public void hoverOnServiceAndSelectScholarship1() {
		act.moveToElement(service).build().perform();
		act.moveToElement(scholarship1).build().perform();
		scholarship1.click();
	}
	
	public void hoverOnServiceAndSelectyoga1() {
		act.moveToElement(service).build().perform();
		act.moveToElement(yoga1).build().perform();
		yoga1.click();
	}
	
	
	
	public void hoverOnServiceAndSelectGroupInsurance() {
		act.moveToElement(service).build().perform();
		act.moveToElement(groupInsurance).build().perform();
		groupInsurance.click();
	}
	
	public void hoverOnServiceAndSelectResearchProgramme() {
		act.moveToElement(service).build().perform();
		act.moveToElement(researchProgramme).build().perform();
		researchProgramme.click();
	}
	
	public void hoverOnServiceAndSelectUOW() {
		act.moveToElement(service).build().perform();
		act.moveToElement(UOW).build().perform();
		UOW.click();
	}
}
