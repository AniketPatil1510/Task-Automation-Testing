package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JournalPage extends BasePage {

    
    public JournalPage(WebDriver driver) {
        super(driver);
    }

    
    @FindBy(xpath = "//a[normalize-space()='Add']")
    WebElement Add;

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    WebElement verifyentrydate;

    @FindBy(xpath = "(//td[contains(@class,'alignCenter')][normalize-space()='Duration checking Schedule'])[1]")
    WebElement msgConfirmation;

   
    public void clickonAdd() {
        Add.click();
    }

    
    public String getConfirmationdate() {
        try {
            return verifyentrydate.getText();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

   
    public String getConfirmationmsg() {
        try {
            return msgConfirmation.getText();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
