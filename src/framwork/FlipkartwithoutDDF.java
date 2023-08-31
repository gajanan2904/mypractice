package framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipkartwithoutDDF {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8208371047");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("G@janan29");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		String actualName = driver.findElement(By.xpath("(//div[@class='exehdJ'])[1]")).getText();
		String expectedName="Gajanan";
		
		if(actualName.equals(expectedName))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
		//WebElement dropDown = driver.findElement(By.xpath("(//div[@class='exehdJ'])[1]"));
		
		//Select s=new Select(dropDown);
		
		//driver.findElement(By.xpath("(//li[@class='_2NOVgj'])[9]")).click();
		
		
				
		
		
		
		

	}

}
