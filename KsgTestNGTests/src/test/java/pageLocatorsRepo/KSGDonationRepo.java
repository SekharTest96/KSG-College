package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.DriversInit;

public class KSGDonationRepo {

	
Actions act = new Actions(DriversInit.driver);
	
	public KSGDonationRepo(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}
		
		 @FindBy(how = How.XPATH, using = "//a[@href=\"donate.php\"]") WebElement donation;
		 @FindBy(xpath= "//div[@class=\"page-banner-cont\"]") WebElement donationHeading;
	 @FindBy (how = How.XPATH, using = "(//div[@class=\"card-body\"])[2]") WebElement onlinePaymentDetails;
		// @FindBy(xpath= " ") WebElement ;
	// @FindBy (how = How.XPATH, using = "") WebElement ;
		 
		 
		
		 
			public void hoverOnDonationAndSelectDonation() {
				
				act.moveToElement(donation).build().perform();
				donation.click();
				
			}
		 
			public void checkDonationHeading() {
				String actualHeading = donationHeading.getText().trim();
				System.out.println("Actual Heading is "+actualHeading);
				String expectedHeading = "Donation";
				Assert.assertEquals(actualHeading, expectedHeading);

			}
			
			
	

	public void validateOnlinePaymentDetails() {
		String actualPaymentData = onlinePaymentDetails.getText();
		String expectPaymentData = "Online Payment Details\r\n"
				+ "\r\n"
				+ "A/c Name : KSG EDUCATIONAL TRUST\r\n"
				+ "A/c Number : 510101001588345\r\n"
				+ "BANK NAME : UNION BANK OF INDIA\r\n"
				+ "BRANCH : SINGANALLUR, COIMBATORE\r\n"
				+ "IFSC CODE : UBIN0910937]";
		Assert.assertEquals(actualPaymentData, expectPaymentData);
	}
	
	

	
}
