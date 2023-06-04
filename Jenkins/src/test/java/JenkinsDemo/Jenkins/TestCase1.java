package JenkinsDemo.Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCase1 {
	
	@Test
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		String Name=System.getProperty("username");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).
		sendKeys(Name);
		
		
	}
	

}
