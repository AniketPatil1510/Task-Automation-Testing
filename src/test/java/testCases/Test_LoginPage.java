package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddJournalPage;
import pageObjects.DashboardPage;
import pageObjects.JournalPage;
import pageObjects.LoginPage;

public class Test_LoginPage extends BaseClass{

	
	@Test 
	public void verify_Login()
	{
	   //logg.info("**** Starting Login Test ****");
	   
	   LoginPage lp = new LoginPage(driver); 
	  // lp.enterLoginusername(prop.getProperty("username"));
	  // lp.enterLoginPassword(prop.getProperty("password"));
	   
	   lp.enterLoginusername("Praful1234");
	   lp.enterLoginPassword("Admin@123");
	   lp.clickLogin();
	   
	   DashboardPage dp = new DashboardPage(driver);
	   dp.clickonjournaltab();
	   
	   JournalPage jp = new  JournalPage(driver);
	   jp.clickonAdd();
	   
	   AddJournalPage ajp = new AddJournalPage(driver);
	   ajp.selectRotationOption("New Course Rotn (Bon Temps Medical Center)");
	   ajp.selectdate("12/28/2024");
	   ajp.SelectHospitalSiteUnit("CVICU");
	   ajp.enterstudentjournalentry("testjournal");
	   ajp.clickOnSave();
	   
	   String confdte = jp.getConfirmationdate();
	   Assert.assertEquals(confdte,"12/28/2024");
	   
	   logg.info("successfully verified newly added date of journal");
	   
	   String confmsg = jp.getConfirmationmsg();
	   Assert.assertEquals(confmsg,"Duration checking Schedule");
	   logg.info("successfully verified newly added rotation name of journal ");
	   
	  
	   
	  
	   
	    
	
	
	}
}
