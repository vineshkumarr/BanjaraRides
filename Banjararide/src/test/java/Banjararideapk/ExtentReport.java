package Banjararideapk;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	ExtentHtmlReporter  htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void reportSetup() {
		
	//START REPORTERS
		
    htmlReporter = new ExtentHtmlReporter("extent.html");
    
    //CREATE EXTENT REPORTS AND ATTACH REPORTERS
    
    extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
	}
	
	@AfterSuite
	public void reportTeardown() {
	extent.flush();
	}

}

