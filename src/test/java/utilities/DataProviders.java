
package utilities;


import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "homepage")
	public static Object[][] homepage() {
		ExcelReader excel = new ExcelReader(Constants.homepage);
		System.out.println(Constants.homepage);
		String sheetName = "Homepage";
		return TestUtil.getData(sheetName, excel);

	}

	@DataProvider(name = "paymentpage")
	public static Object[][] paymentpage() {
		ExcelReader excel = new ExcelReader(Constants.paymentpage);
		System.out.println(Constants.paymentpage);
		String sheetName = "Sheet1";
		return TestUtil.getData(sheetName, excel);

	}
}
