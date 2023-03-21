package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("imganeshdb@gmail.com");
Thread.sleep(2000);
driver.findElement(By.name("pass")).sendKeys("9731@Ganesh");
Thread.sleep(2000);
driver.findElement(By.name("login")).click();
}
}
