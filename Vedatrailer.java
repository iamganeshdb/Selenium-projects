package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vedatrailer
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.tagName("input")).sendKeys("rajkumara trailer");
	Thread.sleep(2000);
	driver.findElement(By.id("search-icon-legacy")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("RAAJAKUMARA | OFFICIAL TRAILER | PUNEETH RAJKUMAR | V HARIKRISHNA | SANTOSH | HOMBALE FILMS")).click();
}
}
