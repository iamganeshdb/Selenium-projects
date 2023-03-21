package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scripts
{
public static void main(String[] args) 
{
	String key="webdriver.chrome.driver";
	String value="chromedriver.exe";
System.setProperty(key,value);
ChromeDriver driver= new ChromeDriver();
}
}
