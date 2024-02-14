package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstclass 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venka\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
          	driver.get("https://demo.guru99.com/test/newtours/");
          	driver.manage().window().maximize();
          	driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
          	driver.findElement(By.name("firstName")).sendKeys("Vyshnavi");
          	driver.findElement(By.name("lastName")).sendKeys("Katak");
          	driver.findElement(By.name("phone")).sendKeys("234-456-5678");
          	driver.findElement(By.id("userName")).sendKeys("nimmani");
          	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("W south Street");
          	driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Ashburn");
          	driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Virginia");
          	driver.findElement(By.xpath("//input[contains(@name,'postalCode')]")).sendKeys("206587");
          	//new Select(driver.findElement(By.xpath("//select[@name='country']"))).selectByIndex(2); // By Xpath Index
          	//new Select(driver.findElement(By.xpath("//select[@name='country']"))).selectByVisibleText("FIJI"); //By Xpath Text
          	new Select(driver.findElement(By.xpath("//select[@name='country']"))).selectByValue("CORAL SEA ISLANDS"); // By Xpath Value
          	//new Select(driver.findElement(By.cssSelector("select[name='country']"))).selectByIndex(6); // By Css
          	driver.findElement(By.id("email")).sendKeys("vyshnavi854");
          	driver.findElement(By.name("password")).sendKeys("asdfglkjh");
          	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("asdlkjhgf");
          	driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	}

}