package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.*;
import com.qa.pages.HomePage;
import com.qa.pages.QuestionsPage;
import com.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	TestUtil testUtil;
	HomePage homePage;
	QuestionsPage questionsPage;

	public HomePageTest() {
		super();		
	}
	
	@BeforeMethod
	public void setUp() {
		initilization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		questionsPage = new QuestionsPage();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		//Assert.assertEquals(driver.getTitle(), "Stack Overflow - Where Developers Learn, Share, & Build Careers");
		System.out.println("Title from webdriver: "+ homePageTitle);
		Assert.assertEquals(homePageTitle, "Stack Overflow - Where Developers Learn, Share, & Build Careers");		                                                                                                                                             
	}
	
	@Test(priority=2)
	public void verifyBrowseQuestionsLinkTest() {
		System.out.println("calling verifyBrowseQuestionsLinkTest");
		questionsPage = homePage.clickOnBrowseQuestions();
	}
	
	@AfterMethod
	public void tearDown() {		
		//to exit the browser, end the session, tabs, pop-ups etc.
		driver.quit();
	}
	
	
}
