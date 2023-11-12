package pageLocatorsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import constant.Constantss;
import utilities.DriversInit;

public class KSGPgcourses {

	public KSGPgcourses(WebDriver driver) {
		PageFactory.initElements( driver,this); 
	}
	
	@FindBy(xpath="(//a[contains(text(), \"Home\")])[1]")WebElement Home;
	@FindBy(xpath="//a[contains(text(), \"Course\")]") WebElement Course;
	@FindBy(how=How.XPATH, using="//a[contains(text(), \"PG Course\")]")WebElement PGcourse;
	@FindBy(xpath="//a[contains(text(), \"M.A English Literature\")]") WebElement MAel;
	@FindBy(xpath="//a[contains(text(), \"M.Sc Information Technology\")]") WebElement MscIT;
	@FindBy(xpath="//a[contains(text(), \"M.Sc Mathematics\")]") WebElement MscM;
	@FindBy(xpath="//a[contains(text(), \"M.Sc Biotechnology\")]") WebElement MscB;
	@FindBy(xpath="//a[contains(text(), \"M.Com (CA)\")]") WebElement  McomCA;
	@FindBy(xpath="//a[contains(text(), \"M.Com (IB)\")]") WebElement Mcom1B;
	@FindBy(xpath="//a[contains(text(), \"MPhil Tamil\")]") WebElement MphilTamil;
	@FindBy(xpath="//a[contains(text(), \"MPhil Computer Science\")]") WebElement MPhilCS; 
	@FindBy(xpath="//a[contains(text(), \"Ph.D Computer Science\")]") WebElement  PhdCS;
	//@FindBy(xpath="") WebElement ;
	
	


public void hoverOnCourseAndPGCourseAndSelectMAel() {
	
	
	Actions act = new Actions(DriversInit.driver);
	act.moveToElement(Course).build().perform();
	act.moveToElement(PGcourse).build().perform();
	act.moveToElement(MAel).build().perform();
	boolean MAeng = MAel.isEnabled();
	System.out.println("MAel enabled -"+MAeng);
	MAel.click();
	
	
	String actualTitle = DriversInit.driver.findElement(By.xpath("//h2[contains(text(), \"M.A English Literature\")]")).getText();
	System.out.println("title is :"+actualTitle);
	String expectedTitle = "M.A English Literature";
    
    Assert.assertEquals(expectedTitle, actualTitle);
    
    
    System.out.println();
	System.out.println("titles matched..");
	System.out.println();
   
    
	System.out.println("Select MA English Literature course test passed.");
    
    act.moveToElement(Home).build().perform();
    Home.click();
    
}
    
public void checkMscIT() {
		

		Actions act = new Actions(DriversInit.driver);
		act.moveToElement(Course).build().perform();
		act.moveToElement(PGcourse).build().perform();
		act.moveToElement(MscIT).build().perform();
		
		boolean Mscit =MscIT.isEnabled();
		System.out.println("MscIT enabled -"+Mscit);
		MscIT.click();
		
		
		String actualTitle = DriversInit.driver.findElement(By.xpath("//h2[contains(text(), \"M.Sc Information Technology\")]")).getText();
		System.out.println("title is :"+actualTitle);
		String expectedTitle = "M.Sc Information Technology";
	    
	    Assert.assertEquals(expectedTitle, actualTitle);
	    System.out.println();
		System.out.println("titles matched..");
		System.out.println();
	   
	    
		System.out.println("Select Msc Information Technology course test passed.");
	    
	    act.moveToElement(Home).build().perform();
	    Home.click();
  }

public void checkMscM() {
	
	Actions act = new Actions(DriversInit.driver);
	act.moveToElement(Course).build().perform();
	act.moveToElement(PGcourse).build().perform();
	act.moveToElement(MscM).build().perform();
	boolean Mscm = MscM.isEnabled();
	System.out.println("MscM enabled -"+Mscm);
	MscM.click();
	
	
	String actualTitle = DriversInit.driver.findElement(By.xpath("//h2[contains(text(), \"M.Sc Mathematics\")]")).getText();
	System.out.println("title is :"+actualTitle);
	String expectedTitle = "M.Sc Mathematics";
    
    Assert.assertEquals(expectedTitle, actualTitle);
    System.out.println();
	System.out.println("titles matched..");
	System.out.println();
   
    
	System.out.println("Select M.Sc Mathematics course test passed.");
    
    act.moveToElement(Home).build().perform();
    Home.click();
}

public void checkMscB() {
	
	Actions act = new Actions(DriversInit.driver);
	act.moveToElement(Course).build().perform();
	act.moveToElement(PGcourse).build().perform();
	act.moveToElement(MscB).build().perform();
	boolean Mscb = MscB.isEnabled();
	System.out.println("MscB enabled -"+Mscb);
	
	MscB.click();
	
	
	String actualTitle = DriversInit.driver.findElement(By.xpath("//h2[contains(text(), \"M.Sc Biotechnology\")]")).getText();
	System.out.println("title is :"+actualTitle);
	String expectedTitle = "M.Sc Biotechnology";
    
    Assert.assertEquals(expectedTitle, actualTitle);
    System.out.println();
	System.out.println("titles matched..");
	System.out.println();
   
    
	System.out.println("Select M.Sc Biotechnology course test passed.");
    
    act.moveToElement(Home).build().perform();
    Home.click();
}

public void checkMcomCA() {
	
	Actions act = new Actions(DriversInit.driver);
	act.moveToElement(Course).build().perform();
	act.moveToElement(PGcourse).build().perform();
	act.moveToElement(McomCA).build().perform();
	boolean Mcomca = McomCA.isEnabled();
	System.out.println("McomCA enabled -"+Mcomca );
	
	
	McomCA.click();
	
	
	String actualTitle = DriversInit.driver.findElement(By.xpath("//h2[contains(text(), \"M.Com (CA)\")]")).getText();
	System.out.println("title is :"+actualTitle);
	String expectedTitle = "M.Com (CA)";
    
    Assert.assertEquals(expectedTitle, actualTitle);
    System.out.println();
	System.out.println("titles matched..");
	System.out.println();
   
    
	System.out.println("Select M.Com (CA) course test passed.");
    
    act.moveToElement(Home).build().perform();
    Home.click();
}


public void checkMcom1B() {
	
	Actions act = new Actions(DriversInit.driver);
	act.moveToElement(Course).build().perform();
	act.moveToElement(PGcourse).build().perform();
	act.moveToElement(Mcom1B).build().perform();
	
	boolean Mcom1b = Mcom1B.isEnabled();
	System.out.println("Mcom1B enabled -"+Mcom1b);
	
	Mcom1B.click();
	
	
	String actualTitle = DriversInit.driver.findElement(By.xpath("//h2[contains(text(), \"M.Com (IB)\")]")).getText();
	System.out.println("title is :"+actualTitle);
	String expectedTitle = "M.Com (IB)";
    
    Assert.assertEquals(expectedTitle, actualTitle);
    System.out.println();
	System.out.println("titles matched..");
	System.out.println();
   
    
	System.out.println("Select M.Com (IB) course test passed.");
    
    act.moveToElement(Home).build().perform();
    Home.click();
}

public void checkMphilTamil() {
	
	Actions act = new Actions(DriversInit.driver);
	act.moveToElement(Course).build().perform();
	act.moveToElement(PGcourse).build().perform();
	act.moveToElement(MphilTamil).build().perform();
	
	boolean MphilT = MPhilCS.isEnabled();
	System.out.println("MphilTamilenabled -"+MphilT);
	
	MphilTamil.click();
	
	
	String actualTitle = DriversInit.driver.findElement(By.xpath("//h2[contains(text(), \"MPhil Tamil\")]")).getText();
	System.out.println("title is :"+actualTitle);
	String expectedTitle = "MPhil Tamil";
    
    Assert.assertEquals(expectedTitle, actualTitle);
    System.out.println();
	System.out.println("titles matched..");
	System.out.println();
   
    
	System.out.println("Select MPhil Tamil course test passed.");
    
    act.moveToElement(Home).build().perform();
    Home.click();
}

public void checkMPhilCS() {
	
	Actions act = new Actions(DriversInit.driver);
	act.moveToElement(Course).build().perform();
	act.moveToElement(PGcourse).build().perform();
	act.moveToElement(MPhilCS).build().perform();
	
	boolean Mphilcs = MPhilCS.isEnabled();
	System.out.println("MPhilCS enabled -"+Mphilcs);
	
	MPhilCS.click();
	
	
	String actualTitle = DriversInit.driver.findElement(By.xpath("//h2[contains(text(), \"MPhil Computer Science\")]")).getText();
	System.out.println("title is :"+actualTitle);
	String expectedTitle = "MPhil Computer Science";
    
    Assert.assertEquals(expectedTitle, actualTitle);
    System.out.println();
	System.out.println("titles matched..");
	System.out.println();
   
    
	System.out.println("Select MPhil Computer Science course test passed.");
    
    act.moveToElement(Home).build().perform();
    Home.click();
}

public void checkPhdCS() {
	
	Actions act = new Actions(DriversInit.driver);
	act.moveToElement(Course).build().perform();
	act.moveToElement(PGcourse).build().perform();
	act.moveToElement(PhdCS).build().perform();
	
	boolean Phdcs = PhdCS.isEnabled();
	System.out.println("PhdCS enabled -"+Phdcs);
	
	PhdCS.click();
	
	
	String actualTitle = DriversInit.driver.findElement(By.xpath("//h2[contains(text(), \"Ph.D Computer Science\")]")).getText();
	System.out.println("title is :"+actualTitle);
	String expectedTitle = "Ph.D Computer Science";
    
    Assert.assertEquals(expectedTitle, actualTitle);
    System.out.println();
	System.out.println("titles matched..");
	System.out.println();
   
    
	System.out.println("Select Ph.D Computer Science course test passed.");
    
    act.moveToElement(Home).build().perform();
    Home.click();
}

}


