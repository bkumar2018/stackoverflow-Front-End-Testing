package com.qa.pages;

import com.qa.base.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{

	//Page Factory : Object repository
	@FindBy(xpath = "//a[contains(text(),'Browse questions')]")
	WebElement browserQuestionLink;
	//@FindBy(xpath = "//a[contains(@class,'d-inline-block fc-white p-bg-purple d:bg-blue-600 py12 px24 bar-sm js-gps-track')]")	
	//@FindBy(xpath = "//a[@data-ga='[\"home page\",\"browse questions click\",\"for developers section\",null,null]']")
	
	
			

	// Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver,  this);		
	}
		
	//Actions
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public QuestionsPage clickOnBrowseQuestions() {
	
		//browserQuestionLink.click();

		//not working
//		Actions action = new Actions(driver);
//		action.moveToElement(browserQuestionLink).click().perform();
	

		//using X or Y position : not working
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(0,"+browserQuestionLink.getLocation().y+")");
//        browserQuestionLink.click();

//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		wait2.until(ExpectedConditions.elementToBeClickable(browserQuestionLink));
//		browserQuestionLink.click();
		
		//Working code
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", browserQuestionLink);
		
		System.out.println(driver.getTitle());		
        
		return new QuestionsPage();
	}
		
}
