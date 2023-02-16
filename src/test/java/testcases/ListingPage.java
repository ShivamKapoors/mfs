package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import baseclass.Baseclass;

public class ListingPage extends Baseclass
{
	@Test 	
	public void listingPage()
	{
		driver.findElement(By.xpath(OR.getProperty("button_one"))).click();
	}
}
