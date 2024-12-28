package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage ( WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement txtloginusername ;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txtloginpassword;
	@FindBy(xpath="//input[@name='btnLogin']") WebElement btnLogin ;
	
	
	public void enterLoginusername(String username)
	{
		txtloginusername.sendKeys(username);
	}
	
	public void enterLoginPassword(String pwd)
	{
		txtloginpassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	

}
