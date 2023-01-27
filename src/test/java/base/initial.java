package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class initial{
	

public static WebDriver driver;


@BeforeSuite
public  void main() {
System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver_selenium.exe");
 driver = new ChromeDriver();

 driver.manage().window().maximize();
 driver.get("http://192.168.1.35:8083/#/login");
}
}
