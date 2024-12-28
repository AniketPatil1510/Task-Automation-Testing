package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration; // For WebDriverWait timeout

public class AddJournalPage extends BasePage {

    public AddJournalPage(WebDriver driver) {
        super(driver);
    }

    
    @FindBy(xpath = "//span[@id='select2-cborotation-container']") WebElement rotationDropdown;
    @FindBy(xpath = "//ul[@id='select2-cborotation-results']") WebElement rotationDropdownOptions;
    
    @FindBy(xpath ="//input[@id='journalDate1']") WebElement datepicker;
    
    @FindBy(xpath="//span[@id='select2-cbohospitalsiteunits-container']") WebElement HospitalSiteUnitDropdown;
    @FindBy(xpath="//li[@id='select2-cbohospitalsiteunits-result-njct-777']") WebElement HospitalSiteUnitDropdownOpetions;
    
    @FindBy(xpath="//textarea[@id='student_journal_entry']")WebElement TxtStudentJournalEntry;
    
    @FindBy(xpath="//button[@id='btnSubmit']")WebElement btnsave;
    

   
    public void selectRotationOption(String optionText) {
        // Open the dropdown
        rotationDropdown.click();

        // Wait for the dropdown options to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Using Duration instead of int for timeout
        WebElement optionToSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//ul[@id='select2-cborotation-results']//li[normalize-space(text())='" + optionText + "']")
        ));

        
        optionToSelect.click();
    }
    
    public void selectdate(String date)
    {
    	datepicker.sendKeys(date);
    }
    
    
    public void SelectHospitalSiteUnit(String optionText) {
        // Open the dropdown
        HospitalSiteUnitDropdown.click();

        // Wait for the dropdown options to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Using Duration instead of int for timeout
        WebElement optionToSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//ul[@id='select2-cbohospitalsiteunits-results']//li[normalize-space(text())='" + optionText + "']")
        ));

        // Select the desired option
        optionToSelect.click();
    }
    
    public void enterstudentjournalentry(String txtname) 
     {
    	TxtStudentJournalEntry.sendKeys(txtname);
    	
    }
    
		
    public void  clickOnSave()
    {
    	btnsave.click();
    }
}
