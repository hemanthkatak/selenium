package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locatoPractice 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venka\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://demo.guru99.com/test/newtours/index.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Flights")).click();
	    new Select(driver.findElement(By.xpath("//select[@name='passCount']"))).selectByValue("3");
	    new Select(driver.findElement(By.xpath("//select[@name='fromPort']"))).selectByIndex(4);
	    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("New York");
	    new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("March");
	    //new Select(driver.findElement(By.xpath("//select[text()='fromMonth']"))).selectByVisibleText("April");  //we have locator name, Can we right Xpath??
	    new Select(driver.findElement(By.xpath("//select[contains(@name,'fromDay')]"))).selectByValue("6");
	    new Select(driver.findElement(By.name("toPort"))).selectByIndex(5);
	    new Select(driver.findElement(By.xpath("//select[@name='toMonth']"))).selectByValue("10");
	    new Select(driver.findElement(By.name("toDay"))).selectByIndex(20);
	    driver.findElement(By.xpath("//input[@value='Business']")).click();
	    new Select(driver.findElement(By.xpath("//select[@name='airline']"))).selectByVisibleText("Unified Airlines");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.linkText("BACK TO HOME")).click();  // NOT GOING TO HOME PAGE!!!
	    driver.findElement(By.xpath("//img[@src='images/home.gif']")).click();
	    
	    
	}

}
