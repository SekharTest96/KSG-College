package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriversInit;

public class OnlinePaymentRepo {

	
	public OnlinePaymentRepo(WebDriver driver) {
		PageFactory.initElements( driver, this);
		
		
	}
	
	
	@FindBy(xpath="//a[@href='pay/']") WebElement OnlinePayment;
	@FindBy(id="firstname") WebElement FName;
	@FindBy(css = "#Lastname") WebElement lastName;
	@FindBy(xpath="//input[@placeholder=\"Zip Code\"]") WebElement zipcode; 
	@FindBy(xpath="//input[@placeholder=\"Email ID\"]") WebElement emailId; 
	@FindBy(xpath="//input[@placeholder=\"Mobile/Cell Number\"]") WebElement  mobileNumber; 
	@FindBy(xpath="//input[@placeholder=\"Address1\"]") WebElement address1; 
	@FindBy(xpath="//input[@placeholder=\"Address2\"]") WebElement address2; 
	@FindBy(xpath="//input[@placeholder=\"City\"]") WebElement city; 
	@FindBy(xpath="//input[@placeholder=\"State\"]") WebElement state; 
	@FindBy(xpath="//input[@placeholder=\"Country\"]") WebElement Country; 
	@FindBy(xpath="//input[@value=\"Pay\"]") WebElement pay; 
	@FindBy(id="cardNumber") WebElement cardnum; 
	@FindBy(xpath="//input[@name=\"cardExpiry\"]") WebElement cardExpiry; 
	@FindBy(xpath="//input[@data-testid=\"cardCvv\"]") WebElement  cardCVV; 
	@FindBy(xpath="//input[@data-testid=\"cardOwnerName\"]") WebElement cardOwnerName; 
	@FindBy(xpath="//span[contains(text(), \"PROCEED\")]") WebElement proceed; 
		//@FindBy(xpath="") WebElement ; 
	
	public void enterDetailsForOnlinePayment() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(OnlinePayment).build().perform();
		OnlinePayment.click();
		
		FName.sendKeys("BTS ");
		lastName.sendKeys("Infotech");
		zipcode.sendKeys("516001");
		emailId.sendKeys("bts@btsinfotech.com");
		mobileNumber.sendKeys("1234567890");
		address1.sendKeys("D.no: 11-00-25, jubliee hills");
		address2.sendKeys("near Hdfc Bank, Hyderabad. ");
		city.sendKeys("Hyderabad.");
		state.sendKeys("Andhra Pradesh");
		Country.sendKeys("India");
		act.moveToElement(pay).build().perform();
		pay.click();
		cardnum.sendKeys("1234546789012345");
		cardExpiry.sendKeys("2312");
		cardCVV.sendKeys("658");
		cardOwnerName.sendKeys("Bts Infotech");
		boolean pro =  proceed.isEnabled();
		System.out.println("Proceed button is : "+pro);
		proceed.click();
		
		
	}
	
	public void enterDetailsForOnlinePayment1() {
		
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(OnlinePayment).build().perform();
		OnlinePayment.click();
		
		FName.sendKeys("125 ");
		lastName.sendKeys("456");
		zipcode.sendKeys("abcgf");
		emailId.sendKeys("bts!123");
		mobileNumber.sendKeys("1234567");
		address1.sendKeys("");
		address2.sendKeys("");
		city.sendKeys("28%&*56");
		state.sendKeys("152^&5");
		Country.sendKeys("825$");
		act.moveToElement(pay).build().perform();
		pay.click();
		cardnum.sendKeys("1234546789012345");
		cardExpiry.sendKeys("2312");
		cardCVV.sendKeys("658");
		cardOwnerName.sendKeys("Bts Infotech");
		boolean pro =  proceed.isEnabled();
		System.out.println("Proceed button is : "+pro);
		proceed.click();
	}
	
	public void emptyInput() {
		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(OnlinePayment).build().perform();
		OnlinePayment.click();
		
		FName.sendKeys("");
		lastName.sendKeys("");
		zipcode.sendKeys("");
		emailId.sendKeys("");
		mobileNumber.sendKeys("");
		address1.sendKeys("");
		address2.sendKeys(" ");
		city.sendKeys("");
		state.sendKeys("");
		Country.sendKeys("");
		act.moveToElement(pay).build().perform();
		pay.click();
		cardnum.sendKeys("");
		cardExpiry.sendKeys("2");
		cardCVV.sendKeys("");
		cardOwnerName.sendKeys("");
		boolean pro =  proceed.isEnabled();
		System.out.println("Proceed button is : "+pro);
		proceed.click();
	}
}
