package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mysecond_seleniumcode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver sitecheck=new ChromeDriver();
		
		sitecheck.get("https://study.physicswallah.live/auth");
		

	}

}
