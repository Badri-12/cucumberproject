package Stepdefinition;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
public static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
public static void setDriver(WebDriver driver1) {
	if(driver.get()==null) {
		driver.set(driver1);
		driver.get().manage().window().maximize();
	}
}
public static WebDriver getDriver() {
	return driver.get();
}
}
