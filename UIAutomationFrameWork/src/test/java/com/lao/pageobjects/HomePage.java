package com.lao.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lao.utils.Utilities;

public class HomePage extends Utilities {
	
	
public static HomePage instance;
	
	private  HomePage() {
		
	}
	public static  HomePage getInstance() {
		
		if(instance==null) {
			
			instance=new HomePage();
		}
		return instance;
	}

	
	@FindBy(name = "username")
	public  WebElement UserName;
	
	@FindBy(name = "password")
	public   WebElement PassWord;
	
	@FindBy(xpath = "//button[text()[contains(.,' Login ')]]")
	public  WebElement Login;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	public WebElement Dashboard;
		
	

	public WebElement getDashboard() {
		return Dashboard;
	}
	public WebElement getUserName() {
		highlightWebElement(UserName);
		return UserName;
	}

	public WebElement getPassWord() {
		highlightWebElement(PassWord);
		return PassWord;
	}

	public WebElement getLogin() {
		highlightWebElement(Login);
		return Login;
	}
	
	
}
