package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.*;

public class QuestionsPageTest extends TestBase {

	QuestionsPage questionsPage;
	TagsPage tagsPage;
	HomePage homePage;
	
	public QuestionsPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void setUp() {
		initilization();
		tagsPage = new TagsPage();
		questionsPage = new QuestionsPage();
		homePage = new HomePage();
		questionsPage = homePage.clickOnBrowseQuestions();  //get object from homePage
	}
	
	@Test(priority=1)
	public void verifyQuestionsPageTitle() {
		String title = questionsPage.verifyTitle();
		Assert.assertEquals(title, "Newest Questions - Stack Overflow");
	}
	
	@Test(priority=2)
	public void verifyclickOnTag() {
		tagsPage=questionsPage.clickOnTag();				
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
