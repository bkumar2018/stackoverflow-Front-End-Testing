package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class QuestionsPage extends TestBase {

	//Page Factory : Object repository
	@FindBy(xpath = "//a[@id='nav-tags']")
	WebElement tagsLink;
	
	public QuestionsPage() {
		PageFactory.initElements(driver, this);		
	}
	
	public String verifyTitle() {
		return driver.getTitle();
	}
	
	 
	public TagsPage clickOnTag() {
		tagsLink.click();
		return new TagsPage();
	}
		
}
