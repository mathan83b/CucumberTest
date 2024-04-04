package com.io.driversManagement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.lao.constants.Constants;

import stepDefinitions.Common_Step_Def;

public class Base {

	
	public static WebDriver driver;
	public static final Logger logger=LogManager.getLogger(Common_Step_Def.class);
	public static void driverManager() {
		
		try {
			
			logger.info("Launching browser");
			switch (Constants.Browser) {
			case "chrome":
				logger.info("Launching"+Constants.Browser);
				 driver=new ChromeDriver();
				 logger.info(Constants.Browser+"launched");
				break;
				
			case "firefox":
				logger.info("Launching"+Constants.Browser);
				driver=new FirefoxDriver();
				logger.info(Constants.Browser+"launched");
				break;
			case "edge":
				logger.info("Launching"+Constants.Browser);
				driver=new EdgeDriver();
				logger.info(Constants.Browser+"launched");
				break;
			case "ie":
				logger.info("Launching"+Constants.Browser);
				driver=new InternetExplorerDriver();
				logger.info(Constants.Browser+"launched");
				break;

			default:
				logger.info("Launching"+Constants.Browser);
				driver=new ChromeDriver();
				logger.info(Constants.Browser+"launched");
				break;
			}

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
