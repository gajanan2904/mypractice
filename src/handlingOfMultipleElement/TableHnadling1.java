package handlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHnadling1 {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			//focous on xpath of tableheader    how to use absolute xpath
			List<WebElement> TableHeader = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th"));
			Thread.sleep(2000);
			
			for(WebElement w:TableHeader)
			{
				System.out.print(w.getText()+ " ");
			}
			System.out.println();
			
			//how to use for loop in findelements focous on i in findelements method
			for(int i=2;i<=11;i++)
			{
			
			List<WebElement> RowOftable = driver.findElements(By.xpath("(//table[@id='product']/tbody/tr)["+i+"]"));
			for (WebElement w:RowOftable)
			{
				System.out.println(w.getText()+ " ");
			}
			}
	}

}
