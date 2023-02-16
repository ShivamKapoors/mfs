package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import utilities.DataProviders;

public class PaymentPage extends Baseclass {
	public static WebElement titletype, titlemonths, titledays, titlegender;

	@Test(dataProviderClass=DataProviders.class,dataProvider ="paymentpage")
	public void payment_Page(String title, String firstname, String lastname) {

		driver.findElement(By.xpath(OR.getProperty("title"))).sendKeys(title);
		driver.findElement(By.xpath(OR.getProperty("firstname"))).sendKeys(firstname);
		driver.findElement(By.xpath(OR.getProperty("lastname"))).sendKeys(lastname);
		driver.findElement(By.xpath(OR.getProperty("Month"))).sendKeys("March");
		driver.findElement(By.xpath(OR.getProperty("Day"))).sendKeys("18");
		driver.findElement(By.xpath(OR.getProperty("year"))).sendKeys("1982");
		driver.findElement(By.xpath(OR.getProperty("Gender"))).sendKeys("Male");
		driver.findElement(By.xpath(OR.getProperty("Payment_Details"))).sendKeys("4209758743298071");
		driver.findElement(By.xpath(OR.getProperty("cardholder_name"))).sendKeys("David Warne");
		driver.findElement(By.xpath(OR.getProperty("expiration_month"))).sendKeys("x");
		driver.findElement(By.xpath(OR.getProperty("expiration_year"))).sendKeys("2022");
		driver.findElement(By.xpath(OR.getProperty("CVV"))).sendKeys("250");
		driver.findElement(By.xpath(OR.getProperty("Billing_address"))).sendKeys("450 paris drive");
		driver.findElement(By.xpath(OR.getProperty("Billing_address_city"))).sendKeys("Paris");
		driver.findElement(By.xpath(OR.getProperty("Billing_address_Code"))).sendKeys("ALASKA");
		driver.findElement(By.xpath(OR.getProperty("zip"))).sendKeys("M1G 2V7");
		driver.findElement(By.xpath(OR.getProperty("Billing_Phone"))).sendKeys("1234567890");
		driver.findElement(By.xpath(OR.getProperty("Email"))).sendKeys("abcdefghi@gmail.com");
		driver.findElement(By.xpath(OR.getProperty("Confirm_Email"))).sendKeys("abcdefghi@gmail.com");
	//	Reporter.log("The testcase has executed successfully.");
		}
}
