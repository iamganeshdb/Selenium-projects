package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubelink 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("rajkumara trailer");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='video-title'and@title='RAAJAKUMARA | OFFICIAL TRAILER | PUNEETH RAJKUMAR | V HARIKRISHNA | SANTOSH | HOMBALE FILMS']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='segmented-like-button'and@class='style-scope ytd-segmented-like-dislike-button-renderer']")).click();
}	
}

