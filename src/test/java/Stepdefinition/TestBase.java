package Stepdefinition;

import java.io.*;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.cucumber.java.*;

public class TestBase {
private String browser;
@Parameters("Browser")
public void setBrowser(String browser) {
	this.browser=browser;
}
@Before
public void setUp() {
	try {
String browser=System.getProperty("browser");
	System.out.println(browser+"=========================================================");
	if(browser.equals("Chrome"))
	DriverFactory.setDriver(new ChromeDriver());
	else if(browser.equals("Edge"))
		DriverFactory.setDriver(new EdgeDriver());
	//DriverFactory.setDriver(new ChromeDriver());
	}
	catch(Throwable th) {
		DriverFactory.setDriver(new ChromeDriver());
	}
}
@After
public void teatDown(Scenario scenario) throws IOException {
	File fp=new File(scenario.getName()+".png");
	byte[] source=((TakesScreenshot)DriverFactory.driver.get()).getScreenshotAs(OutputType.BYTES);
	
	if(scenario.isFailed()) {
		scenario.attach(source, "image/png", scenario.getName());
	}
	else
		scenario.attach(source, "image/png", scenario.getName());
	DriverFactory.driver.get().quit();
	DriverFactory.driver.set(null);
	System.out.println("Browsers closed");
}

}
