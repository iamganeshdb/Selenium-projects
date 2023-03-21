package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adobelaunch 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/text-box");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ganesh");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("imganeshdb@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("bangalore");
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("davanagere");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='submit']")).click();
}
}
