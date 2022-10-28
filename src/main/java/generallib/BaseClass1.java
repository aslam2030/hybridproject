package generallib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	public WebDriver driver;
	public PropertyFileData1 pdata = new PropertyFileData1();
	public WebDriverUtilies1 driverutiles = new WebDriverUtilies1();
	
	
	@BeforeMethod
	public void OpenApp() throws IOException {
		WebDriverManager .chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp() {
		//driver.quit();
	}
}
