package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebpage 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(3000);
driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[.='Computing and Internet']/../../div[3]/div[2]/input")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[.='Fiction']/../../div[3]/div[2]/input")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[.='Shopping cart']")).click();
}
}
