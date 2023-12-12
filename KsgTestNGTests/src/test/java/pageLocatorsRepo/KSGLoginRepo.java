package pageLocatorsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KSGLoginRepo {

	public KSGLoginRepo(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
}
