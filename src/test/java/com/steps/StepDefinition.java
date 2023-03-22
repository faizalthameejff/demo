package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	@Given("User is on FB page")
	public void user_is_on_fb_page() {
		browserLaunch("https://www.facebook.com/");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	}

	@When("User clicks on login page")
	public void user_clicks_on_login_page() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

	@When("User print URL")
	public void user_print_url() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	@When("User print title")
	public void user_print_title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

}
