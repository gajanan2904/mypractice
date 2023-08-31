package handlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='product']//th"));
		
		int ColumnSize = column.size();
		System.out.println("column size is "+ColumnSize);
		Thread.sleep(1000);
		
		List<WebElement> Row = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		int RowSize = Row.size();
		System.out.println("Row size is "+RowSize);
		Thread.sleep(1000);
		
		//now we want to print whole table for that we have to remember that in frist row after Tr their is Th 
		//And in reamaning row after Tr their is Td
		//we use findelement method..becaz we want to use get text method..
		//it is possible to use findelements method for table dispalay..but this is static coding
		//By using findelement method we able to decleaard dyanamic coding
		
		for(int i=1;i<=RowSize;i++)
		{
			for(int j=1;j<=ColumnSize;j++)
			{
				if(i==1)
				{
		 String haeader = driver.findElement(By.xpath("//table[@id='product']//tr[" +i+ "]//th[" +j+ "]")).getText();
		       System.out.print(haeader+"!! ");
				}
				else
				{
				String Allrows = driver.findElement(By.xpath("//table[@id='product']//tr[" +i+ "]//td[" +j+ "]")).getText();	
				System.out.println(Allrows+"!! ");
				}
			}
			System.out.println();
		}
	}

}
