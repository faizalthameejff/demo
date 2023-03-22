package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks extends BaseClass {

	@Before
	public void beforeScenario1(Scenario s) {
		System.out.println("Hooks - BeforeScenario1");
		String name = s.getName();
		System.out.println(name);
	}

	@After
	public void afterScenario(Scenario s) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] fbImage = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(fbImage, "image/png");
	}
	/*
	 * @Before(order = 2) public void beforeScenario2() {
	 * System.out.println("Hooks - BeforeScenario2"); }
	 * 
	 * @Before(order = 1) private void beforeScenario3() {
	 * System.out.println("Hooks - BeforeScenario3"); }
	 */
}
