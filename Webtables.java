package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/webtables");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@id='delete-record-1']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@id='delete-record-2']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@id='delete-record-3']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ganesh");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("db");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("imganeshdb@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("23");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Salary']")).sendKeys("25000");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Department']")).sendKeys("testing");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("raki");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("gk");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("rakigk@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("23");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Salary']")).sendKeys("25000");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Department']")).sendKeys("testing");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("manja");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("g");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("manjag@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("23");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Salary']")).sendKeys("25000");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Department']")).sendKeys("testing");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='submit']")).click();
Thread.sleep(2000);
}
}
