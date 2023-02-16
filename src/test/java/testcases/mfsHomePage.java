package testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import utilities.DataProviders;
import utilities.TestUtil;

public class mfsHomePage extends Baseclass {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "homepage")
	public void flightSearch(String origin, String destination) throws InterruptedException {

		log.debug("Inside flight search Test");
		type("From_xpath", origin);
		type("To_xpath", destination);
		// driver.findElement(By.xpath(OR.getProperty("From_xpath"))).sendKeys(origin);
		// driver.findElement(By.xpath(OR.getProperty("To_xpath"))).sendKeys(destination);
		driver.findElement(By.xpath(OR.getProperty("From_Date_xpath_Click"))).click();
		driver.findElement(By.xpath(OR.getProperty("From_Date_xpath"))).click();
		driver.findElement(By.xpath(OR.getProperty("To_Date_xpath_Click"))).click();
		driver.findElement(By.xpath(OR.getProperty("To_date_xpath"))).click();
		driver.findElement(By.xpath(OR.getProperty("Search_now"))).click();
		;
		log.debug("Flight Search has been successfull.");
		log.debug("We have loaded the homepage completely");
		// Thread.sleep(3000);

	}

}
