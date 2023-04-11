package Day5;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_5 {
	public static void main(String [] args)
	{
		WebDriverManager.chromedriver().setup();
			  WebDriver driver;
			  ChromeOptions co = new ChromeOptions();
			  co.addArguments("--remote-allow-origins=*");
			  driver = new ChromeDriver(co);
			
	  
			  driver.get("https://www.google.com/");
			  driver.manage().window().maximize();
			  driver.findElement(By.name("q")).sendKeys("Apple");
			  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			  System.out.println(driver.getWindowHandle());
			  System.out.println(driver.getTitle());
			  
			  driver.switchTo().newWindow(WindowType.TAB);
			  driver.get("https://www.google.com/");
			  driver.manage().window().maximize();
			  driver.findElement(By.name("q")).sendKeys("Selenium");
			  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getWindowHandle());
			  
			  
			  
			  driver.switchTo().newWindow(WindowType.TAB);
			  driver.get("https://www.google.com/");
			  driver.manage().window().maximize();
			  driver.findElement(By.name("q")).sendKeys("Cucumber");
			  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getWindowHandle());
			  
			  Set<String>s=driver.getWindowHandles();
			  System.out.println("Total Number of browsers "+s.size());
			  
	}

}
