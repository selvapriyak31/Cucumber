package org.stepdefinition;


	import java.io.IOException;

	import org.base.BaseClass;
//	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

	import cucumber.api.Scenario;
	import io.cucumber.java.After;
	import io.cucumber.java.Before;

	public class Hookclass extends BaseClass {
		@Before()
		public void beforeScenarnio1() {
			System.out.println("------before scenario---1");
			browserLaunch("chrome");
			urllaunch("https://shopee.sg/");
			implicitlyWait(20);
			
			
		}
	//@Before("@smoke or @retest")
	//public void beforeScenario2()
	//{
//		System.out.println("------after scenario---2");
	//}
	@After()
	public void afterScenario1(Scenario sc) throws IOException
	{
		System.out.println("------after scenario---1");
	if(sc.getName() != null) {
		takeScreenshot(sc.getName());
		}
		quit();
	}
	//@After("@smoke or @retest")
	//public void afterScenario2()
	//{
//		System.out.println("------after scenario---2");
	//}
	}

