package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe" );
		 
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		

		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("checkBoxOption1"));
        WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
        
        boolean result = checkbox1.isSelected();
        
        if(result)
        {
        	System.out.println("checkbox1 is selected");
        }
        else
        {
        	System.out.println("checkbox1 is not selected pls select it");
        	
        	checkbox1.click();
        	boolean result1 = checkbox1.isSelected();
        	System.out.println("updated checkbox selected status is "+result1);
        }
	}

}
