package org.stepdefintion1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps1 {
	WebDriver driver;
	@Given("The user should open the home page of ebay")
	public void the_user_should_open_the_home_page_of_ebay() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    }

	@When("The user has to give the product and name search")
	public void the_user_has_to_give_the_product_and_name_search() {
		WebElement sea = driver.findElement(By.id("gh-ac"));
		sea.sendKeys("electric guitar",Keys.ENTER);
	   }

	@When("The user has to click the product and get the product cost")
	public void the_user_has_to_click_the_product_and_get_the_product_cost() {
		WebElement prclk = driver.findElement(By.xpath("//h3[text()='Mitchell TD100 3/4 Size Surf Green Electric Guitar Starter Pack w/ Fender Strap']"));
		prclk.click();
		WebElement price = driver.findElement(By.xpath("//span[text()='$109.00']"));
		String text = price.getText();
		System.out.println(text);
	    }

	@Then("The user should be in the valid page of the particular product")
public void the_user_should_be_in_the_valid_page_of_the_particular_product() {
	System.out.println("valid page");
	

	}

	}



