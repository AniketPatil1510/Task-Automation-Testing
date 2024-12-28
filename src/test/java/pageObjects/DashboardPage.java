package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
	
	public DashboardPage ( WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Journal']") WebElement journaltab ;
	
	
	
	public void clickonjournaltab()
	{
		journaltab.click();
	}
	


}
