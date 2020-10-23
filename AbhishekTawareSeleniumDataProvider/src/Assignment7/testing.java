package Assignment7;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class testing {
	@Test(dataProvider = "data")
	public void f(Integer SrNo, String FirstName,String LastName) throws IOException {
		System.out.println(SrNo);
		System.out.println(FirstName);
		System.out.println(LastName);
	}

	@DataProvider(name="data")
	public Object[][] information() {
		Object[][] data = new Object[2][3];

		data[0][0]=1;
		data[0][1]="ashok";
		data[0][2]="taware";

		data[1][0]=2;
		data[1][1]="abhishek";
		data[1][2]="taware";

		return data;
	}
	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
