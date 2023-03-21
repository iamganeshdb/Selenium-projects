package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemaps 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/maps");
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("rajajinagar metrostation");
Thread.sleep(10000);
driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//button[@aria-label='Directions to Rajajinagar']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("mejastic");
Thread.sleep(10000);
driver.findElement(By.xpath("//span[.='Bengaluru, Karnataka']")).click();
}
}

