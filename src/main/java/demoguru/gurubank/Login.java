package demoguru.gurubank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	static WebDriver driver;
	
	@Given("The user id is in demo guru page.")
	public void the_user_id_is_in_demo_guru_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\Desktop\\Praveen\\gurubank\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	}

	@When("The user enters valid username,password and clicks the login button.")
	public void the_user_enters_valid_username_password_and_clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("uid")).sendKeys("mngr165077");
		driver.findElement(By.name("password")).sendKeys("hepYdap");
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("the user should be in managers home page.")
	public void the_user_should_be_in_managers_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("http://demo.guru99.com/V4/manager/Managerhomepage.php", driver.getCurrentUrl());
	
	}


	

}
