package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class kg {

	ChromeDriver ob;
@Given("user is on login page")
public void user_is_on_login_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	 ob= new ChromeDriver();
	//EdgeDriver ob= new EdgeDriver();
	ob.get("http://www.mycontactform.com");
	
	
}

@When("user enters username and password")
public void user_enters_username_and_password() {
    
	//id=user
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		//name=pass
		
		ob.findElementByName("pass").sendKeys("12345");
		
}

@And("click on login button")
public void click_on_login_button() {

	//classname
	ob.findElementByClassName("btn_log").click();
	
    
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() throws InterruptedException {
	Thread.sleep(3000);
	ob.quit();
}

}
