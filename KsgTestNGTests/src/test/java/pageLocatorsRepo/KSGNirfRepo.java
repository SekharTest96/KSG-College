package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.DriversInit;

public class KSGNirfRepo {
	
Actions act = new Actions(DriversInit.driver);
	
	public KSGNirfRepo(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}

	 @FindBy (how = How.XPATH, using = "(//a[contains(text(), \"NIRF\")])[1]") WebElement nirf1;
			 @FindBy(xpath= "(//a[contains(text(), \"NIRF\")])[2]") WebElement nirf2;
		 @FindBy (how = How.XPATH, using = "//h2[contains(text(), \"NIRF\")]") WebElement nirfHeading;
			 @FindBy(xpath= "(//a[contains(text(), \"NIRF\")])[4]") WebElement nirf4;
		// @FindBy (how = How.XPATH, using = "") WebElement ;
			// @FindBy(xpath= " ") WebElement ;
	
	
	 public void hoverOnNirftAndSelectNirf() {
			
			act.moveToElement(nirf4).build().perform();
			nirf4.click();
			act.moveToElement(nirf1).build().perform();
			act.moveToElement(nirf2).build().perform();
			nirf2.click();

		}
	 
		public void checkNirfHeading() {
			String actualHeading = nirfHeading.getText().trim();
			String expectedHeading = "NIRF";
			Assert.assertEquals(actualHeading, expectedHeading);

		}
		
		public void checkNirfTitle() {
			String actualTitle = DriversInit.driver.getTitle();
			String expectedTitle = "NIRF";
			Assert.assertEquals(actualTitle, expectedTitle);
		}
}
