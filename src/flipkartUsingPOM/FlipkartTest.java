package flipkartUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		FlipkartPopup f1=new FlipkartPopup(driver);
		
		f1.clickPopup();
		
		FlipkartLogin f2=new FlipkartLogin(driver);
		
		f2.clickOnLogin();
		f2.EnterMObNO();
		f2.EnterPassword();
		f2.clickOnLoginButton();
		Thread.sleep(1000);
		
		FlipkartHomePage f3=new FlipkartHomePage(driver);
		
		f3.getUserName();
		Thread.sleep(1000);
		
		driver.close();

	}

}
