package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absulute_path {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]")).sendKeys("12345");;
	Thread.sleep(20000);
}
}
