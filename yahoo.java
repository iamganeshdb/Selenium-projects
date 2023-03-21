package selenium1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://login.yahoo.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ganesh.db33@yahoo.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9731@GGG");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@title='Mail']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@role='button']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@role='combobox'and@aria-owns='react-typehead-list-to']")).sendKeys("manipg999@yahoo.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("sample");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("hiiii");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@tabindex='-1'and@title='Send this email']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[@id='ybarAccountMenuOpener']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@title='Sign In']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@role='button']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manipg999@yahoo.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9731@MMM");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@title='Mail']")).click();
Thread.sleep(2000);
}
}
