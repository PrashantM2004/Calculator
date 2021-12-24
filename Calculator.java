package Cal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Calculator
{
	WebDriver wd;
	@Test (priority=0)
	public void Multiplication() 

	{
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();

		wd.findElement(By.xpath("//span[contains(text(),'×')]")).click();
             
		wd.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		
		

	}


	@Test (priority=1)
	public void Division()
	{
		wd.findElement(By.xpath("//span[contains(text(),'AC')]")).click();

		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();

		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();

		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();

	}

	@Test (priority=2)
	public void Addition()
	{
		wd.findElement(By.xpath("//span[contains(text(),'AC')]")).click();

		wd.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();

		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();

		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	}

	@Test (priority=3)
	public void Subtraction() 
	{


		wd.findElement(By.xpath("//span[contains(text(),'AC')]")).click();

		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();

		wd.findElement(By.xpath("//span[contains(text(),'–')]")).click();

		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'9')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();

	}

	@BeforeTest
	public void beforeTest() 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.calculator.net");
	}

	@AfterTest
	public void afterTest()
	{


		wd.close();
	}

}
