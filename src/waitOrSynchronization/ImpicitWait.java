package waitOrSynchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpicitWait {

	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/?gclid=EAIaIQobChMI2tW91oS1-AIVgh0rCh3LMAjFEAAYASAAEgJKK_D_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		//instead of sleep we use implicit wait
		//100sec-->10sec page laod-->90sec time relased-->advantage

	}

}
