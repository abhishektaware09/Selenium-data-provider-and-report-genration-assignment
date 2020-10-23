package Assignment7;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class report {

	WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;

	@Test
	public void f() {
		if (driver.getTitle().equals("Gmail")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}

	}
	@Before
	public void beforeTest() {
		report = new ExtentReports("C:\\Users\\Abhishek\\Desktop\\Selenium assignment 6\\ExtentReport.html",true);
		test = report.startTest("Extent Demo");
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
	}

	@After
	public void afterTest() {
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}