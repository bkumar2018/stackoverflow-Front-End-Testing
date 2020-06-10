package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class TagsPage  extends TestBase{

	//Page Factory : Object repository
//	@FindBy(xpath = "//a[text()='python']")
//	WebElement tag3Link;

	@FindBy (xpath = "//*[@id='tags-browser']/div[3]/div[1]/div")
	WebElement tag3Link;
	
	@FindBy (xpath = "//*[@id='tags-browser']/div[3]/div[3]/div[2]")
	WebElement numOfQuestionAskedLink;
	
	//*[@id='tags-browser']/div[3]/div[3]/div[2]
	
	public TagsPage() {
		PageFactory.initElements(driver, this);		
	}
	
	public String verifyNameOf3PopularTag() {		
		return tag3Link.getText();
	}
	
	public String numberOfNewestQuestionsAsked() {
		//WebElement e = driver.findElement(By.xpath("//a[text()='1564 asked today']"));
		return numOfQuestionAskedLink.getText();
	}
}
