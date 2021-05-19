package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {

	@Test
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			driver.get("www.google.com");
			Thread.sleep(50000);
			driver.close();
		}

}
