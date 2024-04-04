package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.gherkin.model.Feature;
import com.io.driversManagement.Base;
import com.lao.constants.Constants;
import com.lao.pageobjects.HomePage;
import com.lao.utils.Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_Step_Def extends Base {

	
	Utilities utilities=new Utilities();
	
	
	
	@Before
	public void browserLaunch() {
		
		logger.info("Execution started");
		
		
		try {
			
			logger.info("Loading variables from the Properties file");
			utilities.LoadProperties();
			
			logger.info("Calling driver Manager");
			driverManager();
			utilities.InitializationOfWebElements();
			login();
					} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}



	private void login() {
		// TODO Auto-generated method stub
		 
		 try {
			 driver.get(Constants.App_Url);
			 Thread.sleep(4000);
			 HomePage.getInstance().getUserName().sendKeys(Constants.UserName);
			 HomePage.getInstance().getPassWord().sendKeys(Constants.Password);
			 HomePage.getInstance().getLogin().click();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e);
			utilities.screenshot();
			Assert.fail(e.getMessage());
		}
	}
	
	@After
	public void TakesScreesnshot(Scenario scenario) {
		
		if(scenario.isFailed()){
		TakesScreenshot ts=(TakesScreenshot) driver;
		byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "error_screen");
		}
	}
		
		
	}

