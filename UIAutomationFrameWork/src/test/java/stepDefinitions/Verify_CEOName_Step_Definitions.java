package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.io.driversManagement.Base;
import com.lao.constants.Constants;
import com.lao.pageobjects.DirectoryPage;
import com.lao.pageobjects.HomePage;
import com.lao.utils.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_CEOName_Step_Definitions extends Base {

	
	
@Given("User is on Home Page once logged in")
public void user_is_on_Home_page_once_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    
    try {
    	
        String name=HomePage.getInstance().getDashboard().getText();
        if(name.equalsIgnoreCase("Dashboard")) {
        	logger.info("User is logged on Successfully");
      
        }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.error(e);
		
		Assert.fail(e.getMessage());
	}
}



@When("Navigate to menu>>directory")
public void navigate_to_menu_directory() {
    // Write code here that turns the phrase above into concrete actions
	
	 
	 try {
		 DirectoryPage.getInstance().getDirectoryField().click();
		Thread.sleep(4000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.error(e);
		
		Assert.fail(e.getMessage());
	}
}

@When("select job title as {string} from the dropdown")
public void select_job_title_as_from_the_dropdown(String CFOName) {
    // Write code here that turns the phrase above into concrete actions
	 
    
    
    try {
    	
    	DirectoryPage.getInstance().getJobTitle().click();
    	Thread.sleep(4000);
		
		for (WebElement element:DirectoryPage.getInstance().getDropdown()) {
		    	
		    	if (element.getText().equalsIgnoreCase(CFOName)) {
		    		element.click();
		    		break;
		    	}
		 }
		 }
	 catch (Exception e) {
		// TODO Auto-generated catch block
		logger.error(e);
		
		Assert.fail(e.getMessage());
		
	}
    
   
    	
    }
	 


@When("Do search")
public void do_search() {
    // Write code here that turns the phrase above into concrete actions
	 
	 try {
		
		 DirectoryPage.getInstance().getSearch().click();
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		logger.error(e);
		
		Assert.fail(e.getMessage());
	}
}

@Then("user should see CEO name as {string}")
public void user_should_see_ceo_name_as(String rawname) {
    // Write code here that turns the phrase above into concrete actions
	
	 try {
		 WebElement CFOElement=DirectoryPage.getInstance().getCFOName();
		 String name=CFOElement.getText();
		 
		 System.out.println("Chief Financial Officer Name is" +name);
	} catch (Exception e) {
		// TODO: handle exception
		logger.error(e);
		
		Assert.fail(e.getMessage());
	}
	
	 
	 
}
}
