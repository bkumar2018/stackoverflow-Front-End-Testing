package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.QuestionsPage;
import com.qa.pages.TagsPage;

public class TagsPageTest extends TestBase{

	QuestionsPage questionsPage;
	TagsPage tagsPage;
	HomePage homePage;
	
	
	public TagsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initilization();
		tagsPage = new TagsPage();
		questionsPage = new QuestionsPage();
		homePage = new HomePage();
		questionsPage = homePage.clickOnBrowseQuestions();  //get object from homePage
		tagsPage = questionsPage.clickOnTag();
		
	}
	
	@Test(priority=1)
	public void verifyNameOf3PopularTagTest() {
		String tag3 = tagsPage.verifyNameOf3PopularTag();
		Assert.assertEquals(tag3, "python");
	}
	

	@Test(priority=2)
	public void numberOfNewestQuestionsAskedTest() {
		String numAskedQ = tagsPage.numberOfNewestQuestionsAsked();
		Assert.assertEquals(numAskedQ, "1572 asked today, 9029 this week");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
