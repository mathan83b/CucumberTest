package com.lao.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lao.utils.Utilities;

public class DirectoryPage extends Utilities{
	
	
	
	public static DirectoryPage instance;
	
	private  DirectoryPage() {
		
	}
	public static  DirectoryPage getInstance() {
		
		if(instance==null) {
			
			instance=new DirectoryPage();
		}
		return instance;
	}

	@FindBy(linkText = "Directory")
	public  WebElement DirectoryField;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")
	public  WebElement JobTitle;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div")
	public  List<WebElement> dropdown;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
	public  WebElement search;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div/p[1]")
	public  WebElement CFOName;

	public WebElement getDirectoryField() {
		highlightWebElement(DirectoryField);
		return DirectoryField;
	}

	public WebElement getJobTitle() {
		highlightWebElement(JobTitle);
		return JobTitle;
	}

	public List<WebElement> getDropdown() {
		return dropdown;
	}

	public WebElement getSearch() {
		highlightWebElement(search);
		return search;
	}

	public WebElement getCFOName() {
		highlightWebElement(CFOName);
		return CFOName;
	}
	
	
}
