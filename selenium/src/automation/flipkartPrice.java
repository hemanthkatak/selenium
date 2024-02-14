package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flipkartPrice 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venka\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath("//select[@class='_2YxCDZ']"))).selectByIndex(0);
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"))).selectByValue("20000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		

	}

}
