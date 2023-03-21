package selenium1;

import java.io.File;
import java.sql.Driver;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.IN");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dress");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//span[.='Midi Bodycon Bishop Puff Sleeve One Piece Dress Black']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//span[@id='sw-gtc']")).click();
}
}
