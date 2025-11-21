package Selenium37_Basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaPro_13 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/// Alert method
		driver.findElement(By.id("alert1")).click();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(5000);
		alert.accept();
		driver.close();
		System.out.println("------------------------------------");

	}
}
