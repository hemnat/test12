package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 

{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Setup Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/ajax.html");
		Thread.sleep(3000);

		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("no")).click();
			
		//Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();

		}
}

