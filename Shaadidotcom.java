package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shaadidotcom 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.shaadi.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@data-testid='login_email']")).sendKeys("imganeshdb@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@data-testid='login_password']")).sendKeys("47362746364");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@data-testid='sign_in']")).sendKeys("47362746364");
}
}

