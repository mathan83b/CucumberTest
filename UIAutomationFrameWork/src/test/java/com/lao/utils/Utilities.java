package com.lao.utils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.io.driversManagement.Base;
import com.lao.constants.Constants;
import com.lao.pageobjects.DirectoryPage;
import com.lao.pageobjects.HomePage;

import io.cucumber.java.Scenario;
import net.bytebuddy.asm.Advice.AllArguments;

public class Utilities extends Base {

		
	
	public void LoadProperties() {
		
		Properties properties=new Properties();
		try {
			
			
			properties.load(getClass().getResourceAsStream("/config.properties"));
			Constants.Browser=properties.getProperty("Browser");
			Constants.UserName=properties.getProperty("UserName");
			Constants.Password=properties.getProperty("Password");
		    Constants.App_Url=properties.getProperty("App_Url");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	public void InitializationOfWebElements() {
		
		PageFactory.initElements(driver,HomePage.getInstance());
		PageFactory.initElements(driver, DirectoryPage.getInstance());
		
		
	}
	
	public void screenshot () {
		
		
		try {
			
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
			File destinationfile=new File("D:\\complete frameWork\\screenshot.png");
			FileHandler file=new FileHandler();
			file.copy(sourcefile, destinationfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void highlightWebElement(WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = '2px solid red'", element);
	}
}
