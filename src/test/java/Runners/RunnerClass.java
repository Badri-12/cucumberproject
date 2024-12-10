package Runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.errorprone.annotations.ForOverride;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/Features",glue=".Stepdefinition",plugin= {"pretty","html:target/cucumber-report/SnapdealReport.html"},dryRun=false, monochrome = true)
public class RunnerClass extends AbstractTestNGCucumberTests {
@Override
	@DataProvider(parallel=true)
public Object[][] scenarios(){
	return super.scenarios();
}
}
