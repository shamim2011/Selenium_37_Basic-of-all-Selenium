package Selenium37_Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javaPro_12 {

	public static void main(String[] args) {
//		try {
//			WebDriver driver= new ChromeDriver();
//			driver.get("https://iamsandesh23.github.io/selenium.github.io/");
//			driver.manage().window().maximize();
//			
//			// Using Thread for waiting mechanism
////			driver.findElement(By.className("dropbtn")).click();
////			Thread.sleep(5000);
////			driver.findElement(By.linkText("Facebook")).click();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
		
		/// implicit wait -  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("dropbtn")).click();
		driver.findElement(By.linkText("Facebook")).click();
		System.out.println("------------------------------------");
	}
}
