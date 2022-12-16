package Banjararideapk;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;

public class Banjararide extends Capabilities {
	
	AndroidDriver<AndroidElement>driver;
	@BeforeTest
	public void BT() throws MalformedURLException, InterruptedException
	{
		driver = banjara();
		Thread.sleep(10000);
	}
	
@Test(priority=0, enabled = true)
public void launchbanjararide() throws InterruptedException 
{
	
	ExtentTest test = extent.createTest("Test One","Test case one");
	test.log(Status.INFO, "Test One Started");

    //SELECT APPLICATION LANGUAGE

	driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"ENGLISH\")")).click();
	Thread.sleep(8000);
	
	//LOGIN USING MOBILE NUMBER
	
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imageView_arrow")).click();
	Thread.sleep(5000);
	
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/editText_search")).sendKeys("+91");
	Thread.sleep(5000);
   
	
	driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"India (IN)\")")).click();
	Thread.sleep(3000);
	
	driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Enter your mobile number\")")).sendKeys("9942777792");
	Thread.sleep(3000);
	
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
	Thread.sleep(13000);
	
	//MANUALLY ENTER THE OTP
	
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
	Thread.sleep(8000);
	
	
	//TAP ON BOOK NOW
	
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/link_2")).click();
	Thread.sleep(3000);
	
	test.log(Status.PASS, "Booked");
	
	
	//TAP ON HIRE BIKE
	
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/infocenterlib_page_name")).click();
	Thread.sleep(5000);
	
	
	//SCROLL AND SELECT CB HORNET 160R
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"CB Hornet 160R\"))").click();
	Thread.sleep(6000);
	
	test.log(Status.PASS, "CB Hornet 160R selected");
	
    //SELECT BOOK NOW
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Book Now\"))").click();
	Thread.sleep(6000);
	
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/rlDurationSpinner")).click();
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));				
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    Thread.sleep(6000);
    
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/tvDate")).click();
	Thread.sleep(6000);
	
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_UP));
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    driver.pressKey(new KeyEvent(AndroidKey.DPAD_LEFT));
	driver.pressKey(new KeyEvent(AndroidKey.ENTER)); 
	driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"1\")")).click();
	Thread.sleep(6000);
	
	driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
	Thread.sleep(3000);
	
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	test.log(Status.PASS, "Navigated to Homepage");
	 
	
	//TAP ON BOOKINGS
	
    driver.findElement(MobileBy.AccessibilityId("Open")).click();
//	driver.findElementByClassName("android.widget.ImageButton").click();
	Thread.sleep(6000);
	
	driver.findElement(MobileBy.id("com.google.android.youtube:id/bottom_bar_container")).click();
	Thread.sleep(6000);
	
	
	//SEARCH FOR ACTIVA
	
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_button")).click();
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_src_text")).sendKeys("Activa");
	Thread.sleep(6000);
	
	driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_close_btn")).click();
	Thread.sleep(6000);
	
	test.log(Status.PASS, "clear search");
	
	 
    //TAP ON CALL US AND NAVIGATE BACK TO THE APPLICATION HOMEPAGE
 
	driver.findElement(MobileBy.className("android.widget.ImageButton")).click();
	Thread.sleep(6000);
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Call Us\"))").click();
	Thread.sleep(6000);	
	
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(6000);
	driver.findElementByClassName("android.widget.ImageButton").click();
	Thread.sleep(6000);
	
	test.log(Status.PASS, "Call us selected and navigated to homepage ");
	 
    //CLOSING THE APPLICATION
	 
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Logout\"))").click();
	
	
}
}
