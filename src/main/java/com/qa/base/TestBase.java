package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;


public class TestBase {

	public static Properties prop;
	public static WebDriver driver;

	

	//ctor of class
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fin = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//java//com//qa//config//config.properties");
			prop.load(fin);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initilization() {
		
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equals("chrome")) {
			//Setting property for Chrome dirver 
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriverPath");
			driver = new ChromeDriver();
			
			
		}else if (browserName.equals("firefox")) {
			//Firefox driver code here
		}
		
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}
}
