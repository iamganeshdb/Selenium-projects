package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class facebookmeme 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("imganeshdb@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9731@Ganesh");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@name='login']")).click();
    Thread.sleep(6000);
    driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("memepages");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[text( )= ' meme pages on facebook']")).click();
    Thread.sleep(6000);
    driver.findElement(By.xpath("//span[text( )='Like']")).click();
}
}
