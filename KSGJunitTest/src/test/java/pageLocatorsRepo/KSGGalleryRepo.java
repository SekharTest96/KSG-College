package pageLocatorsRepo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import utilities.DriversInit;

public class KSGGalleryRepo {


	Actions act = new Actions(DriversInit.driver);
	
	public KSGGalleryRepo(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}
	
	 @FindBy (how = How.XPATH, using = "(//a[@href=\"gallery.php\"])[1]") WebElement gallery1;
	 @FindBy(xpath= "(//a[@href=\"gallery.php\"])[2]") WebElement gallery2;
 @FindBy (how = How.XPATH, using = "//h2[contains(text(), \"Gallery\")]") WebElement galleryHeading;
	// @FindBy(xpath= " ") WebElement ;
// @FindBy (how = How.XPATH, using = "") WebElement ;
	// @FindBy(xpath= " ") WebElement ;
	 
	 public void hoverOnGallerytAndSelectGallery() {
			
			act.moveToElement(gallery2).build().perform();
			gallery2.click();
			act.moveToElement(gallery1).build().perform();
			
			gallery1.click();

		}
	 
		public void checkGalleryHeading() {
			String actualHeading = galleryHeading.getText().trim();
			String expectedHeading = "Gallery";
			Assert.assertEquals(actualHeading, expectedHeading);

		}
		
		

		
}
