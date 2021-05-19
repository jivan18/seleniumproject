package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		WebElement element = driver.findElement(By.name("cusid"));
		int wdth= element.getSize().getWidth();
		int ht = element.getSize().getHeight();
		System.out.println("width= "+wdth+"hight= "+ht);
		String str = driver.getTitle();
		System.out.println("title== "+str);
		driver.findElement(By.name("cusid")).clear();
		driver.findElement(By.name("cusid")).sendKeys("prank");
		String val = null;
		driver.findElement(By.name("cusid")).getAttribute(val);
		boolean b=driver.findElement(By.name("cusid")).isDisplayed();
		System.out.println("is desplayed="+b);
		//Screenshot
		File f= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f , new File("E:\\selenium\\Screenshots\\Test.jpg"));
		//refresh,forward,back
		driver.navigate().refresh();
		
		Thread.sleep(20000);
  // driver.close();
 //  driver.quit();
	}

}
