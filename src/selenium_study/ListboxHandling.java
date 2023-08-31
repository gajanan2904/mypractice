package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//1.Identify list box to be handled and store it in refernce variable
		
		WebElement DropdownBox = driver.findElement(By.id("dropdown-class-example"));
		
		//2.Create an object of select class which will accept webElement as argument
		
		Select s=new Select(DropdownBox);
		
		//3.By using one of the select class methods we can select values from list box like
		
//		  1.selectByVisibleText-->string
//		  2.selectByIndex-->int
//		  3.selectByValue-->String
		
		s.selectByVisibleText("Option1");
		Thread.sleep(2000);
		s.selectByIndex(2);
        Thread.sleep(1000);
        s.selectByValue("option3");
	}

}
