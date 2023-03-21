package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Instagram 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe")	;
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[name=username]")).sendKeys("imganeshdb@gmail.com");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[type=password]")).sendKeys("9731@Ganesh");
Thread.sleep(2000);
driver.findElement(By.cssSelector("button[type=submit]")).click();
}
}

