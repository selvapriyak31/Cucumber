package org.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver;

		@Given("The user should open the home page of shopee")
		public void the_user_should_open_the_home_page_of_shopee() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://shopee.sg/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    }

		@When("The user has to click the login buttton")
		public void the_user_has_to_click_the_login_buttton() {
		WebElement btnlogin = driver.findElement(By.xpath("//a[text()='Login']"));
		btnlogin.click();

		    }
		@When("The user has to fill the username and password")
		public void the_user_has_to_fill_the_username_and_password(io.cucumber.datatable.DataTable data) {
		     
		    	 List<List<String>> list=data.asLists();
		    	 List<String> li=list.get(2);
		    	 String user=li.get(0);
		    	 System.out.println(user);
		    	 
		    	 String pass = li.get(1);
		    	 System.out.println(pass);
		    	 
		     
			
			WebElement username = driver.findElement(By.name("loginKey"));
			username.sendKeys(list.get(2).get(0));
			WebElement userpwd = driver.findElement(By.name("password"));
			userpwd.sendKeys(list.get(2).get(1));
//		 List<Map<String,String>> list =data.asMaps();
//	    	 Map<String,String> mp =list.get(1);
//	    	 String user=mp.get("username");
//	    	 System.out.println(user);
//	    	 
//	    	 String pass = mp.get("password");
//	    	 System.out.println(pass);
//	    	 
	     
//		
//		WebElement username = driver.findElement(By.name("loginKey"));
//		username.sendKeys(list.get(1).get("username"));
//		WebElement userpwd = driver.findElement(By.name("password"));
//		userpwd.sendKeys(list.get(1).get("password"));
//		
				
		   }
		

		@Then("The user should navigate to the buyer login")
		public void the_user_should_navigate_to_the_buyer_login() {
			
			WebElement btnlogin1 = driver.findElement(By.xpath("//button[text()='Log In']"));
			btnlogin1.click();
			
//			WebDriverWait w=new WebDriverWait(driver,30);
//			Boolean bt = w.until(ExpectedConditions.urlContains("initial=true"));
//			Assert.assertTrue("verify the login", driver.getCurrentUrl().contains("initial=true"));
			//System.out.println("I am a valid page");
			driver.quit();
			
			
		    }



}
